package Constants;

public enum SurfaceType {
    TARMAC(0, "Tarmac"),
    RUMBLE_STRIP(1, "Rumble strip"),
    CONCRETE(2, "Concrete"),
    ROCK(3, "Rock"),
    GRAVEL(4, "Gravel"),
    MUD(5, "Mud"),
    SAND(6, "Sand"),
    GRASS(7, "Grass"),
    WATER(8, "Water"),
    COBBLESTONE(9, "Cobblestone"),
    METAL(10, "Metal"),
    RIDGED(11, "Ridged");

    private final int code;
    private final String description;

    SurfaceType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static SurfaceType getByCode(int code) {
        for (SurfaceType type : SurfaceType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null; // Handle unknown code
    }
}

