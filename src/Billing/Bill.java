package Billing;

import models.BaseModel;
import models.Gates;
import models.Operator;
import models.Ticket;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
      private Ticket ticket;
      private Date exitTime;
      private int amount;
      private Operator operator;
      private Gates gate;
      private List<Payment> payments;


      public Ticket getTicket() {
            return ticket;
      }

      public void setTicket(Ticket ticket) {
            this.ticket = ticket;
      }

      public Date getExitTime() {
            return exitTime;
      }

      public void setExitTime(Date exitTime) {
            this.exitTime = exitTime;
      }

      public int getAmount() {
            return amount;
      }

      public void setAmount(int amount) {
            this.amount = amount;
      }

      public Operator getOperator() {
            return operator;
      }

      public void setOperator(Operator operator) {
            this.operator = operator;
      }

      public Gates getGate() {
            return gate;
      }

      public void setGate(Gates gate) {
            this.gate = gate;
      }

      public List<Payment> getPayments() {
            return payments;
      }

      public void setPayments(List<Payment> payments) {
            this.payments = payments;
      }
      
}
