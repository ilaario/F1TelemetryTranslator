package Packets;

public class LapData {
    private Integer bestLapNum;
    private Integer bestLapSector1TimeInMS;
    private Integer bestLapSector2TimeInMS;
    private Integer bestLapSector3TimeInMS;
    private Integer bestOverallSector1TimeInMS;
    private Integer bestOverallSector1LapNum;
    private Integer bestOverallSector2TimeInMS;
    private Integer bestOverallSector2LapNum;
    private Integer bestOverallSector3TimeInMS;
    private Integer bestOverallSector3LapNum;
    private float lastLapTime;
    private Integer lastLapTimeInMS;
    private float currentLapTime;
    private Integer currentLapTimeInMS;
    private float bestLapTime;
    private float sector1Time;
    private Integer sector1TimeInMS;
    private Integer sector1TimeMinutes;
    private float sector2Time;
    private Integer sector2TimeInMS;
    private Integer sector2TimeMinutes;
    private Integer deltaToCarInFrontInMS;
    private Integer deltaToRaceLeaderInMS;
    private double lapDistance;
    private double totalDistance;
    private double safetyCarDelta;
    private int carPosition;
    private int currentLapNum;
    private int pitStatus;
    private Integer numPitStops;
    private int sector;
    private int currentLapInvalid;
    private int penalties;
    private Integer warnings;
    private Integer totalWarnings;
    private Integer cornerCuttingWarnings;
    private Integer numUnservedDriveThroughPens;
    private Integer numUnservedStopGoPens;
    private int gridPosition;
    private int driverStatus;
    private int resultStatus;
    private Integer pitLaneTimerActive;
    private Integer pitLaneTimeInLaneInMS;
    private Integer pitStopTimerInMS;
    private Integer pitStopShouldServePen;

    // Getters and setters
    public Integer getM_bestLapNum() {
        return bestLapNum;
    }

    public void setM_bestLapNum(Integer bestLapNum) {
        this.bestLapNum = bestLapNum;
    }

    public Integer getM_bestLapSector1TimeInMS() {
        return bestLapSector1TimeInMS;
    }

    public void setM_bestLapSector1TimeInMS(Integer bestLapSector1TimeInMS) {
        this.bestLapSector1TimeInMS = bestLapSector1TimeInMS;
    }

    public Integer getM_bestLapSector2TimeInMS() {
        return bestLapSector2TimeInMS;
    }

    public void setM_bestLapSector2TimeInMS(Integer bestLapSector2TimeInMS) {
        this.bestLapSector2TimeInMS = bestLapSector2TimeInMS;
    }

    public Integer getM_bestLapSector3TimeInMS() {
        return bestLapSector3TimeInMS;
    }

    public void setM_bestLapSector3TimeInMS(Integer bestLapSector3TimeInMS) {
        this.bestLapSector3TimeInMS = bestLapSector3TimeInMS;
    }

    public Integer getM_bestOverallSector1TimeInMS() {
        return bestOverallSector1TimeInMS;
    }

    public void setM_bestOverallSector1TimeInMS(Integer bestOverallSector1TimeInMS) {
        this.bestOverallSector1TimeInMS = bestOverallSector1TimeInMS;
    }

    public Integer getM_bestOverallSector1LapNum() {
        return bestOverallSector1LapNum;
    }

    public void setM_bestOverallSector1LapNum(Integer bestOverallSector1LapNum) {
        this.bestOverallSector1LapNum = bestOverallSector1LapNum;
    }

    public Integer getM_bestOverallSector2TimeInMS() {
        return bestOverallSector2TimeInMS;
    }

    public void setM_bestOverallSector2TimeInMS(Integer bestOverallSector2TimeInMS) {
        this.bestOverallSector2TimeInMS = bestOverallSector2TimeInMS;
    }

    public Integer getM_bestOverallSector2LapNum() {
        return bestOverallSector2LapNum;
    }

    public void setM_bestOverallSector2LapNum(Integer bestOverallSector2LapNum) {
        this.bestOverallSector2LapNum = bestOverallSector2LapNum;
    }

    public Integer getM_bestOverallSector3TimeInMS() {
        return bestOverallSector3TimeInMS;
    }

    public void setM_bestOverallSector3TimeInMS(Integer bestOverallSector3TimeInMS) {
        this.bestOverallSector3TimeInMS = bestOverallSector3TimeInMS;
    }

    public Integer getM_bestOverallSector3LapNum() {
        return bestOverallSector3LapNum;
    }

    public void setM_bestOverallSector3LapNum(Integer bestOverallSector3LapNum) {
        this.bestOverallSector3LapNum = bestOverallSector3LapNum;
    }

    public float getM_lastLapTime() {
        return lastLapTime;
    }

    public void setM_lastLapTime(float lastLapTime) {
        this.lastLapTime = lastLapTime;
    }

    public Integer getM_lastLapTimeInMS() {
        return lastLapTimeInMS;
    }

