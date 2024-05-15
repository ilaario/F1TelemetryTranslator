package Packets;

import Constants.EventCode;

public class SpeedTrapEvent extends PacketEvent {
    private final String m_eventStringCode = EventCode.SpeedTrapTriggered.getCode();
    private SpeedTrapEventDetails m_eventDetails;

    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public SpeedTrapEventDetails getM_eventDetails() {
        return m_eventDetails;
    }

    public void setM_eventDetails(SpeedTrapEventDetails m_eventDetails) {
        this.m_eventDetails = m_eventDetails;
    }
}
