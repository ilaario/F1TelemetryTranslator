package Constants;

public enum RulesetType {
    PRACTICE_QUALIFYING(0, "Practice & Qualifying"),
    RACE(1, "Race"),
    TIME_TRIAL(2, "Time Trial"),
    TIME_ATTACK(4, "Time Attack"),
    CHECKPOINT_CHALLENGE(6, "Checkpoint Challenge"),
    AUTOCROSS(8, "Autocross"),
    DRIFT(9, "Drift"),
    AVERAGE_SPEED_ZONE(10, "Average Speed Zone"),
    RIVAL_DUEL(11, "Rival Duel");

    private final int code;
    private final String description;

    RulesetType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static RulesetType getByCode(int code) {
        for (RulesetType type : RulesetType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null; // Handle unknown code
    }
}

