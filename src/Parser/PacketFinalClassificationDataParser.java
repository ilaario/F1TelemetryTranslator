package Parser;

import Packets.FinalClassificationData;
import Packets.PacketFinalClassificationData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketFinalClassificationDataParser extends F1Parser<PacketFinalClassificationData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketFinalClassificationDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketFinalClassificationData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketFinalClassificationData data = new PacketFinalClassificationData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        data.setM_numCars(byteBuffer.get() & 0xFF);

        List<FinalClassificationData> classificationDataList = new ArrayList<>();
        FinalClassificationDataParser classificationDataParser = new FinalClassificationDataParser(packetFormat);
        for (int i = 0; i < 22; i++) { // The array length is fixed at 22 as per your definition
            classificationDataList.add(classificationDataParser.parse(byteBuffer));
        }
        data.setM_classificationData(classificationDataList);

        return data;
    }
}

