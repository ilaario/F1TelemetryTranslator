package Packets;

public class FlashbackEventDetails {
    private float flashbackSessionTime;
    private int flashbackFrameIdentifier;

    public FlashbackEventDetails(){
        flashbackSessionTime = 0;
        flashbackFrameIdentifier = 0;
    }

    public float getFlashbackSessionTime(){
        return flashbackSessionTime;
    }

    public void setFlashbackSessionTime(float time){
        flashbackSessionTime = time;
    }

    public void setEventDetails(Object o){
        if (o instanceof FlashbackEventDetails f){
            setFlashbackSessionTime(f.getFlashbackSessionTime());
            setFlashbackFrameIdentifier(f.getFlashbackFrameIdentifier());
        }
    }

    public int getFlashbackFrameIdentifier(){
        return flashbackFrameIdentifier;
    }

    public void setFlashbackFrameIdentifier(int frame){
        flashbackFrameIdentifier = frame;
    }
}
