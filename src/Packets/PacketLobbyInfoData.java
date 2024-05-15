package Packets;

import java.util.List;

public class PacketLobbyInfoData extends PacketBase{
    private int m_numPlayers;
    private List<LobbyInfoData> m_lobbyPlayers;

    // Getter and Setter


    public void setM_numPlayers(int m_numPlayers) {
        this.m_numPlayers = m_numPlayers;
    }

    public int getM_numPlayers() {
        return m_numPlayers;
    }

    public void setM_lobbyPlayers(List<LobbyInfoData> m_lobbyPlayers) {
        this.m_lobbyPlayers = m_lobbyPlayers;
    }

    public List<LobbyInfoData> getM_lobbyPlayers() {
        return m_lobbyPlayers;
    }

    @Override
    public String toString() {
        return "PacketLobbyInfoData{" +
                "m_numPlayers=" + m_numPlayers +
                ", m_lobbyPlayers=" + m_lobbyPlayers +
                '}';
    }
}
