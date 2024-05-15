package Constants;

public class SessionClass {
    private String shortName;
    private String longName;
    private String type;

    public SessionClass(String shortName, String longName, String type) {
        this.shortName = shortName;
        this.longName = longName;
        this.type = type;
    }

    // Getters
    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getType() {
        return type;
    }
}

