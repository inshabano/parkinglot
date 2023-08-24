package strategies;

import models.SlotAllotment;
import reprositrory.SlotRepo;
import reprositrory.parkinglotRepo;

public class SlotAssignmentFactory {
    private static parkinglotRepo parkinglotRepo;
    private SlotRepo slotRepo;


    public static SlotAssignmentStrategy getSlotfor(SlotAllotment slotAllotment){
             return new RandomAllotment(parkinglotRepo);
    }
}
