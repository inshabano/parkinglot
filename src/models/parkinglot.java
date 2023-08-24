package models;

import java.util.List;

public class parkinglot extends BaseModel{
    private String name;
    private List<Gates> gates;
    private List<ParkingFloor> floors;
    private SlotAllotment slotAllotment;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Gates> getGates() {
        return gates;
    }

    public void setGates(List<Gates> gates) {
        this.gates = gates;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }
    public SlotAllotment getSlotAllotment() {
        return slotAllotment;
    }

    public void setSlotAllotment(SlotAllotment slotAllotment) {
        this.slotAllotment = slotAllotment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