    public void setM_lastLapTimeInMS(Integer lastLapTimeInMS) {
        this.lastLapTimeInMS = lastLapTimeInMS;
    }

    public float getM_currentLapTime() {
        return currentLapTime;
    }

    public void setM_currentLapTime(float currentLapTime) {
        this.currentLapTime = currentLapTime;
    }

    public Integer getM_currentLapTimeInMS() {
        return currentLapTimeInMS;
    }

    public void setM_currentLapTimeInMS(Integer currentLapTimeInMS) {
        this.currentLapTimeInMS = currentLapTimeInMS;
    }

    public float getM_bestLapTime() {
        return bestLapTime;
    }

    public void setM_bestLapTime(float bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    public float getM_sector1Time() {
        return sector1Time;
    }

    public void setM_sector1Time(float sector1Time) {
        this.sector1Time = sector1Time;
    }

    public Integer getM_sector1TimeInMS() {
        return sector1TimeInMS;
    }

    public void setM_sector1TimeInMS(Integer sector1TimeInMS) {
        this.sector1TimeInMS = sector1TimeInMS;
    }

    public Integer getM_sector1TimeMinutes() {
        return sector1TimeMinutes;
    }

    public void setM_sector1TimeMinutes(Integer sector1TimeMinutes) {
        this.sector1TimeMinutes = sector1TimeMinutes;
    }

    public float getM_sector2Time() {
        return sector2Time;
    }

    public void setM_sector2Time(float sector2Time) {
        this.sector2Time = sector2Time;
    }

    public Integer getM_sector2TimeInMS() {
        return sector2TimeInMS;
    }

    public void setM_sector2TimeInMS(Integer sector2TimeInMS) {
        this.sector2TimeInMS = sector2TimeInMS;
    }

    public Integer getM_sector2TimeMinutes() {
        return sector2TimeMinutes;
    }

    public void setM_sector2TimeMinutes(Integer sector2TimeMinutes) {
        this.sector2TimeMinutes = sector2TimeMinutes;
    }

    public Integer getM_deltaToCarInFrontInMS() {
        return deltaToCarInFrontInMS;
    }

    public void setM_deltaToCarInFrontInMS(Integer deltaToCarInFrontInMS) {
        this.deltaToCarInFrontInMS = deltaToCarInFrontInMS;
    }

    public Integer getM_deltaToRaceLeaderInMS() {
        return deltaToRaceLeaderInMS;
    }

    public void setM_deltaToRaceLeaderInMS(Integer deltaToRaceLeaderInMS) {
        this.deltaToRaceLeaderInMS = deltaToRaceLeaderInMS;
    }

    public double getM_lapDistance() {
        return lapDistance;
    }

    public void setM_lapDistance(double lapDistance) {
        this.lapDistance = lapDistance;
    }

    public double getM_totalDistance() {
        return totalDistance;
    }

    public void setM_totalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getM_safetyCarDelta() {
        return safetyCarDelta;
    }

    public void setM_safetyCarDelta(double safetyCarDelta) {
        this.safetyCarDelta = safetyCarDelta;
    }

    public int getM_carPosition() {
        return carPosition;
    }

    public void setM_carPosition(int carPosition) {
        this.carPosition = carPosition;
    }

    public int getM_currentLapNum() {
        return currentLapNum;
    }

    public void setM_currentLapNum(int currentLapNum) {
        this.currentLapNum = currentLapNum;
    }

    public int getM_pitStatus() {
        return pitStatus;
    }

    public void setM_pitStatus(int pitStatus) {
        this.pitStatus = pitStatus;
    }

    public Integer getM_numPitStops() {
        return numPitStops;
    }

    public void setM_numPitStops(Integer numPitStops) {
        this.numPitStops = numPitStops;
    }

    public int getM_sector() {
        return sector;
    }

    public void setM_sector(int sector) {
        this.sector = sector;
    }

    public int getM_currentLapInvalid() {
        return currentLapInvalid;
    }

    public void setM_currentLapInvalid(int currentLapInvalid) {
        this.currentLapInvalid = currentLapInvalid;
    }

    public int getM_penalties() {
        return penalties;
    }

    public void setM_penalties(int penalties) {
        this.penalties = penalties;
    }

    public Integer getM_warnings() {
        return warnings;
    }

    public void setM_warnings(Integer warnings) {
        this.warnings = warnings;
    }

    public Integer getM_totalWarnings() {
        return totalWarnings;
    }

    public void setM_totalWarnings(Integer totalWarnings) {
        this.totalWarnings = totalWarnings;
    }

    public Integer getM_cornerCuttingWarnings() {
        return cornerCuttingWarnings;
    }

    public void setM_cornerCuttingWarnings(Integer cornerCuttingWarnings) {
        this.cornerCuttingWarnings = cornerCuttingWarnings;
    }

    public Integer getM_numUnservedDriveThroughPens() {
        return numUnservedDriveThroughPens;
    }

    public void setM_numUnservedDriveThroughPens(Integer numUnservedDriveThroughPens) {
        this.numUnservedDriveThroughPens = numUnservedDriveThroughPens;
    }

    public Integer getM_numUnservedStopGoPens() {
        return numUnservedStopGoPens;
    }

    public void setM_numUnservedStopGoPens(Integer numUnservedStopGoPens) {
        this.numUnservedStopGoPens = numUnservedStopGoPens;
    }

    public int getM_gridPosition() {
        return gridPosition;
    }

    public void setM_gridPosition(int gridPosition) {
        this.gridPosition = gridPosition;
    }

    public int getM_driverStatus() {
        return driverStatus;
    }

    public void setM_driverStatus(int driverStatus) {
        this.driverStatus = driverStatus;
    }

    public int getM_resultStatus() {
        return resultStatus;
    }

    public void setM_resultStatus(int resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Integer getM_pitLaneTimerActive() {
        return pitLaneTimerActive;
    }

    public void setM_pitLaneTimerActive(Integer pitLaneTimerActive) {
        this.pitLaneTimerActive = pitLaneTimerActive;
    }

    public Integer getM_pitLaneTimeInLaneInMS() {
        return pitLaneTimeInLaneInMS;
    }

    public void setM_pitLaneTimeInLaneInMS(Integer pitLaneTimeInLaneInMS) {
        this.pitLaneTimeInLaneInMS = pitLaneTimeInLaneInMS;
    }

    public Integer getM_pitStopTimerInMS() {
        return pitStopTimerInMS;
    }

    public void setM_pitStopTimerInMS(Integer pitStopTimerInMS) {
        this.pitStopTimerInMS = pitStopTimerInMS;
    }

    public Integer getM_pitStopShouldServePen() {
        return pitStopShouldServePen;
    }

    public void setM_pitStopShouldServePen(Integer pitStopShouldServePen) {
        this.pitStopShouldServePen = pitStopShouldServePen;
    }

    // toString method
    @Override
    public String toString() {
        return "LapData{" +
                "bestLapNum=" + bestLapNum +
                ", bestLapSector1TimeInMS=" + bestLapSector1TimeInMS +
                ", bestLapSector2TimeInMS=" + bestLapSector2TimeInMS +
                ", bestLapSector3TimeInMS=" + bestLapSector3TimeInMS +
                ", bestOverallSector1TimeInMS=" + bestOverallSector1TimeInMS +
                ", bestOverallSector1LapNum=" + bestOverallSector1LapNum +
                ", bestOverallSector2TimeInMS=" + bestOverallSector2TimeInMS +
                ", bestOverallSector2LapNum=" + bestOverallSector2LapNum +
                ", bestOverallSector3TimeInMS=" + bestOverallSector3TimeInMS +
                ", bestOverallSector3LapNum=" + bestOverallSector3LapNum +
                ", lastLapTime=" + lastLapTime +
                ", lastLapTimeInMS=" + lastLapTimeInMS +
                ", currentLapTime=" + currentLapTime +
                ", currentLapTimeInMS=" + currentLapTimeInMS +
                ", bestLapTime=" + bestLapTime +
                ", sector1Time=" + sector1Time +
                ", sector1TimeInMS=" + sector1TimeInMS +
                ", sector1TimeMinutes=" + sector1TimeMinutes +
                ", sector2Time=" + sector2Time +
                ", sector2TimeInMS=" + sector2TimeInMS +
                ", sector2TimeMinutes=" + sector2TimeMinutes +
                ", deltaToCarInFrontInMS=" + deltaToCarInFrontInMS +
                ", deltaToRaceLeaderInMS=" + deltaToRaceLeaderInMS +
                ", lapDistance=" + lapDistance +
                ", totalDistance=" + totalDistance +
                ", safetyCarDelta=" + safetyCarDelta +
                ", carPosition=" + carPosition +
                ", currentLapNum=" + currentLapNum +
                ", pitStatus=" + pitStatus +
                ", numPitStops=" + numPitStops +
                ", sector=" + sector +
                ", currentLapInvalid=" + currentLapInvalid +
                ", penalties=" + penalties +
                ", warnings=" + warnings +
                ", totalWarnings=" + totalWarnings +
                ", cornerCuttingWarnings=" + cornerCuttingWarnings +
                ", numUnservedDriveThroughPens=" + numUnservedDriveThroughPens +
                ", numUnservedStopGoPens=" + numUnservedStopGoPens +
                ", gridPosition=" + gridPosition +
                ", driverStatus=" + driverStatus +
                ", resultStatus=" + resultStatus +
                ", pitLaneTimerActive=" + pitLaneTimerActive +
                ", pitLaneTimeInLaneInMS=" + pitLaneTimeInLaneInMS +
                ", pitStopTimerInMS=" + pitStopTimerInMS +
                ", pitStopShouldServePen=" + pitStopShouldServePen +
                '}';
    }
}
