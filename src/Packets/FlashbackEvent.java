package Packets;

public class FlashbackEvent extends PacketEvent{
    private String m_eventStringCode = "FLBK";
    private FlashbackEventDetails m_EventDetails;

    public FlashbackEvent(){
        m_EventDetails = null;
    }

    public String getEventStringCode(){
        return m_eventStringCode;
    }

    public FlashbackEventDetails getEventDetails(){
        return m_EventDetails;
    }

    public void setEventDetails(FlashbackEventDetails eventDetails){
        m_EventDetails = eventDetails;
    }
}
