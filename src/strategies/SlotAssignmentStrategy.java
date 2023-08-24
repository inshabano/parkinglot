package strategies;

import Vehicles.VehicleType;
import models.Gates;
import models.Slot;

public interface SlotAssignmentStrategy {
    public Slot getSlot(Gates gate, VehicleType vehicleType);

}
