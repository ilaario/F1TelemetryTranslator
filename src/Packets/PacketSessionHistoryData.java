package Packets;

import java.util.List;

public class PacketSessionHistoryData extends PacketBase {
    private int m_carIdx;
    private int m_numLaps;
    private int m_numTyreStints;
    private int m_bestLapTimeLapNum;
    private int m_bestSector1LapNum;
    private int m_bestSector2LapNum;
    private int m_bestSector3LapNum;
    private List<LapHistoryData> m_lapHistoryData;
    private List<TyreStintsHistoryData> m_tyreStintsHistoryData;

    // Getters and setters for all fields
    public int getM_carIdx() {
        return m_carIdx;
    }

    public void setM_carIdx(int m_carIdx) {
        this.m_carIdx = m_carIdx;
    }

    public int getM_numLaps() {
        return m_numLaps;
    }

    public void setM_numLaps(int m_numLaps) {
        this.m_numLaps = m_numLaps;
    }

    public int getM_numTyreStints() {
        return m_numTyreStints;
    }

    public void setM_numTyreStints(int m_numTyreStints) {
        this.m_numTyreStints = m_numTyreStints;
    }

    public int getM_bestLapTimeLapNum() {
        return m_bestLapTimeLapNum;
    }

    public void setM_bestLapTimeLapNum(int m_bestLapTimeLapNum) {
        this.m_bestLapTimeLapNum = m_bestLapTimeLapNum;
    }

    public int getM_bestSector1LapNum() {
        return m_bestSector1LapNum;
    }

    public void setM_bestSector1LapNum(int m_bestSector1LapNum) {
        this.m_bestSector1LapNum = m_bestSector1LapNum;
    }

    public int getM_bestSector2LapNum() {
        return m_bestSector2LapNum;
    }

    public void setM_bestSector2LapNum(int m_bestSector2LapNum) {
        this.m_bestSector2LapNum = m_bestSector2LapNum;
    }

    public int getM_bestSector3LapNum() {
        return m_bestSector3LapNum;
    }

    public void setM_bestSector3LapNum(int m_bestSector3LapNum) {
        this.m_bestSector3LapNum = m_bestSector3LapNum;
    }

    public List<LapHistoryData> getM_lapHistoryData() {
        return m_lapHistoryData;
    }

    public void setM_lapHistoryData(List<LapHistoryData> m_lapHistoryData) {
        this.m_lapHistoryData = m_lapHistoryData;
    }

    public List<TyreStintsHistoryData> getM_tyreStintsHistoryData() {
        return m_tyreStintsHistoryData;
    }

    public void setM_tyreStintsHistoryData(List<TyreStintsHistoryData> m_tyreStintsHistoryData) {
        this.m_tyreStintsHistoryData = m_tyreStintsHistoryData;
    }

    // toString method
    @Override
    public String toString() {
        return "PacketSessionHistoryData{" +
                "m_carIdx=" + m_carIdx +
                ", m_numLaps=" + m_numLaps +
                ", m_numTyreStints=" + m_numTyreStints +
                ", m_bestLapTimeLapNum=" + m_bestLapTimeLapNum +
                ", m_bestSector1LapNum=" + m_bestSector1LapNum +
                ", m_bestSector2LapNum=" + m_bestSector2LapNum +
                ", m_bestSector3LapNum=" + m_bestSector3LapNum +
                ", m_lapHistoryData=" + m_lapHistoryData +
                ", m_tyreStintsHistoryData=" + m_tyreStintsHistoryData +
                '}';
    }
}

