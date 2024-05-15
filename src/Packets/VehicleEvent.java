package Packets;

public class VehicleEvent extends PacketEvent{

    /* export interface VehicleEvent extends PacketBase {
            m_eventStringCode: 'RTMT' | 'TMPT' | 'RCWN' | 'DTSV' | 'SGSV';
            m_eventDetails: VehicleEventDetails;
       }*/
    private String m_eventStringCode;
    private VehicleEventDetails m_eventDetails;

    public VehicleEvent() {
        m_eventStringCode = null;
        m_eventDetails = null;
    }

    public String getEventStringCode() {
        return m_eventStringCode;
    }

    public VehicleEventDetails getEventDetails() {
        return m_eventDetails;
    }

    public void setEventStringCode(String eventStringCode) {
        if(m_eventStringCode == "RTMT" || m_eventStringCode == "TMPT" || m_eventStringCode == "RCWN" || m_eventStringCode == "DTSV" || m_eventStringCode == "SGSV")
            m_eventStringCode = eventStringCode;
        else {
            System.out.println("Invalid event string code");
        }
    }

}
