package Parser;

import Packets.LapData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class LapDataParser extends F1Parser<LapData> {
    private final int packetFormat;

    public LapDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected LapData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        LapData data = new LapData();

        // Conditional parsing for different packet formats
        if (packetFormat >= 2021) {
            data.setM_lastLapTimeInMS(byteBuffer.getInt());
            data.setM_currentLapTimeInMS(byteBuffer.getInt());
        } else {
            data.setM_lastLapTime(byteBuffer.getFloat());
            data.setM_currentLapTime(byteBuffer.getFloat());
        }

        if (packetFormat >= 2020) {
            data.setM_sector1TimeInMS(byteBuffer.getShort() & 0xFFFF);
        }
        if (packetFormat >= 2023) {
            data.setM_sector1TimeMinutes(byteBuffer.get() & 0xFF);
        }
        if (packetFormat >= 2020) {
            data.setM_sector2TimeInMS(byteBuffer.getShort() & 0xFFFF);
        }
        if (packetFormat >= 2023) {
            data.setM_sector2TimeMinutes(byteBuffer.get() & 0xFF);
            data.setM_deltaToCarInFrontInMS(byteBuffer.getShort() & 0xFFFF);
            data.setM_deltaToRaceLeaderInMS(byteBuffer.getShort() & 0xFFFF);
        }

        if (packetFormat >= 2018 && packetFormat <= 2020) {
            data.setM_bestLapTime(byteBuffer.getFloat());
        }

        if (packetFormat == 2018 || packetFormat == 2019) {
            data.setM_sector1Time(byteBuffer.getFloat());
            data.setM_sector2Time(byteBuffer.getFloat());
        }

        // More conditions based on specific years
        if (packetFormat == 2020) {
            // Similar pattern for setting values based on ByteBuffer data
        }

        // General parsing that does not depend on packet format
        data.setM_lapDistance(byteBuffer.getFloat());
        data.setM_totalDistance(byteBuffer.getFloat());
        data.setM_safetyCarDelta(byteBuffer.getFloat());
        data.setM_carPosition(byteBuffer.get() & 0xFF);
        data.setM_currentLapNum(byteBuffer.get() & 0xFF);
        data.setM_pitStatus(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2021) {
            data.setM_numPitStops(byteBuffer.get() & 0xFF);
        }

        // Continue with similar pattern
        data.setM_sector(byteBuffer.get() & 0xFF);
        data.setM_currentLapInvalid(byteBuffer.get() & 0xFF);
        data.setM_penalties(byteBuffer.get() & 0xFF);

        // More conditional parsing for different packet formats
        if (packetFormat >= 2023) {
            data.setM_totalWarnings(byteBuffer.get() & 0xFF);
            data.setM_cornerCuttingWarnings(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2021) {
            // Similar pattern for setting values based on ByteBuffer data
        }

        // Final parsing for grid position, driver status, and result status
        data.setM_gridPosition(byteBuffer.get() & 0xFF);
        data.setM_driverStatus(byteBuffer.get() & 0xFF);
        data.setM_resultStatus(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2021) {
            // Similar pattern for setting values based on ByteBuffer data
        }

        return data;
    }
}

