package Parser;

import Packets.PacketHeader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public class PacketHeaderParser extends F1Parser<PacketHeader> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketHeaderParser(int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
    }

    @Override
    protected PacketHeader parse(ByteBuffer byteBuffer) {
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
            long mostSigBits = byteBuffer.getLong();
            long leastSigBits = byteBuffer.getLong();
            data.setSessionUID(new UUID(mostSigBits, leastSigBits));
        } else {
            byteBuffer.position(byteBuffer.position() + 8); // Skipping 8 bytes
        }

        data.setSessionTime(byteBuffer.getFloat());
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
}

