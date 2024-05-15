package Constants;

public enum PitStatus {
    NONE(0, "None"),
    PITTING(1, "Pitting"),
    IN_PIT_AREA(2, "In Pit Area");

    private final int code;
    private final String description;

    PitStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static PitStatus getByCode(int code) {
        for (PitStatus status : PitStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null; // Handle unknown code
    }
}

