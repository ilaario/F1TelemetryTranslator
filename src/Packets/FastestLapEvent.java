package Packets;

import Constants.EventCode;

public class FastestLapEvent extends PacketEvent {
    private String m_eventStringCode = EventCode.FastestLap.getCode();
    private FastestLapEventDetails m_eventDetails;

    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public FastestLapEventDetails getM_eventDetails() {
        return m_eventDetails;
    }

    public void setM_eventDetails(FastestLapEventDetails m_eventDetails) {
        this.m_eventDetails = m_eventDetails;
    }
}
