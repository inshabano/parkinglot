package models;

import Vehicles.Vehicle;
import java.time.LocalDateTime;


public class Ticket extends BaseModel{
    private String number;
    private Vehicle vehicle;
   private LocalDateTime entryTime;
    private Slot slot;
    private Gates entryGate;
    private Operator generatedBy;

    public String getNumber() {
        return number;
    }



    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Gates getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gates entryGate) {
        this.entryGate = entryGate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }
}
