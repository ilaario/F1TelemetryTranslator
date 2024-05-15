package Packets;

import Constants.EventCode;

public class ButtonEvent extends PacketEvent {
    private final String m_eventStringCode = EventCode.ButtonStatus.getCode();
    private ButtonEventDetails m_eventDetails;

    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public ButtonEventDetails getM_eventDetails() {
        return m_eventDetails;
    }

    public void setM_eventDetails(ButtonEventDetails m_eventDetails) {
        this.m_eventDetails = m_eventDetails;
    }
}

