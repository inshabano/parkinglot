package services;

import Exceptions.WrongGateID;
import Vehicles.Vehicle;
import Vehicles.VehicleType;
import models.Gates;
import models.SlotAllotment;
import models.Ticket;
import reprositrory.GateRepo;
import reprositrory.TicketRepo;
import reprositrory.VehicleRepo;
import reprositrory.parkinglotRepo;
import strategies.SlotAssignmentFactory;
import strategies.SlotAssignmentStrategy;

import java.sql.Date;
import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Optional;

public class TicketService {

    private GateRepo gateRepo;
    private VehicleRepo vehicleRepo;
    private parkinglotRepo parkinglotRepo;
    private TicketRepo ticketRepo;

    public TicketService(
            GateRepo gateRepo,
            VehicleRepo vehicleRepo,
            parkinglotRepo parkinglotRepo,
            TicketRepo ticketRepo
    ){
        this.gateRepo = gateRepo;
        this.ticketRepo = ticketRepo;
        this.parkinglotRepo = parkinglotRepo;
        this.vehicleRepo = vehicleRepo;
    }
    public Ticket issueTicket(VehicleType vehicleType,           //we should keep our services generic
                              String vehicleNo,                  //client will be not directly interacting with ticket service so, in future we can change it
                              String vehicleOwnerName,
                              Long gateID) throws WrongGateID {
          Ticket ticket = new Ticket();
        LocalDateTime myObj = LocalDateTime.now();
        ticket.setEntryTime(myObj);
          Optional<Gates> gateOP = gateRepo.findGateID(gateID);
          if(gateOP.isEmpty()){
               throw new WrongGateID("Invalid Gate ID");
          }
          Gates gate = gateOP.get();
          ticket.setEntryGate(gate);
          ticket.setGeneratedBy(gate.getOperator());
          Vehicle savedvehicle;
          Optional<Vehicle> vehicleOptional = vehicleRepo.getVehicleByNo(vehicleNo);
          if(vehicleOptional.isEmpty()){
              Vehicle vehicle = new Vehicle();
              vehicle.setVehicleNo(vehicleNo);
              vehicle.setVehicleType(vehicleType);
              vehicle.setOwnerName(vehicleOwnerName);
              savedvehicle = vehicleRepo.saveVehicle(vehicle);
          }
          else{
              savedvehicle = vehicleOptional.get();
          }
          ticket.setVehicle(savedvehicle);
        SlotAllotment slotAllotment = parkinglotRepo.
                getParkingLotForGate(gate).getSlotAllotment();

        SlotAssignmentStrategy slotAssignmentStrategy =
                SlotAssignmentFactory.getSlotfor(slotAllotment);

        ticket.setSlot(slotAssignmentStrategy.getSlot(gate,vehicleType));

        ticket.setNumber("Ticket - " +ticket.getId());       //     Or generate a UUID

        return ticketRepo.saveTicket(ticket);
    }
}
