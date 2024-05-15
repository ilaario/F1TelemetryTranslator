package Constants.Assists;

public enum TrackingControl {
    Off(0),
    Medium(1),
    Full(2);

    private final int value;

    TrackingControl(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
