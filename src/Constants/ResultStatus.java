package Constants;

public enum ResultStatus {
    INVALID(0, "Invalid"),
    INACTIVE(1, "Inactive"),
    ACTIVE(2, "Active"),
    FINISHED(3, "Finished"),
    DNF(4, "DNF"),
    DSQ(5, "DSQ"),
    NC(6, "NC"),
    RETIRED(7, "Retired");

    private final int code;
    private final String description;

    ResultStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ResultStatus getByCode(int code) {
        for (ResultStatus status : ResultStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null; // Handle unknown code
    }
}

