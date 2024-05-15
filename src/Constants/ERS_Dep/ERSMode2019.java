package Constants.ERS_Dep;

// Enum per le modalità di deploy dell'ERS (F1 2019)
public enum ERSMode2019 {
    NONE(0, "None"),
    LOW(1, "Low"),
    MEDIUM(2, "Medium"),
    HIGH(3, "High"),
    OVERTAKE(4, "Overtake"),
    HOTLAP(5, "Hotlap");

    private final int code;
    private final String description;

    ERSMode2019(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ERSMode2019 fromCode(int code) {
        for (ERSMode2019 mode : ERSMode2019.values()) {
            if (mode.getCode() == code) {
                return mode;
            }
        }
        throw new IllegalArgumentException("Invalid ERS mode code: " + code);
    }
}
