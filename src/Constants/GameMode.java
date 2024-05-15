package Constants;

public enum GameMode {
    EVENT_MODE(0, "Event Mode"),
    GRAND_PRIX(3, "Grand Prix"),
    GRAND_PRIX_23(4, "Grand Prix 23"),
    TIME_TRIAL(5, "Time Trial"),
    SPLIT_SCREEN(6, "Splitscreen"),
    ONLINE_CUSTOM(7, "Online Custom"),
    ONLINE_LEAGUE(8, "Online League"),
    CAREER_INVITATIONAL(11, "Career Invitational"),
    CHAMPIONSHIP_INVITATIONAL(12, "Championship Invitational"),
    CHAMPIONSHIP(13, "Championship"),
    ONLINE_CHAMPIONSHIP(14, "Online Championship"),
    ONLINE_WEEKLY_EVENT(15, "Online Weekly Event"),
    STORY_MODE(17, "Story Mode"),
    CAREER_22(19, "Career 22"),
    CAREER_22_ONLINE(20, "Career 22 Online"),
    CAREER_23(21, "Career 23"),
    CAREER_23_ONLINE(22, "Career 23 Online"),
    BENCHMARK(127, "Benchmark");

    private final int code;
    private final String description;

    GameMode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static GameMode fromCode(int code) {
        for (GameMode mode : GameMode.values()) {
            if (mode.getCode() == code) {
                return mode;
            }
        }
        throw new IllegalArgumentException("Invalid game mode code: " + code);
    }
}

