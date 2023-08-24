package reprositrory;

import Vehicles.VehicleType;
import models.Slot;
import models.Ticket;
import models.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class SlotRepo {
    private Map<Integer, Slot> slots = new HashMap<>();
    private  int priviousSlot = 0;
    public Slot getParkingSlotByLot(parkinglot parkinglot){
       Slot slot = slots.get(priviousSlot +1);
        return slot;
    }
}
