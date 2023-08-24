package DTOs;

import Vehicles.VehicleType;

public class issueTicketRequestDto {
    private VehicleType vehicleType;
    private String vehicleNo;
    private String vehicleOwnerName;
    private Long gateID;
    private String token;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public Long getGateID() {
        return gateID;
    }

    public void setGateID(Long gateID) {
        this.gateID = gateID;
    }
}
