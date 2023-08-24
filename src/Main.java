import Controller.TicketController;
import DTOs.issueTicketRequestDto;
import DTOs.issueTicketResponseDto;
import Vehicles.VehicleType;
import reprositrory.GateRepo;
import reprositrory.TicketRepo;
import reprositrory.VehicleRepo;
import reprositrory.parkinglotRepo;
import services.TicketService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectRegistry objectRegistry = new ObjectRegistry();
        GateRepo gateRepo = new GateRepo();
        parkinglotRepo parkinglotRepo = new parkinglotRepo();
        TicketRepo ticketRepo = new TicketRepo();
        VehicleRepo vehicleRepo = new VehicleRepo();

        TicketService ticketService = new TicketService(
                gateRepo,
                vehicleRepo,
                parkinglotRepo,
                ticketRepo);
        TicketController ticketController = new TicketController(ticketService);
        System.out.println("Server listening at port 9000");
        objectRegistry.register("ticketRepository", ticketRepo);

        ///

        issueTicketRequestDto request = new issueTicketRequestDto();
        System.out.println("Enter Vehicle Number");
        String vehiclenumber = sc.next();
        request.setVehicleNo(vehiclenumber);
        System.out.println("Enter Vehicle type - Car / Bicycle");
        String vehicletype = sc.next();
        if(vehicletype.equals("car") || vehicletype.equals("Car") || vehicletype.equals("CAR")){
            request.setVehicleType(VehicleType.CAR);
        }
        else{
        request.setVehicleType(VehicleType.BICYCLE);
        }
        System.out.println("Enter Gate Id :");
        Long gateid = sc.nextLong();
        request.setGateID(gateid);

        issueTicketResponseDto response = ticketController.IssueTicket(request);

        // Do whatever you want to do based on response
    }
}


// Requirements:
// 1. Operator should be able to generate a ticket
// 2. Admin should be able to create a new parking lot

// MVC
// Controller
// Service
// Repository

// 1. Identify which model is the requirement around (CRUD)
//     - Ticket
// 2. Create controller, service and repository
//     - TicketController
//     - TicketService
//     - TicketRepository

//
// Implemented following requirements:
// 1. Create a ParkingLot
// 2. Add gates to a ParkingLot
// 3. Create an operator
// 4. Assign operator to a gate
// 5. [BUGFIX] ParkingSpot should become unavailable on assignment of ticket

