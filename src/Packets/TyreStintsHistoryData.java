package Packets;

public class TyreStintsHistoryData {
    private int m_endLap;
    private int m_tyreActualCompound;
    private int m_tyreVisualCompound;

    // Getters and setters for all fields
    public int getM_endLap() {
        return m_endLap;
    }

    public void setM_endLap(int m_endLap) {
        this.m_endLap = m_endLap;
    }

    public int getM_tyreActualCompound() {
        return m_tyreActualCompound;
    }

    public void setM_tyreActualCompound(int m_tyreActualCompound) {
        this.m_tyreActualCompound = m_tyreActualCompound;
    }

    public int getM_tyreVisualCompound() {
        return m_tyreVisualCompound;
    }

    public void setM_tyreVisualCompound(int m_tyreVisualCompound) {
        this.m_tyreVisualCompound = m_tyreVisualCompound;
    }

    public String toString() {
        return "End Lap: " + m_endLap + ", Actual Compound: " + m_tyreActualCompound + ", Visual Compound: " + m_tyreVisualCompound;
    }
}

