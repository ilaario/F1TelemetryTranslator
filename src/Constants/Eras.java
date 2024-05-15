package Constants;

public enum Eras {
    MODERN(0, "Modern"),
    CLASSIC(1, "Classic");

    private final int code;
    private final String description;

    Eras(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Eras fromCode(int code) {
        for (Eras era : Eras.values()) {
            if (era.getCode() == code) {
                return era;
            }
        }
        throw new IllegalArgumentException("Invalid era code: " + code);
    }
}

