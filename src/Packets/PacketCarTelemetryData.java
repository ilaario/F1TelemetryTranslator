package Packets;

import java.util.List;

public class PacketCarTelemetryData extends PacketBase {
    private List<CarTelemetryData> m_carTelemetryData;
    private Integer m_buttonStatus;  // Optional
    private Integer m_mfdPanelIndex;  // Optional
    private Integer m_mfdPanelIndexSecondaryPlayer;  // Optional
    private byte m_suggestedGear;  // Optional

    // Getters and Setters
    public List<CarTelemetryData> getM_carTelemetryData() {
        return m_carTelemetryData;
    }

    public void setM_carTelemetryData(List<CarTelemetryData> m_carTelemetryData) {
        this.m_carTelemetryData = m_carTelemetryData;
    }

    public Integer getM_buttonStatus() {
        return m_buttonStatus;
    }

    public void setM_buttonStatus(Integer m_buttonStatus) {
        this.m_buttonStatus = m_buttonStatus;
    }

    public Integer getM_mfdPanelIndex() {
        return m_mfdPanelIndex;
    }

    public void setM_mfdPanelIndex(Integer m_mfdPanelIndex) {
        this.m_mfdPanelIndex = m_mfdPanelIndex;
    }

    public Integer getM_mfdPanelIndexSecondaryPlayer() {
        return m_mfdPanelIndexSecondaryPlayer;
    }

    public void setM_mfdPanelIndexSecondaryPlayer(Integer m_mfdPanelIndexSecondaryPlayer) {
        this.m_mfdPanelIndexSecondaryPlayer = m_mfdPanelIndexSecondaryPlayer;
    }

    public byte getM_suggestedGear() {
        return m_suggestedGear;
    }

    public void setM_suggestedGear(byte m_suggestedGear) {
        this.m_suggestedGear = m_suggestedGear;
    }
}

