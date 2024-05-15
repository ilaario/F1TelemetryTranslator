package Parser;

import Packets.CarSetupData;
import Packets.PacketCarSetupData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketCarSetupDataParser extends F1Parser<PacketCarSetupData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketCarSetupDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketCarSetupData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketCarSetupData data = new PacketCarSetupData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        int numberOfSetups = packetFormat >= 2020 ? 22 : 20;
        List<CarSetupData> carSetups = new ArrayList<>();
        CarSetupDataParser carSetupDataParser = new CarSetupDataParser(packetFormat);
        for (int i = 0; i < numberOfSetups; i++) {
            carSetups.add(carSetupDataParser.parse(byteBuffer));
        }
        data.setCarSetups(carSetups);

        return data;
    }
}

