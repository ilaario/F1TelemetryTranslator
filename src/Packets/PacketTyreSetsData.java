package Packets;

import java.util.List;

public class PacketTyreSetsData extends PacketBase {
    private int m_carIdx;
    private List<TyreSetData> m_tyreSetData;
    private int m_fittedIdx;

    // Getters and setters for all fields
    public int getM_carIdx() {
        return m_carIdx;
    }

    public void setM_carIdx(int m_carIdx) {
        this.m_carIdx = m_carIdx;
    }

    public List<TyreSetData> getM_tyreSetData() {
        return m_tyreSetData;
    }

    public void setM_tyreSetData(List<TyreSetData> m_tyreSetData) {
        this.m_tyreSetData = m_tyreSetData;
    }

    public int getM_fittedIdx() {
        return m_fittedIdx;
    }

    public void setM_fittedIdx(int m_fittedIdx) {
        this.m_fittedIdx = m_fittedIdx;
    }
}

