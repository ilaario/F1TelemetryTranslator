package Parser;

import Packets.PacketHeaderBase;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PacketFormatParser extends F1Parser<PacketHeaderBase> {

    public PacketFormatParser() {
        // Constructor can be empty as there's no specific initialization required here
    }

    @Override
    protected PacketHeaderBase parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketHeaderBase data = new PacketHeaderBase();

        data.setPacketFormat(byteBuffer.getShort() & 0xFFFF);

        return data;
    }
}

