package Packets;

public class LapHistoryData {
    private int m_lapTimeInMS;
    private int m_sector1TimeInMS;
    private Integer m_sector1TimeMinutes; // Optional
    private int m_sector2TimeInMS;
    private Integer m_sector2TimeMinutes; // Optional
    private int m_sector3TimeInMS;
    private Integer m_sector3TimeMinutes; // Optional
    private int m_lapValidBitFlags;

    // Getters and setters for all fields
    public int getM_lapTimeInMS() {
        return m_lapTimeInMS;
    }

    public void setM_lapTimeInMS(int m_lapTimeInMS) {
        this.m_lapTimeInMS = m_lapTimeInMS;
    }

    public int getM_sector1TimeInMS() {
        return m_sector1TimeInMS;
    }

    public void setM_sector1TimeInMS(int m_sector1TimeInMS) {
        this.m_sector1TimeInMS = m_sector1TimeInMS;
    }

    public Integer getM_sector1TimeMinutes() {
        return m_sector1TimeMinutes;
    }

    public void setM_sector1TimeMinutes(Integer m_sector1TimeMinutes) {
        this.m_sector1TimeMinutes = m_sector1TimeMinutes;
    }

    public int getM_sector2TimeInMS() {
        return m_sector2TimeInMS;
    }

    public void setM_sector2TimeInMS(int m_sector2TimeInMS) {
        this.m_sector2TimeInMS = m_sector2TimeInMS;
    }

    public Integer getM_sector2TimeMinutes() {
        return m_sector2TimeMinutes;
    }

    public void setM_sector2TimeMinutes(Integer m_sector2TimeMinutes) {
        this.m_sector2TimeMinutes = m_sector2TimeMinutes;
    }

    public int getM_sector3TimeInMS() {
        return m_sector3TimeInMS;
    }

    public void setM_sector3TimeInMS(int m_sector3TimeInMS) {
        this.m_sector3TimeInMS = m_sector3TimeInMS;
    }

    public Integer getM_sector3TimeMinutes() {
        return m_sector3TimeMinutes;
    }

    public void setM_sector3TimeMinutes(Integer m_sector3TimeMinutes) {
        this.m_sector3TimeMinutes = m_sector3TimeMinutes;
    }

    public int getM_lapValidBitFlags() {
        return m_lapValidBitFlags;
    }

    public void setM_lapValidBitFlags(int m_lapValidBitFlags) {
        this.m_lapValidBitFlags = m_lapValidBitFlags;
    }

    // toString method
    @Override
    public String toString() {
        return "LapHistoryData{" +
                "m_lapTimeInMS=" + m_lapTimeInMS +
                ", m_sector1TimeInMS=" + m_sector1TimeInMS +
                ", m_sector1TimeMinutes=" + m_sector1TimeMinutes +
                ", m_sector2TimeInMS=" + m_sector2TimeInMS +
                ", m_sector2TimeMinutes=" + m_sector2TimeMinutes +
                ", m_sector3TimeInMS=" + m_sector3TimeInMS +
                ", m_sector3TimeMinutes=" + m_sector3TimeMinutes +
                ", m_lapValidBitFlags=" + m_lapValidBitFlags +
                '}';
    }
}

