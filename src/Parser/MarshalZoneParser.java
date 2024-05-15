package Parser;

import Packets.MarshalZone;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MarshalZoneParser extends F1Parser<MarshalZone> {

    public MarshalZoneParser() {
        // Constructor can be empty as there's no specific initialization required here
    }

    @Override
    protected MarshalZone parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        MarshalZone data = new MarshalZone();

        data.setM_zoneStart(byteBuffer.getFloat());
        data.setM_zoneFlag(byteBuffer.get());

        return data;
    }
}

