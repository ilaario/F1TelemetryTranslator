package Packets;

public class ParticipantData {
    private int m_aiControlled, m_driverId, m_nationality, m_raceNumber, m_teamId;
    private Integer m_networkId, m_myTeam, m_yourTelemetry, m_showOnlineNames, m_platform;  // All optional
    private String m_name;

    // Constructor, getters, and setters would be implemented here
    public ParticipantData(int m_aiControlled, int m_driverId, int m_nationality,
                            int m_raceNumber, int m_teamId, Integer m_networkId,
                            Integer m_myTeam, Integer m_yourTelemetry, Integer m_showOnlineNames,
                            Integer m_platform, String m_name) {
        this.m_aiControlled = m_aiControlled;
        this.m_driverId = m_driverId;
        this.m_nationality = m_nationality;
        this.m_raceNumber = m_raceNumber;
        this.m_teamId = m_teamId;
        this.m_networkId = m_networkId;
        this.m_myTeam = m_myTeam;
        this.m_yourTelemetry = m_yourTelemetry;
        this.m_showOnlineNames = m_showOnlineNames;
        this.m_platform = m_platform;
        this.m_name = m_name;
    }

    public int getM_aiControlled() {
        return m_aiControlled;
    }

    public void setM_aiControlled(int m_aiControlled) {
        this.m_aiControlled = m_aiControlled;
    }

    public int getM_driverId() {
        return m_driverId;
    }

    public void setM_driverId(int m_driverId) {
        this.m_driverId = m_driverId;
    }

    public int getM_nationality() {
        return m_nationality;
    }

    public void setM_nationality(int m_nationality){
        this.m_nationality = m_nationality;
    }

    public int getM_raceNumber() {
        return m_raceNumber;
    }

    public void setM_raceNumber(int m_raceNumber) {
        this.m_raceNumber = m_raceNumber;
    }

    public int getM_teamId() {
        return m_teamId;
    }

    public void setM_teamId(int m_teamId) {
        this.m_teamId = m_teamId;
    }

    public Integer getM_networkId() {
        return m_networkId;
    }

    public void setM_networkId(Integer m_networkId) {
        this.m_networkId = m_networkId;
    }

    public Integer getM_myTeam() {
        return m_myTeam;
    }

    public void setM_myTeam(Integer m_myTeam) {
        this.m_myTeam = m_myTeam;
    }

    public Integer getM_yourTelemetry() {
        return m_yourTelemetry;
    }

    public void setM_yourTelemetry(Integer m_yourTelemetry) {
        this.m_yourTelemetry = m_yourTelemetry;
    }

    public Integer getM_showOnlineNames() {
        return m_showOnlineNames;
    }

    public void setM_showOnlineNames(Integer m_showOnlineNames) {
        this.m_showOnlineNames = m_showOnlineNames;
    }

    public Integer getM_platform() {
        return m_platform;
    }

    public void setM_platform(Integer m_platform) {
        this.m_platform = m_platform;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    @Override
    public String toString() {
        return "ParticipantData{" +
                "m_aiControlled=" + m_aiControlled +
                ", m_driverId=" + m_driverId +
                ", m_nationality=" + m_nationality +
                ", m_raceNumber=" + m_raceNumber +
                ", m_teamId=" + m_teamId +
                ", m_networkId=" + m_networkId +
                ", m_myTeam=" + m_myTeam +
                ", m_yourTelemetry=" + m_yourTelemetry +
                ", m_showOnlineNames=" + m_showOnlineNames +
                ", m_platform=" + m_platform +
                ", m_name='" + m_name + '\'' +
                '}';
    }
}

