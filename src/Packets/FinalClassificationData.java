package Packets;

import java.util.Arrays;

public class FinalClassificationData {
    private int m_position;
    private int m_numLaps;
    private int m_gridPosition;
    private int m_points;
    private int m_numPitStops;
    private int m_resultStatus;
    private float m_bestLapTime; // Optional
    private Integer m_bestLapTimeInMS; // Optional
    private double m_totalRaceTime;
    private int m_penaltiesTime;
    private int m_numPenalties;
    private int m_numTyreStints;
    private byte[] m_tyreStintsActual;
    private byte[] m_tyreStintsVisual;
    private byte[] m_tyreStintsEndLaps; // Optional

    // Getters and setters would be implemented here

    public int getM_position() {
        return m_position;
    }

    public void setM_position(int m_position) {
        this.m_position = m_position;
    }

    public int getM_numLaps() {
        return m_numLaps;
    }

    public void setM_numLaps(int m_numLaps) {
        this.m_numLaps = m_numLaps;
    }

    public int getM_gridPosition() {
        return m_gridPosition;
    }

    public void setM_gridPosition(int m_gridPosition) {
        this.m_gridPosition = m_gridPosition;
    }

    public int getM_points() {
        return m_points;
    }

    public void setM_points(int m_points) {
        this.m_points = m_points;
    }

    public int getM_numPitStops() {
        return m_numPitStops;
    }

    public void setM_numPitStops(int m_numPitStops) {
        this.m_numPitStops = m_numPitStops;
    }

    public int getM_resultStatus() {
        return m_resultStatus;
    }

    public void setM_resultStatus(int m_resultStatus) {
        this.m_resultStatus = m_resultStatus;
    }

    public float getM_bestLapTime() {
        return m_bestLapTime;
    }

    public void setM_bestLapTime(float m_bestLapTime) {
        this.m_bestLapTime = m_bestLapTime;
    }

    public Integer getM_bestLapTimeInMS() {
        return m_bestLapTimeInMS;
    }

    public void setM_bestLapTimeInMS(Integer m_bestLapTimeInMS) {
        this.m_bestLapTimeInMS = m_bestLapTimeInMS;
    }

    public double getM_totalRaceTime() {
        return m_totalRaceTime;
    }

    public void setM_totalRaceTime(double m_totalRaceTime) {
        this.m_totalRaceTime = m_totalRaceTime;
    }

    public int getM_penaltiesTime() {
        return m_penaltiesTime;
    }

    public void setM_penaltiesTime(int m_penaltiesTime) {
        this.m_penaltiesTime = m_penaltiesTime;
    }

    public int getM_numPenalties() {
        return m_numPenalties;
    }

    public void setM_numPenalties(int m_numPenalties) {
        this.m_numPenalties = m_numPenalties;
    }

    public int getM_numTyreStints() {
        return m_numTyreStints;
    }

    public void setM_numTyreStints(int m_numTyreStints) {
        this.m_numTyreStints = m_numTyreStints;
    }

    public byte[] getM_tyreStintsActual() {
        return m_tyreStintsActual;
    }

    public void setM_tyreStintsActual(byte[] m_tyreStintsActual) {
        this.m_tyreStintsActual = m_tyreStintsActual;
    }

    public byte[] getM_tyreStintsVisual() {
        return m_tyreStintsVisual;
    }

    public void setM_tyreStintsVisual(byte[] m_tyreStintsVisual) {
        this.m_tyreStintsVisual = m_tyreStintsVisual;
    }

    public byte[] getM_tyreStintsEndLaps() {
        return m_tyreStintsEndLaps;
    }

    public void setM_tyreStintsEndLaps(byte[] m_tyreStintsEndLaps) {
        this.m_tyreStintsEndLaps = m_tyreStintsEndLaps;
    }

    public FinalClassificationData(int m_position, int m_numLaps, int m_gridPosition, int m_points, int m_numPitStops, int m_resultStatus, float m_bestLapTime, Integer m_bestLapTimeInMS, double m_totalRaceTime, int m_penaltiesTime, int m_numPenalties, int m_numTyreStints, byte[] m_tyreStintsActual, byte[] m_tyreStintsVisual, byte[] m_tyreStintsEndLaps) {
        this.m_position = m_position;
        this.m_numLaps = m_numLaps;
        this.m_gridPosition = m_gridPosition;
        this.m_points = m_points;
        this.m_numPitStops = m_numPitStops;
        this.m_resultStatus = m_resultStatus;
        this.m_bestLapTime = m_bestLapTime;
        this.m_bestLapTimeInMS = m_bestLapTimeInMS;
        this.m_totalRaceTime = m_totalRaceTime;
        this.m_penaltiesTime = m_penaltiesTime;
        this.m_numPenalties = m_numPenalties;
        this.m_numTyreStints = m_numTyreStints;
        this.m_tyreStintsActual = m_tyreStintsActual;
        this.m_tyreStintsVisual = m_tyreStintsVisual;
        this.m_tyreStintsEndLaps = m_tyreStintsEndLaps;
    }

    public FinalClassificationData() {
    }

    @Override
    public String toString() {
        return "FinalClassificationData{" +
                "m_position=" + m_position +
                ", m_numLaps=" + m_numLaps +
                ", m_gridPosition=" + m_gridPosition +
                ", m_points=" + m_points +
                ", m_numPitStops=" + m_numPitStops +
                ", m_resultStatus=" + m_resultStatus +
                ", m_bestLapTime=" + m_bestLapTime +
                ", m_bestLapTimeInMS=" + m_bestLapTimeInMS +
                ", m_totalRaceTime=" + m_totalRaceTime +
                ", m_penaltiesTime=" + m_penaltiesTime +
                ", m_numPenalties=" + m_numPenalties +
                ", m_numTyreStints=" + m_numTyreStints +
                ", m_tyreStintsActual=" + Arrays.toString(m_tyreStintsActual) +
                ", m_tyreStintsVisual=" + Arrays.toString(m_tyreStintsVisual) +
                ", m_tyreStintsEndLaps=" + Arrays.toString(m_tyreStintsEndLaps) +
                '}';
    }
}

