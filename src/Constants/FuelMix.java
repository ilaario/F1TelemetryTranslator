package Constants;

public enum FuelMix {
    LEAN(0, "Lean"),
    STANDARD(1, "Standard"),
    RICH(2, "Rich"),
    MAX(3, "Max");

    private final int code;
    private final String description;

    FuelMix(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static FuelMix fromCode(int code) {
        for (FuelMix mix : FuelMix.values()) {
            if (mix.getCode() == code) {
                return mix;
            }
        }
        throw new IllegalArgumentException("Invalid fuel mix code: " + code);
    }
}

