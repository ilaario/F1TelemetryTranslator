package Parser;

import Packets.FinalClassificationData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FinalClassificationDataParser extends F1Parser<FinalClassificationData> {
    private final int packetFormat;

    public FinalClassificationDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected FinalClassificationData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);

        FinalClassificationData data = new FinalClassificationData();

        // Parsing uint8 values
        data.setM_position(byteBuffer.get() & 0xFF);
        data.setM_numLaps(byteBuffer.get() & 0xFF);
        data.setM_gridPosition(byteBuffer.get() & 0xFF);
        data.setM_points(byteBuffer.get() & 0xFF);
        data.setM_numPitStops(byteBuffer.get() & 0xFF);
        data.setM_resultStatus(byteBuffer.get() & 0xFF);

        // Conditional parsing based on packet format
        if (packetFormat >= 2021) {
            data.setM_bestLapTimeInMS(byteBuffer.getInt());
        } else {
            data.setM_bestLapTime(byteBuffer.getFloat());
        }

        data.setM_totalRaceTime(byteBuffer.getDouble());
        data.setM_penaltiesTime(byteBuffer.get() & 0xFF);
        data.setM_numPenalties(byteBuffer.get() & 0xFF);
        data.setM_numTyreStints(byteBuffer.get() & 0xFF);

        // Parsing arrays of uint8
        byte[] tyreStintsActual = new byte[8];
        byte[] tyreStintsVisual = new byte[8];
        byteBuffer.get(tyreStintsActual);
        byteBuffer.get(tyreStintsVisual);
        data.setM_tyreStintsActual(tyreStintsActual);
        data.setM_tyreStintsVisual(tyreStintsVisual);

        if (packetFormat >= 2022) {
            byte[] tyreStintsEndLaps = new byte[8];
            byteBuffer.get(tyreStintsEndLaps);
            data.setM_tyreStintsEndLaps(tyreStintsEndLaps);
        }

        return data;
    }
}

