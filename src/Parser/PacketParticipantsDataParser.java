package Parser;

import Packets.PacketParticipantsData;
import Packets.ParticipantData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketParticipantsDataParser extends F1Parser<PacketParticipantsData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketParticipantsDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketParticipantsData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketParticipantsData data = new PacketParticipantsData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        if (packetFormat == 2018) {
            data.setM_numCars(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2019) {
            data.setM_numActiveCars(byteBuffer.get() & 0xFF);
        }

        int numberOfParticipants = packetFormat >= 2020 ? 22 : 20;
        List<ParticipantData> participantsList = new ArrayList<>();
        ParticipantDataParser participantDataParser = new ParticipantDataParser(packetFormat);
        for (int i = 0; i < numberOfParticipants; i++) {
            participantsList.add(participantDataParser.parse(byteBuffer));
        }
        data.setM_participants(participantsList);

        return data;
    }
}

