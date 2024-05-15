package Parser;

import Packets.ParticipantData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

public class ParticipantDataParser extends F1Parser<ParticipantData> {
    private final int packetFormat;

    public ParticipantDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected ParticipantData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ParticipantData data = new ParticipantData();

        data.setM_aiControlled(byteBuffer.get() & 0xFF);
        data.setM_driverId(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2021) {
            data.setM_networkId(byteBuffer.get() & 0xFF);
        }

        data.setM_teamId(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2021) {
            data.setM_myTeam(byteBuffer.get() & 0xFF);
        }

        data.setM_raceNumber(byteBuffer.get() & 0xFF);
        data.setM_nationality(byteBuffer.get() & 0xFF);

        byte[] nameBytes = new byte[48];
        byteBuffer.get(nameBytes);
        String name = new String(nameBytes, StandardCharsets.UTF_8).trim(); // Assume UTF-8 encoding and trim the null characters
        data.setM_name(name);

        if (packetFormat >= 2019) {
            data.setM_yourTelemetry(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2023) {
            data.setM_showOnlineNames(byteBuffer.get() & 0xFF);
            data.setM_platform(byteBuffer.get() & 0xFF);
        }

        return data;
    }
}

