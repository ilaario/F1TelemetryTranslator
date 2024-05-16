package Packets;

import java.sql.Timestamp;
import java.util.UUID;

public class PacketHeader extends PacketHeaderBase {
    private Integer gameYear;
    private Integer gameMajorVersion;
    private Integer gameMinorVersion;
    private int packetVersion;
    private int packetId;
    private long sessionUID;
    private Timestamp sessionTime;
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

    public long getSessionUID() {
        return sessionUID;
    }

    public void setSessionUID(long sessionUID) {
        this.sessionUID = sessionUID;
    }

    public Timestamp getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Timestamp sessionTime) {
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
        this.sessionUID = 0;
        this.sessionTime = null;
        this.frameIdentifier = 0;
        this.overallFrameIdentifier = null;
        this.playerCarIndex = 0;
        this.secondaryPlayerCarIndex = null;
    }

    @Override
    public String toString() {
        return "PacketHeader{" +
                ",\n\tm_packetFormat=" + getPacketFormat() +
                ",\n\tgameYear=" + gameYear +
                ",\n\tgameMajorVersion=" + gameMajorVersion +
                ",\n\tgameMinorVersion=" + gameMinorVersion +
                ",\n\tpacketVersion=" + packetVersion +
                ",\n\tpacketId=" + packetId +
                ",\n\tsessionUID=" + sessionUID +
                ",\n\tsessionTime=" + sessionTime +
                ",\n\tframeIdentifier=" + frameIdentifier +
                ",\n\toverallFrameIdentifier=" + overallFrameIdentifier +
                ",\n\tplayerCarIndex=" + playerCarIndex +
                ",\n\tsecondaryPlayerCarIndex=" + secondaryPlayerCarIndex +
                '}';
    }
}

