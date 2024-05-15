package Packets;

public class ButtonEventDetails {
    private int buttonStatus;

    public ButtonEventDetails(int buttonStatus) {
        this.buttonStatus = buttonStatus;
    }

    public ButtonEventDetails() {
    }

    public int getButtonStatus() {
        return buttonStatus;
    }

    public void setButtonStatus(int buttonStatus) {
        this.buttonStatus = buttonStatus;
    }

    public void setEventDetails(Object o){
        if (o instanceof ButtonEventDetails bed){
            this.buttonStatus = bed.getButtonStatus();
        }
    }

    @Override
    public String toString() {
        return "ButtonEventDetails{" +
                "buttonStatus=" + buttonStatus +
                '}';
    }
}
