package reprositrory;

import Vehicles.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepo {
    private Map<String , Vehicle> vehicleMap = new HashMap<>();
    public Optional<Vehicle> getVehicleByNo(String Number){
        if(vehicleMap.containsKey(Number)){
            return Optional.of(vehicleMap.get(Number));
        }
        return null;
    }
    public Vehicle saveVehicle(Vehicle vehicle){
        vehicleMap.put(vehicle.getVehicleNo(),vehicle);
        return vehicle;
    }
}
