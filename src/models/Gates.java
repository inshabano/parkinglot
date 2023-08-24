package models;

public class Gates extends BaseModel{
    private GateType type;
    private int GateNo;
    private Operator operator;

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }


    public int getGateNo() {
        return GateNo;
    }

    public void setGateNo(int gateNo) {
        GateNo = gateNo;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
