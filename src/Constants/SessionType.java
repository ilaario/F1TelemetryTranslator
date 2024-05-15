package Constants;

public enum SessionType {
    UNKNOWN(0, new SessionClass("UNK", "Unknown", null)),
    FREE_PRACTICE_1(1, new SessionClass("FP1", "Free Practice 1", "FP")),
    FREE_PRACTICE_2(2, new SessionClass("FP2", "Free Practice 2", "FP")),
    FREE_PRACTICE_3(3, new SessionClass("FP3", "Free Practice 3", "FP")),
    SHORT_FREE_PRACTICE(4, new SessionClass("ShortFP", "Short Free Practice", "FP")),
    QUALIFYING_1(5, new SessionClass("Q1", "Qualifying 1", "Q")),
    QUALIFYING_2(6, new SessionClass("Q2", "Qualifying 2", "Q")),
    QUALIFYING_3(7, new SessionClass("Q3", "Qualifying 3", "Q")),
    SHORT_QUALIFYING(8, new SessionClass("ShortQ", "Short Qualifying", "Q")),
    ONE_SHOT_QUALIFYING(9, new SessionClass("OneShotQ", "One Shot Qualifying", "Q")),
    RACE(10, new SessionClass("R", "Race", "R")),
    RACE_2(11, new SessionClass("R2", "Race 2", "R")),
    RACE_3(12, new SessionClass("R3", "Race 3", "R")),
    TIME_TRIAL(13, new SessionClass("TT", "Time Trial", "TT"));

    private final int code;
    private final SessionClass SessionClass;

    SessionType(int code, SessionClass SessionClass) {
        this.code = code;
        this.SessionClass = SessionClass;
    }

    public int getCode() {
        return code;
    }

    public SessionClass getSessionClass() {
        return SessionClass;
    }

    public static SessionType getByCode(int code) {
        for (SessionType type : SessionType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null; // Handle unknown code
    }
}
