package Parser;

import Packets.LobbyInfoData;
import Packets.PacketLobbyInfoData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketLobbyInfoDataParser extends F1Parser<PacketLobbyInfoData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketLobbyInfoDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketLobbyInfoData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketLobbyInfoData data = new PacketLobbyInfoData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        data.setM_numPlayers(byteBuffer.get() & 0xFF);

        List<LobbyInfoData> lobbyPlayersList = new ArrayList<>();
        LobbyInfoData dataLobby = new LobbyInfoData();
        LobbyInfoDataParser lobbyInfoDataParser = new LobbyInfoDataParser(packetFormat);
        for (int i = 0; i < 22; i++) { // The array length is fixed at 22 as per your definition
            lobbyPlayersList.add(lobbyInfoDataParser.parse(byteBuffer));
        }
        data.setM_lobbyPlayers(lobbyPlayersList);

        return data;
    }
}

