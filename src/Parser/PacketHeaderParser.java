package Parser;

import Packets.PacketHeader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.sql.Timestamp;
import java.util.UUID;

public class PacketHeaderParser extends F1Parser<PacketHeader> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketHeaderParser(int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
    }

    @Override
    public PacketHeader parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketHeader data = new PacketHeader();

        data.setPacketFormat(byteBuffer.getShort() & 0xFFFF);

        if (packetFormat >= 2023) {
            data.setGameYear(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2019) {
            data.setGameMajorVersion(byteBuffer.get() & 0xFF);
            data.setGameMinorVersion(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2018) {
            data.setPacketVersion(byteBuffer.get() & 0xFF);
            data.setPacketId(byteBuffer.get() & 0xFF);
        }

        if (bigintEnabled) {
            //dont use UUID
            long sessionId = byteBuffer.getLong();
            data.setSessionUID(sessionId);
        } else {
            byteBuffer.position(byteBuffer.position() + 8); // Skipping 8 bytes
        }

        float sessionTime = byteBuffer.getFloat();
        data.setSessionTime(floatToTimestamp(sessionTime));
        data.setFrameIdentifier(byteBuffer.getInt());

        if (packetFormat >= 2023) {
            data.setOverallFrameIdentifier(byteBuffer.getInt());
        }

        data.setPlayerCarIndex(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2020) {
            data.setSecondaryPlayerCarIndex(byteBuffer.get() & 0xFF);
        }

        return data;
    }

    private Timestamp floatToTimestamp(float sessionTime) {
        long seconds = (long) sessionTime;
        long millis = (long) ((sessionTime - seconds) * 1000);
        return new Timestamp(seconds * 1000 + millis);
    }
}

