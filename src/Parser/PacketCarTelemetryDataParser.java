package Parser;

import Packets.CarTelemetryData;
import Packets.PacketCarTelemetryData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketCarTelemetryDataParser extends F1Parser<PacketCarTelemetryData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketCarTelemetryDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketCarTelemetryData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketCarTelemetryData data = new PacketCarTelemetryData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        int numberOfTelemetries = packetFormat >= 2020 ? 22 : 20;
        List<CarTelemetryData> carTelemetryDataList = new ArrayList<>();
        CarTelemetryDataParser carTelemetryDataParser = new CarTelemetryDataParser(packetFormat);
        for (int i = 0; i < numberOfTelemetries; i++) {
            carTelemetryDataList.add(carTelemetryDataParser.parse(byteBuffer));
        }
        data.setM_carTelemetryData(carTelemetryDataList);

        if (packetFormat >= 2018 && packetFormat <= 2020) {
            data.setM_buttonStatus(byteBuffer.getInt());
        }

        if (packetFormat >= 2020) {
            data.setM_mfdPanelIndex(byteBuffer.get() & 0xFF);
            data.setM_mfdPanelIndexSecondaryPlayer(byteBuffer.get() & 0xFF);
            data.setM_suggestedGear(byteBuffer.get());
        }

        return data;
    }
}

