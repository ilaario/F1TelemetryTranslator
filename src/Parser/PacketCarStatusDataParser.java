package Parser;

import Constants.PacketSize;
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
        if (getRemainingBytes(byteBuffer) < PacketSize.CAR_STATUS.getSize()) {
            System.err.println("PCSTD Error:  Packet size is too small. \n\tExpected at least " + PacketSize.CAR_STATUS.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketCarStatusData data = new PacketCarStatusData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        int numberOfStatuses = packetFormat >= 2020 ? 22 : 20;
        List<CarStatusData> carStatusDataList = new ArrayList<>();
        CarStatusDataParser carStatusDataParser = new CarStatusDataParser(packetFormat);
        for (int i = 0; i < 20; i++) {
            carStatusDataList.add(carStatusDataParser.parse(byteBuffer));
            System.out.println("\tCar n" + i + " status = " + carStatusDataList.get(i).toString());
        }
        data.setCarStatusData(carStatusDataList);
        System.out.println("Car status data: " + data.getCarStatusData().toString());

        return data;
    }
}

