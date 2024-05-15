package Constants;

public enum Penalty {
    DRIVE_THROUGH(0, "Drive through"),
    STOP_GO(1, "Stop Go"),
    GRID_PENALTY(2, "Grid penalty"),
    PENALTY_REMINDER(3, "Penalty reminder"),
    TIME_PENALTY(4, "Time penalty"),
    WARNING(5, "Warning"),
    DISQUALIFIED(6, "Disqualified"),
    REMOVED_FROM_FORMATION_LAP(7, "Removed from formation lap"),
    PARKED_TOO_LONG_TIMER(8, "Parked too long timer"),
    TYRE_REGULATIONS(9, "Tyre regulations"),
    LAP_INVALIDATED(10, "This lap invalidated"),
    LAP_INVALIDATED_NEXT(11, "This and next lap invalidated"),
    LAP_INVALIDATED_NO_REASON(12, "This lap invalidated without reason"),
    LAP_INVALIDATED_NEXT_NO_REASON(13, "This and next lap invalidated without reason"),
    LAP_INVALIDATED_PREVIOUS(14, "This and previous lap invalidated"),
    LAP_INVALIDATED_PREVIOUS_NO_REASON(15, "This and previous lap invalidated without reason"),
    RETIRED(16, "Retired"),
    BLACK_FLAG_TIMER(17, "Black flag timer");

    private final int code;
    private final String description;

    Penalty(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Penalty getByCode(int code) {
        for (Penalty penalty : Penalty.values()) {
            if (penalty.getCode() == code) {
                return penalty;
            }
        }
        return null; // Handle unknown code
    }
}

