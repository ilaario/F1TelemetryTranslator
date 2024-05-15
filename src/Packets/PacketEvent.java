package Packets;

import Constants.EventCode;

public class PacketEvent extends PacketBase {
    private String m_eventStringCode;

    // Getter and Setter
    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public void setM_eventStringCode(String m_eventStringCode) {
        this.m_eventStringCode = m_eventStringCode;
    }

    public void setEventDetails(Object parsed) {

    }
}
