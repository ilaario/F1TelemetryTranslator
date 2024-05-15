package Parser;

import Packets.LapHistoryData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class LapHistoryDataParser extends F1Parser<LapHistoryData> {
    private final int packetFormat;

    public LapHistoryDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected LapHistoryData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN); // Set the byte order to little endian

        LapHistoryData data = new LapHistoryData();

        // Always present fields
        data.setM_lapTimeInMS(byteBuffer.getInt());
        data.setM_sector1TimeInMS(byteBuffer.getShort() & 0xFFFF);

        // Conditional fields based on packet format for 2023 and beyond
        if (packetFormat >= 2023) {
            data.setM_sector1TimeMinutes(byteBuffer.get() & 0xFF);
        }

        // Continue with sector 2 time
        data.setM_sector2TimeInMS(byteBuffer.getShort() & 0xFFFF);

        if (packetFormat >= 2023) {
            data.setM_sector2TimeMinutes(byteBuffer.get() & 0xFF);
        }

        // Sector 3 time and conditions for sector 3 minutes
        data.setM_sector3TimeInMS(byteBuffer.getShort() & 0xFFFF);

        if (packetFormat >= 2023) {
            data.setM_sector3TimeMinutes(byteBuffer.get() & 0xFF);
        }

        // Lap validation flags
        data.setM_lapValidBitFlags(byteBuffer.get() & 0xFF);

        return data;
    }
}

