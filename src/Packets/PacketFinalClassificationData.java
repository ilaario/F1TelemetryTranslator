package Packets;

import java.util.List;

public class PacketFinalClassificationData extends PacketBase {
    private int m_numCars;
    private List<FinalClassificationData> m_classificationData;

    // Getter and Setter
    public int getM_numCars() {
        return m_numCars;
    }

    public void setM_numCars(int m_numCars) {
        this.m_numCars = m_numCars;
    }

    public List<FinalClassificationData> getM_classificationData() {
        return m_classificationData;
    }

    public void setM_classificationData(List<FinalClassificationData> m_classificationData) {
        this.m_classificationData = m_classificationData;
    }

    @Override
    public String toString() {
        return "PacketFinalClassificationData{" +
                "m_numCars=" + m_numCars +
                ", m_classificationData=" + m_classificationData +
                '}';
    }
}

