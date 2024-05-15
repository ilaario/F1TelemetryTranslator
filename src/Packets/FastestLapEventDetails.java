package Packets;

public class FastestLapEventDetails extends VehicleEventDetails{
    private float lapTime;

    public FastestLapEventDetails(float lapTime) {
        this.lapTime = lapTime;
    }

    public FastestLapEventDetails() {
    }

    @Override
    public void setEventDetails(Object parsed) {
        if (parsed instanceof FastestLapEventDetails fastLap) {
            this.setVehicleIdx(fastLap.getVehicleIdx());
            this.lapTime = fastLap.getLapTime();
        }
    }

    public float getLapTime() {
        return lapTime;
    }

    public void setLapTime(float lapTime) {
        this.lapTime = lapTime;
    }

    @Override
    public String toString() {
        return "FastestLapEventDetails{" +
                "lapTime=" + lapTime +
                '}';
    }
}
