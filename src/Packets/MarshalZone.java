package Packets;

public class MarshalZone {
    private double m_zoneStart;
    private int m_zoneFlag;

    // Getters and setters
    public double getM_zoneStart() {
        return m_zoneStart;
    }

    public void setM_zoneStart(double m_zoneStart) {
        this.m_zoneStart = m_zoneStart;
    }

    public int getM_zoneFlag() {
        return m_zoneFlag;
    }

    public void setM_zoneFlag(int m_zoneFlag) {
        this.m_zoneFlag = m_zoneFlag;
    }

    // toString
    @Override
    public String toString() {
        return "MarshalZone{" +
                "m_zoneStart=" + m_zoneStart +
                ", m_zoneFlag=" + m_zoneFlag +
                '}';
    }
}
