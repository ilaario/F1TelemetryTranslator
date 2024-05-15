package Packets;

import java.util.UUID;

public class PacketHeader extends PacketHeaderBase {
    private Integer gameYear;
    private Integer gameMajorVersion;
    private Integer gameMinorVersion;
    private int packetVersion;
    private int packetId;
    private UUID sessionUID;
    private double sessionTime;
    private int frameIdentifier;
    private Integer overallFrameIdentifier;
    private int playerCarIndex;
    private Integer secondaryPlayerCarIndex;

    public Integer getGameYear() {
        return gameYear;
    }

    public void setGameYear(Integer gameYear) {
        this.gameYear = gameYear;
    }

    public Integer getGameMajorVersion() {
        return gameMajorVersion;
    }

    public void setGameMajorVersion(Integer gameMajorVersion) {
        this.gameMajorVersion = gameMajorVersion;
    }

    public Integer getGameMinorVersion() {
        return gameMinorVersion;
    }

    public void setGameMinorVersion(Integer gameMinorVersion) {
        this.gameMinorVersion = gameMinorVersion;
    }

    public int getPacketVersion() {
        return packetVersion;
    }

    public void setPacketVersion(int packetVersion) {
        this.packetVersion = packetVersion;
    }

    public int getPacketId() {
        return packetId;
    }

    public void setPacketId(int packetId) {
        this.packetId = packetId;
    }

    public UUID getSessionUID() {
        return sessionUID;
    }

    public void setSessionUID(UUID sessionUID) {
        this.sessionUID = sessionUID;
    }

    public double getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(double sessionTime) {
        this.sessionTime = sessionTime;
    }

    public int getFrameIdentifier() {
        return frameIdentifier;
    }

    public void setFrameIdentifier(int frameIdentifier) {
        this.frameIdentifier = frameIdentifier;
    }

    public Integer getOverallFrameIdentifier() {
        return overallFrameIdentifier;
    }

    public void setOverallFrameIdentifier(Integer overallFrameIdentifier) {
        this.overallFrameIdentifier = overallFrameIdentifier;
    }

    public int getPlayerCarIndex() {
        return playerCarIndex;
    }

    public void setPlayerCarIndex(int playerCarIndex) {
        this.playerCarIndex = playerCarIndex;
    }

    public Integer getSecondaryPlayerCarIndex() {
        return secondaryPlayerCarIndex;
    }

    public void setSecondaryPlayerCarIndex(Integer secondaryPlayerCarIndex) {
        this.secondaryPlayerCarIndex = secondaryPlayerCarIndex;
    }

    public PacketHeader() {
        super();
        this.gameYear = null;
        this.gameMajorVersion = null;
        this.gameMinorVersion = null;
        this.packetVersion = 0;
        this.packetId = 0;
        this.sessionUID = null;
        this.sessionTime = 0;
        this.frameIdentifier = 0;
        this.overallFrameIdentifier = null;
        this.playerCarIndex = 0;
        this.secondaryPlayerCarIndex = null;
    }
}

