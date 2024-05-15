package Packets;

public class PenaltyEvent extends PacketBase {
    private String m_eventStringCode = "PENA";
    private PenaltyEventDetails m_eventDetails;

    // Getter and Setter
    public String getM_eventStringCode() {
        return m_eventStringCode;
    }

    public PenaltyEventDetails getM_eventDetails() {
        return m_eventDetails;
    }

    public void setM_eventDetails(PenaltyEventDetails m_eventDetails) {
        this.m_eventDetails = m_eventDetails;
    }
}
