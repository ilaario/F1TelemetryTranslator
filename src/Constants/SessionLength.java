package Constants;

public enum SessionLength {
    NONE(0, "None"),
    VERY_SHORT(2, "Very Short"),
    SHORT(3, "Short"),
    MEDIUM(4, "Medium"),
    MEDIUM_LONG(5, "Medium Long"),
    LONG(6, "Long"),
    FULL(7, "Full");

    private final int code;
    private final String description;

    SessionLength(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static SessionLength getByCode(int code) {
        for (SessionLength length : SessionLength.values()) {
            if (length.getCode() == code) {
                return length;
            }
        }
        return null; // Handle unknown code
    }
}

