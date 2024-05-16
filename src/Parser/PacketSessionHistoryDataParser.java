package Parser;

import Constants.PacketSize;
import Packets.LapHistoryData;
import Packets.PacketSessionHistoryData;
import Packets.TyreStintsHistoryData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketSessionHistoryDataParser extends F1Parser<PacketSessionHistoryData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketSessionHistoryDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketSessionHistoryData parse(ByteBuffer byteBuffer) {
        if (getRemainingBytes(byteBuffer) < PacketSize.SESSION_HISTORY.getSize()) {
            System.err.println("PSHD Error: Motion packet size is too small. \n\tExpected at least " + PacketSize.SESSION_HISTORY.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketSessionHistoryData data = new PacketSessionHistoryData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        data.setM_carIdx(byteBuffer.get() & 0xFF);
        data.setM_numLaps(byteBuffer.get() & 0xFF);
        data.setM_numTyreStints(byteBuffer.get() & 0xFF);
        data.setM_bestLapTimeLapNum(byteBuffer.get() & 0xFF);
        data.setM_bestSector1LapNum(byteBuffer.get() & 0xFF);
        data.setM_bestSector2LapNum(byteBuffer.get() & 0xFF);
        data.setM_bestSector3LapNum(byteBuffer.get() & 0xFF);

        List<LapHistoryData> lapHistoryDataList = new ArrayList<>();
        LapHistoryDataParser lapHistoryDataParser = new LapHistoryDataParser(packetFormat);
        for (int i = 0; i < 100; i++) { // The array length is fixed at 100
            lapHistoryDataList.add(lapHistoryDataParser.parse(byteBuffer));
        }
        data.setM_lapHistoryData(lapHistoryDataList);

        List<TyreStintsHistoryData> tyreStintsHistoryDataList = new ArrayList<>();
        TyreStintsHistoryDataParser tyreStintsHistoryDataParser = new TyreStintsHistoryDataParser();
        for (int i = 0; i < 8; i++) { // The array length is fixed at 8
            tyreStintsHistoryDataList.add(tyreStintsHistoryDataParser.parse(byteBuffer));
        }
        data.setM_tyreStintsHistoryData(tyreStintsHistoryDataList);

        return data;
    }
}

