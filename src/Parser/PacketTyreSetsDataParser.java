package Parser;

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

