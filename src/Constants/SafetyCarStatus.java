package Constants;

public enum SafetyCarStatus {
    NO_SAFETY_CAR(0, "No Safety Car"),
    FULL_SAFETY_CAR(1, "Full Safety Car"),
    VIRTUAL_SAFETY_CAR(2, "Virtual Safety Car"),
    FORMATION_LAP(3, "Formation Lap");

    private final int code;
    private final String description;

    SafetyCarStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static SafetyCarStatus getByCode(int code) {
        for (SafetyCarStatus status : SafetyCarStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null; // Handle unknown code
    }
}

