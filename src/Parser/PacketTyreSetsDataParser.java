package Parser;

import Constants.PacketSize;
import Packets.PacketTyreSetsData;
import Packets.TyreSetData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketTyreSetsDataParser extends F1Parser<PacketTyreSetsData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketTyreSetsDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketTyreSetsData parse(ByteBuffer byteBuffer) {
        if (getRemainingBytes(byteBuffer) < PacketSize.TYRE_SETS.getSize()) {
            System.err.println("PTSD Error: Motion packet size is too small. \n\tExpected at least " + PacketSize.TYRE_SETS.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketTyreSetsData data = new PacketTyreSetsData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        data.setM_carIdx(byteBuffer.get() & 0xFF);

        List<TyreSetData> tyreSetDataList = new ArrayList<>();
        TyreSetDataParser tyreSetDataParser = new TyreSetDataParser();
        for (int i = 0; i < 20; i++) { // The array length is fixed at 20
            tyreSetDataList.add(tyreSetDataParser.parse(byteBuffer));
        }
        data.setM_tyreSetData(tyreSetDataList);

        data.setM_fittedIdx(byteBuffer.get() & 0xFF);

        return data;
    }
}

