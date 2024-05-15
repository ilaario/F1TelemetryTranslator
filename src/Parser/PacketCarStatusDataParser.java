package Parser;

import Packets.CarStatusData;
import Packets.PacketCarStatusData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketCarStatusDataParser extends F1Parser<PacketCarStatusData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketCarStatusDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketCarStatusData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketCarStatusData data = new PacketCarStatusData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        int numberOfStatuses = packetFormat >= 2020 ? 22 : 20;
        List<CarStatusData> carStatusDataList = new ArrayList<>();
        CarStatusDataParser carStatusDataParser = new CarStatusDataParser(packetFormat);
        for (int i = 0; i < numberOfStatuses; i++) {
            carStatusDataList.add(carStatusDataParser.parse(byteBuffer));
        }
        data.setCarStatusData(carStatusDataList);

        return data;
    }
}

