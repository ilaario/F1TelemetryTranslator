package Constants.Assists;

public enum RacingLine {
    Off(0),
    CornersOnly(1),
    Full(2);

    private final int value;

    RacingLine(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static RacingLine getRacingLine(int value) {
        for (RacingLine racingLine : RacingLine.values()) {
            if (racingLine.value == value) {
                return racingLine;
            }
        }
        return null;
    }

    public static RacingLine getRacingLineFromName(String name) {
        for (RacingLine racingLine : RacingLine.values()) {
            if (racingLine.name().equals(name)) {
                return racingLine;
            }
        }
        return null;
    }


}
