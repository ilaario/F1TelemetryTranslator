package Constants;

public enum LapValidFlag {
    VALID_LAP(0x01, "Valid Lap"),
    VALID_S1(0x02, "Valid Sector 1"),
    VALID_S2(0x04, "Valid Sector 2"),
    VALID_S3(0x08, "Valid Sector 3");

    private final int flag;
    private final String description;

    LapValidFlag(int flag, String description) {
        this.flag = flag;
        this.description = description;
    }

    public int getFlag() {
        return flag;
    }

    public String getDescription() {
        return description;
    }

    public static LapValidFlag fromFlag(int flag) {
        for (LapValidFlag lapFlag : LapValidFlag.values()) {
            if (lapFlag.getFlag() == flag) {
                return lapFlag;
            }
        }
        throw new IllegalArgumentException("Invalid lap flag: " + flag);
    }
}

