package Billing;

import java.sql.Date;

public class Payment {
    private long ID;
    private PaymentMode mode;
    private int amount;  // int 2 = 2.0000000000  we store amount as int because of precision.
    //To store 20.23 -> 2023
    private Date exitTime;
    private PaymentStatus status;
    private String referenceNo;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getReference() {
        return referenceNo;
    }

    public void setReference(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}
