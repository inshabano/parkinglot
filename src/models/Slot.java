package models;

import Vehicles.Vehicle;
import Vehicles.VehicleType;

import java.util.List;

public class Slot extends BaseModel{

    private List<VehicleType> VehicleType;
    private String OwnerName;
    private String VehicleNo;
    private ParkingSlotStatus parkingSlotStatus;
    private  int slotNo;
    private ParkingFloor parkingFloor;


    public List<Vehicles.VehicleType> getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(List<Vehicles.VehicleType> vehicleType) {
        VehicleType = vehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }
}
