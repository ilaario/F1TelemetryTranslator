package Packets;

public abstract class VehicleEventDetails {
    private int vehicleIdx;

    public VehicleEventDetails() {
        vehicleIdx = 0;
    }

    public int getVehicleIdx() {
        return vehicleIdx;
    }

    public void setVehicleIdx(int veicleIdx) {
        this.vehicleIdx = veicleIdx;
    }

    public abstract void setEventDetails(Object parsed);
}
