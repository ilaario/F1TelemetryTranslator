package Parser;

import Constants.PacketSize;
import Packets.LapData;
import Packets.PacketLapData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketLapDataParser extends F1Parser<PacketLapData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketLapDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketLapData parse(ByteBuffer byteBuffer) {
        if (getRemainingBytes(byteBuffer) < PacketSize.LAP_DATA.getSize()) {
            System.err.println("PLD Error: Motion packet size is too small. \n\tExpected at least " + PacketSize.LAP_DATA.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketLapData data = new PacketLapData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        int numberOfLaps = packetFormat >= 2020 ? 22 : 20;
        List<LapData> lapDataList = new ArrayList<>();
        LapDataParser lapDataParser = new LapDataParser(packetFormat);
        for (int i = 0; i < numberOfLaps; i++) {
            lapDataList.add(lapDataParser.parse(byteBuffer));
        }
        data.setLapData(lapDataList);

        if (packetFormat >= 2022) {
            data.setM_timeTrialPBCarIdx(byteBuffer.get() & 0xFF);
            data.setM_timeTrialRivalCarIdx(byteBuffer.get() & 0xFF);
        }

        return data;
    }
}

