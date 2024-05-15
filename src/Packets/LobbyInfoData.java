package Packets;

public class LobbyInfoData {
    private int m_aiControlled;
    private int m_teamId;
    private int m_nationality;
    private int m_platform;
    private String m_name;
    private int m_carNumber;
    private int m_readyStatus;

    // Getter and Setter
    public int getM_aiControlled() {
        return m_aiControlled;
    }

    public void setM_aiControlled(int m_aiControlled) {
        this.m_aiControlled = m_aiControlled;
    }

    public int getM_teamId() {
        return m_teamId;
    }

    public void setM_teamId(int m_teamId) {
        this.m_teamId = m_teamId;
    }

    public int getM_nationality() {
        return m_nationality;
    }

    public void setM_nationality(int m_nationality) {
        this.m_nationality = m_nationality;
    }

    public int getM_platform() {
        return m_platform;
    }

    public void setM_platform(int m_platform) {
        this.m_platform = m_platform;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public int getM_carNumber() {
        return m_carNumber;
    }

    public void setM_carNumber(int m_carNumber) {
        this.m_carNumber = m_carNumber;
    }

    public int getM_readyStatus() {
        return m_readyStatus;
    }

    public void setM_readyStatus(int m_readyStatus) {
        this.m_readyStatus = m_readyStatus;
    }

    @Override
    public String toString() {
        return "LobbyInfoData{" +
                "m_aiControlled=" + m_aiControlled +
                ", m_teamId=" + m_teamId +
                ", m_nationality=" + m_nationality +
                ", m_platform=" + m_platform +
                ", m_name='" + m_name + '\'' +
                ", m_carNumber=" + m_carNumber +
                ", m_readyStatus='" + m_readyStatus + '\'' +
                '}';
    }


}
