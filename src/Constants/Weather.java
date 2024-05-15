package Constants;

public enum Weather {
    CLEAR("Clear"),
    LIGHT_CLOUD("Light Cloud"),
    OVERCAST("Overcast"),
    LIGHT_RAIN("Light Rain"),
    HEAVY_RAIN("Heavy Rain"),
    STORM("Storm");

    private final String description;

    Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // You can also add a static method to get Weather enum by index
    public static Weather fromIndex(int index) {
        switch (index) {
            case 0:
                return CLEAR;
            case 1:
                return LIGHT_CLOUD;
            case 2:
                return OVERCAST;
            case 3:
                return LIGHT_RAIN;
            case 4:
                return HEAVY_RAIN;
            case 5:
                return STORM;
            default:
                throw new IllegalArgumentException("Invalid weather index: " + index);
        }
    }
}

