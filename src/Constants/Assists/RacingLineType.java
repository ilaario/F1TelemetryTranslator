package Constants.Assists;

public enum RacingLineType {
    TwoDimensional(0),
    ThreeDimensional(1);

    private final int value;

    RacingLineType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
