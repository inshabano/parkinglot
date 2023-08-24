package reprositrory;

import models.Gates;
import models.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class parkinglotRepo {
    private Map<Long, parkinglot> parkinglots = new HashMap<>();
    public parkinglot getParkingLotForGate(Gates gate){
        for(parkinglot parkingLot:parkinglots.values())
        if(parkingLot.getGates().contains(gate)){
            return parkingLot;
        }
        return null;
    }
}
