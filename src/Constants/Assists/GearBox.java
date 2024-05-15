package Constants.Assists;

public enum GearBox {
    Manual(1),
    ManualAndSuggestedGear(2),
    Automatic(3);

    private final int value;

    GearBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
