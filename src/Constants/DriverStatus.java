package Constants;

public enum DriverStatus {
    IN_GARAGE(0, "In Garage"),
    FLYING_LAP(1, "Flying Lap"),
    IN_LAP(2, "In Lap"),
    OUT_LAP(3, "Out Lap"),
    ON_TRACK(4, "On Track");

    private final int code;
    private final String description;

    DriverStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static DriverStatus fromCode(int code) {
        for (DriverStatus status : DriverStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid driver status code: " + code);
    }
}

