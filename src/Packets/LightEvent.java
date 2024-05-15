package Packets;

import Constants.EventCode;

public class LightEvent extends PacketEvent {
    private final String m_eventStringCode = EventCode.StartLights.getCode();
    private LightEventDetails m_eventDetails;

    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public LightEventDetails getM_eventDetails() {
        return m_eventDetails;
    }

    public void setM_eventDetails(LightEventDetails m_eventDetails) {
        this.m_eventDetails = m_eventDetails;
    }
}
