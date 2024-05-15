package Constants;

public enum PacketTypes {
    MOTION("motion"),
    SESSION("session"),
    LAP_DATA("lapData"),
    EVENT("event"),
    PARTICIPANTS("participants"),
    CAR_SETUPS("carSetups"),
    CAR_TELEMETRY("carTelemetry"),
    CAR_STATUS("carStatus"),
    FINAL_CLASSIFICATION("finalClassification"),
    LOBBY_INFO("lobbyInfo"),
    CAR_DAMAGE("carDamage"),
    SESSION_HISTORY("sessionHistory"),
    TYRE_SETS("tyreSets"),
    MOTION_EX("motionEx");

    private final String typeName;

    PacketTypes(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public static PacketTypes fromTypeName(String typeName) {
        for (PacketTypes packetType : PacketTypes.values()) {
            if (packetType.getTypeName().equals(typeName)) {
                return packetType;
            }
        }
        throw new IllegalArgumentException("Invalid packet type name: " + typeName);
    }
}

