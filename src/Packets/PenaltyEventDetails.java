package Packets;

public class PenaltyEventDetails extends VehicleEventDetails{
    private int penaltyType;
    private int infringementType;
    private int otherVehicleIdx;
    private int time;
    private int lapNum;
    private int placesGained;

    // Getter and Setter
    public int getPenaltyType() {
        return penaltyType;
    }

    public void setPenaltyType(int penaltyType) {
        this.penaltyType = penaltyType;
    }

    public int getInfringementType() {
        return infringementType;
    }

    public void setInfringementType(int infringementType) {
        this.infringementType = infringementType;
    }

    public int getOtherVehicleIdx() {
        return otherVehicleIdx;
    }

    public void setOtherVehicleIdx(int otherVehicleIdx) {
        this.otherVehicleIdx = otherVehicleIdx;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLapNum() {
        return lapNum;
    }

    public void setLapNum(int lapNum) {
        this.lapNum = lapNum;
    }

    public int getPlacesGained() {
        return placesGained;
    }

    public void setPlacesGained(int placesGained) {
        this.placesGained = placesGained;
    }

    public PenaltyEventDetails(int penaltyType, int infringementType, int otherVehicleIdx, int time, int lapNum, int placesGained) {
        this.penaltyType = penaltyType;
        this.infringementType = infringementType;
        this.otherVehicleIdx = otherVehicleIdx;
        this.time = time;
        this.lapNum = lapNum;
        this.placesGained = placesGained;
    }

    public PenaltyEventDetails() {
        this.penaltyType = 0;
        this.infringementType = 0;
        this.otherVehicleIdx = 0;
        this.time = 0;
        this.lapNum = 0;
        this.placesGained = 0;
    }

    public PenaltyEventDetails(PenaltyEventDetails ped) {
        this.penaltyType = ped.penaltyType;
        this.infringementType = ped.infringementType;
        this.otherVehicleIdx = ped.otherVehicleIdx;
        this.time = ped.time;
        this.lapNum = ped.lapNum;
        this.placesGained = ped.placesGained;
    }

    public void copy(PenaltyEventDetails ped) {
        this.penaltyType = ped.penaltyType;
        this.infringementType = ped.infringementType;
        this.otherVehicleIdx = ped.otherVehicleIdx;
        this.time = ped.time;
        this.lapNum = ped.lapNum;
        this.placesGained = ped.placesGained;
    }

    public void reset() {
        this.penaltyType = 0;
        this.infringementType = 0;
        this.otherVehicleIdx = 0;
        this.time = 0;
        this.lapNum = 0;
        this.placesGained = 0;
    }

    @Override
    public void setEventDetails(Object parsed){
        if(parsed instanceof PenaltyEventDetails ped){
            this.penaltyType = ped.penaltyType;
            this.infringementType = ped.infringementType;
            this.otherVehicleIdx = ped.otherVehicleIdx;
            this.time = ped.time;
            this.lapNum = ped.lapNum;
            this.placesGained = ped.placesGained;
        }
    }

    public boolean isNull() {
        return this.penaltyType == 0 && this.infringementType == 0 && this.otherVehicleIdx == 0 && this.time == 0 && this.lapNum == 0 && this.placesGained == 0;
    }

    public boolean equals(PenaltyEventDetails ped) {
        return this.penaltyType == ped.penaltyType && this.infringementType == ped.infringementType && this.otherVehicleIdx == ped.otherVehicleIdx && this.time == ped.time && this.lapNum == ped.lapNum && this.placesGained == ped.placesGained;
    }

    public String toString() {
        return "PenaltyEventDetails: penaltyType=" + this.penaltyType + ", infringementType=" + this.infringementType + ", otherVehicleIdx=" + this.otherVehicleIdx + ", time=" + this.time + ", lapNum=" + this.lapNum + ", placesGained=" + this.placesGained;
    }
}
