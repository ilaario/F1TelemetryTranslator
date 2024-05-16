package Parser;

import Constants.PacketSize;
import Packets.CarDamageData;
import Packets.PacketCarDamageData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketCarDamageDataParser extends F1Parser<PacketCarDamageData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketCarDamageDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketCarDamageData parse(ByteBuffer byteBuffer) {
        if (getRemainingBytes(byteBuffer) < PacketSize.CAR_DAMAGE.getSize()) {
            System.err.println("PCD Error: Packet size is too small. \n\tExpected at least " + PacketSize.CAR_DAMAGE.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketCarDamageData data = new PacketCarDamageData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        List<CarDamageData> carDamageDataList = new ArrayList<>();
        CarDamageDataParser carDamageDataParser = new CarDamageDataParser(packetFormat);
        for (int i = 0; i < 22; i++) { // Fixed length from TS definition
            carDamageDataList.add(carDamageDataParser.parse(byteBuffer));
        }
        data.setCarDamageData(carDamageDataList);

        return data;
    }
}

