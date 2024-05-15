package Packets;

public class GenericEvent extends PacketBase{
    public String m_eventStringCode;

    public GenericEvent(String m_eventStringCode) {
        this.m_eventStringCode = m_eventStringCode;
    }

    public String getM_eventStringCode() {
        return m_eventStringCode;
    }


    public void setM_eventStringCode(String m_eventStringCode) {
        if(m_eventStringCode == "SSTA" || m_eventStringCode == "LGOT" || m_eventStringCode == "RDFL" || m_eventStringCode == "SEND" || m_eventStringCode == "DRSE" || m_eventStringCode == "DRSD" || m_eventStringCode == "CHQF")
            this.m_eventStringCode = m_eventStringCode;
        else {
            System.out.println("Invalid event code");
        }
    }

    @Override
    public String toString() {
        return "GenericEvent{" + "m_eventStringCode=" + m_eventStringCode + '}';
    }
}
