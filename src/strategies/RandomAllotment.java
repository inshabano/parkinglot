package strategies;

import Vehicles.VehicleType;
import models.Gates;
import models.ParkingSlotStatus;
import models.Slot;
import models.parkinglot;
import reprositrory.parkinglotRepo;

import java.util.List;

public class RandomAllotment implements SlotAssignmentStrategy{
    private parkinglotRepo parkingLotRepository;
    public RandomAllotment(parkinglotRepo parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }
    @Override
    public Slot getSlot(Gates gate, VehicleType vehicleType) {

        parkinglot parkingLot = parkingLotRepository.getParkingLotForGate(gate);
        List<Slot> parkingSlot =
       for (Slot parkingSpot: parkingSlot) {
          if (parkingSpot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE) && parkingSpot.getVehicleType().contains(vehicleType)) {
              return parkingSpot;
           }        }
        return null;
    }
}
