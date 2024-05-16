package Parser;

import Packets.MotionData;
import Packets.PacketMotionData;
import Constants.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketMotionDataParser extends F1Parser<PacketMotionData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketMotionDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketMotionData parse(ByteBuffer byteBuffer) {
        if (getRemainingBytes(byteBuffer) < PacketSize.MOTION.getSize()) {
            System.err.println("PMD Error: Motion packet size is too small. \n\tExpected at least " + PacketSize.MOTION.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketMotionData data = new PacketMotionData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        int numberOfCars = packetFormat >= 2020 ? 22 : 20;
        List<MotionData> carMotionDataList = new ArrayList<>();
        CarMotionDataParser carMotionDataParser = new CarMotionDataParser();
        for (int i = 0; i < 20; i++) {
            carMotionDataList.add(carMotionDataParser.parse(byteBuffer));
        }
        data.setCarMotionData(carMotionDataList);

        if (packetFormat <= 2022) {
            // Arrays of suspension data, wheel speed, wheel slip, etc.
            float[] suspensionPosition = new float[4];
            float[] suspensionVelocity = new float[4];
            float[] suspensionAcceleration = new float[4];
            float[] wheelSpeed = new float[4];
            float[] wheelSlip = new float[4];
            for (int i = 0; i < 4; i++) {
                suspensionPosition[i] = byteBuffer.getFloat();
                suspensionVelocity[i] = byteBuffer.getFloat();
                suspensionAcceleration[i] = byteBuffer.getFloat();
                wheelSpeed[i] = byteBuffer.getFloat();
                wheelSlip[i] = byteBuffer.getFloat();
            }
            data.setSuspensionPosition(suspensionPosition);
            data.setSuspensionVelocity(suspensionVelocity);
            data.setSuspensionAcceleration(suspensionAcceleration);
            data.setWheelSpeed(wheelSpeed);
            data.setWheelSlip(wheelSlip);

            // Local and angular velocities and accelerations
            data.setLocalVelocityX(byteBuffer.getFloat());
            data.setLocalVelocityY(byteBuffer.getFloat());
            data.setLocalVelocityZ(byteBuffer.getFloat());
            data.setAngularVelocityX(byteBuffer.getFloat());
            data.setAngularVelocityY(byteBuffer.getFloat());
            data.setAngularVelocityZ(byteBuffer.getFloat());
            data.setAngularAccelerationX(byteBuffer.getFloat());
            data.setAngularAccelerationY(byteBuffer.getFloat());
            data.setAngularAccelerationZ(byteBuffer.getFloat());

            // Front wheels angle
            data.setFrontWheelsAngle(byteBuffer.getFloat());
        }

        System.out.println("\n" + data.toString() + "\n");
        return data;
    }
}

