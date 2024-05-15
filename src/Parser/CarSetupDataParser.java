package Parser;

import Packets.CarSetupData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CarSetupDataParser extends F1Parser<CarSetupData> {
    private final int packetFormat;

    public CarSetupDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected CarSetupData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN); // Set byte order to little endian

        CarSetupData data = new CarSetupData();

        // Parsing all the uint8 values
        data.setFrontWing(byteBuffer.get() & 0xFF);
        data.setRearWing(byteBuffer.get() & 0xFF);
        data.setOnThrottle(byteBuffer.get() & 0xFF);
        data.setOffThrottle(byteBuffer.get() & 0xFF);

        // Parsing all the float values
        data.setFrontCamber(byteBuffer.getFloat());
        data.setRearCamber(byteBuffer.getFloat());
        data.setFrontToe(byteBuffer.getFloat());
        data.setRearToe(byteBuffer.getFloat());

        // More uint8 values
        data.setFrontSuspension(byteBuffer.get() & 0xFF);
        data.setRearSuspension(byteBuffer.get() & 0xFF);
        data.setFrontAntiRollBar(byteBuffer.get() & 0xFF);
        data.setRearAntiRollBar(byteBuffer.get() & 0xFF);
        data.setFrontSuspensionHeight(byteBuffer.get() & 0xFF);
        data.setRearSuspensionHeight(byteBuffer.get() & 0xFF);
        data.setBrakePressure(byteBuffer.get() & 0xFF);
        data.setBrakeBias(byteBuffer.get() & 0xFF);

        // Conditionally parse the tyre pressures based on packet format
        if (this.packetFormat >= 2020) {
            data.setRearLeftTyrePressure(byteBuffer.getFloat());
            data.setRearRightTyrePressure(byteBuffer.getFloat());
            data.setFrontLeftTyrePressure(byteBuffer.getFloat());
            data.setFrontRightTyrePressure(byteBuffer.getFloat());
        } else {
            data.setFrontTyrePressure(byteBuffer.getFloat()); // Assumes same pressure for both front tyres
            data.setRearTyrePressure(byteBuffer.getFloat());  // Assumes same pressure for both rear tyres
        }

        // Continue parsing the last uint8 and float values
        data.setBallast(byteBuffer.get() & 0xFF);
        data.setFuelLoad(byteBuffer.getFloat());

        return data;
    }
}

