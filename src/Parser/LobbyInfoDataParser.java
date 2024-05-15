package Parser;

import Packets.LobbyInfoData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

public class LobbyInfoDataParser extends F1Parser<LobbyInfoData> {
    private final int packetFormat;

    public LobbyInfoDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected LobbyInfoData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);

        LobbyInfoData data = new LobbyInfoData();

        // Always present fields
        data.setM_aiControlled(byteBuffer.get() & 0xFF);
        data.setM_teamId(byteBuffer.get() & 0xFF);
        data.setM_nationality(byteBuffer.get() & 0xFF);

        // Conditional field for platform introduced in 2023
        if (packetFormat >= 2023) {
            data.setM_platform(byteBuffer.get() & 0xFF);
        }

        // Parsing the string (name)
        byte[] nameBytes = new byte[48];
        byteBuffer.get(nameBytes);
        String name = new String(nameBytes, StandardCharsets.UTF_8).trim(); // Assume UTF-8 encoding and trim the null characters
        data.setM_name(name);

        // Conditional field for car number introduced in 2021
        if (packetFormat >= 2021) {
            data.setM_carNumber(byteBuffer.get() & 0xFF);
        }

        // Always present field
        data.setM_readyStatus(byteBuffer.get() & 0xFF);

        return data;
    }
}

