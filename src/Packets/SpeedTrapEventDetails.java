package Packets;

public class SpeedTrapEventDetails extends VehicleEventDetails {
    private double speed;  // Use double for floating point precision if necessary
    private int isOverallFastestInSession;
    private int isDriverFastestInSession;
    private int fastestVehicleIdxInSession;
    private double fastestSpeedInSession;

    // Constructor
    public SpeedTrapEventDetails(double speed, int isOverallFastestInSession, int isDriverFastestInSession, int fastestVehicleIdxInSession, double fastestSpeedInSession) {
        this.speed = speed;
        this.isOverallFastestInSession = isOverallFastestInSession;
        this.isDriverFastestInSession = isDriverFastestInSession;
        this.fastestVehicleIdxInSession = fastestVehicleIdxInSession;
        this.fastestSpeedInSession = fastestSpeedInSession;
    }

    public SpeedTrapEventDetails() {
    }

    @Override
    public void setEventDetails(Object parsed) {
        if (parsed instanceof SpeedTrapEventDetails casted) {
            this.speed = casted.speed;
            this.isOverallFastestInSession = casted.isOverallFastestInSession;
            this.isDriverFastestInSession = casted.isDriverFastestInSession;
            this.fastestVehicleIdxInSession = casted.fastestVehicleIdxInSession;
            this.fastestSpeedInSession = casted.fastestSpeedInSession;
        }
    }

    // Getters
    public double getSpeed() {
        return speed;
    }

    public int getIsOverallFastestInSession() {
        return isOverallFastestInSession;
    }

    public int getIsDriverFastestInSession() {
        return isDriverFastestInSession;
    }

    public int getFastestVehicleIdxInSession() {
        return fastestVehicleIdxInSession;
    }

    public double getFastestSpeedInSession() {
        return fastestSpeedInSession;
    }

    // Setters

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setIsOverallFastestInSession(int isOverallFastestInSession) {
        this.isOverallFastestInSession = isOverallFastestInSession;
    }

    public void setIsDriverFastestInSession(int isDriverFastestInSession) {
        this.isDriverFastestInSession = isDriverFastestInSession;
    }

    public void setFastestVehicleIdxInSession(int fastestVehicleIdxInSession) {
        this.fastestVehicleIdxInSession = fastestVehicleIdxInSession;
    }

    public void setFastestSpeedInSession(double fastestSpeedInSession) {
        this.fastestSpeedInSession = fastestSpeedInSession;
    }

    // toString
    @Override
    public String toString() {
        return "SpeedTrapEventDetails{" +
                "speed=" + speed +
                ", isOverallFastestInSession=" + isOverallFastestInSession +
                ", isDriverFastestInSession=" + isDriverFastestInSession +
                ", fastestVehicleIdxInSession=" + fastestVehicleIdxInSession +
                ", fastestSpeedInSession=" + fastestSpeedInSession +
                '}';
    }

}
