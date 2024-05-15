package Packets;

import java.util.List;

public class PacketParticipantsData extends PacketBase {
    private Integer m_numCars;  // Optional
    private Integer m_numActiveCars;  // Optional
    private List<ParticipantData> m_participants;

    // Getters and Setters
    public Integer getM_numCars() {
        return m_numCars;
    }

    public void setM_numCars(Integer m_numCars) {
        this.m_numCars = m_numCars;
    }

    public Integer getM_numActiveCars() {
        return m_numActiveCars;
    }

    public void setM_numActiveCars(Integer m_numActiveCars) {
        this.m_numActiveCars = m_numActiveCars;
    }

    public List<ParticipantData> getM_participants() {
        return m_participants;
    }

    public void setM_participants(List<ParticipantData> m_participants) {
        this.m_participants = m_participants;
    }
}

