package Packets;

public class OvertakeEventDetails {
    private int beingOvertakenVehicleIdx;
    private int overtakingVehicleIdx;

    // Getter and Setter
    public int getBeingOvertakenVehicleIdx() {
        return beingOvertakenVehicleIdx;
    }

    public void setBeingOvertakenVehicleIdx(int beingOvertakenVehicleIdx) {
        this.beingOvertakenVehicleIdx = beingOvertakenVehicleIdx;
    }

    public int getOvertakingVehicleIdx() {
        return overtakingVehicleIdx;
    }

    public void setOvertakingVehicleIdx(int overtakingVehicleIdx) {
        this.overtakingVehicleIdx = overtakingVehicleIdx;
    }

    // Constructor
    public OvertakeEventDetails(int beingOvertakenVehicleIdx, int overtakingVehicleIdx) {
        this.beingOvertakenVehicleIdx = beingOvertakenVehicleIdx;
        this.overtakingVehicleIdx = overtakingVehicleIdx;
    }

    public OvertakeEventDetails() {
        this.beingOvertakenVehicleIdx = 0;
        this.overtakingVehicleIdx = 0;
    }

    // toString
    @Override
    public String toString() {
        return "OvertakeEventDetails{" +
                "beingOvertakenVehicleIdx=" + beingOvertakenVehicleIdx +
                ", overtakingVehicleIdx=" + overtakingVehicleIdx +
                '}';
    }
}
