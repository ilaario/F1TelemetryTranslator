package Constants.ERS_Dep;

public enum ERSMode {
    NONE(0, "None"),
    MEDIUM(1, "Medium"),
    HOTLAP(2, "Hotlap"),
    OVERTAKE(3, "Overtake");

    private final int code;
    private final String description;

    ERSMode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ERSMode fromCode(int code) {
        for (ERSMode mode : ERSMode.values()) {
            if (mode.getCode() == code) {
                return mode;
            }
        }
        throw new IllegalArgumentException("Invalid ERS mode code: " + code);
    }
}
