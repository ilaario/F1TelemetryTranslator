package Packets;

import Constants.EventCode;

public class OvertakeEvent extends PacketEvent {
    private String m_eventStringCode = EventCode.Overtake.getCode();
    private OvertakeEventDetails m_eventDetails;

    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public OvertakeEventDetails getM_eventDetails() {
        return m_eventDetails;
    }

    public void setM_eventDetails(OvertakeEventDetails m_eventDetails) {
        this.m_eventDetails = m_eventDetails;
    }
}