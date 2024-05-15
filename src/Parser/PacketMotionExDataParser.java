package Parser;

import Packets.PacketMotionExData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketMotionExDataParser extends F1Parser<PacketMotionExData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketMotionExDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketMotionExData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketMotionExData data = new PacketMotionExData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        // Suspension position, velocity, and acceleration arrays
        data.setSuspensionPosition(readFloatArray(byteBuffer, 4));
        data.setSuspensionVelocity(readFloatArray(byteBuffer, 4));
        data.setSuspensionAcceleration(readFloatArray(byteBuffer, 4));
        data.setWheelSpeed(readFloatArray(byteBuffer, 4));
        data.setWheelSlipRatio(readFloatArray(byteBuffer, 4));
        data.setWheelSlipAngle(readFloatArray(byteBuffer, 4));
        data.setWheelLatForce(readFloatArray(byteBuffer, 4));
        data.setWheelLongForce(readFloatArray(byteBuffer, 4));
        data.setWheelVertForce(readFloatArray(byteBuffer, 4));

        // Additional motion parameters
        data.setHeightOfCOGAboveGround(byteBuffer.getFloat());
        data.setLocalVelocityX(byteBuffer.getFloat());
        data.setLocalVelocityY(byteBuffer.getFloat());
        data.setLocalVelocityZ(byteBuffer.getFloat());
        data.setAngularVelocityX(byteBuffer.getFloat());
        data.setAngularVelocityY(byteBuffer.getFloat());
        data.setAngularVelocityZ(byteBuffer.getFloat());
        data.setAngularAccelerationX(byteBuffer.getFloat());
        data.setAngularAccelerationY(byteBuffer.getFloat());
        data.setAngularAccelerationZ(byteBuffer.getFloat());
        data.setFrontWheelsAngle(byteBuffer.getFloat());

        return data;
    }

    private float[] readFloatArray(ByteBuffer byteBuffer, int length) {
        float[] array = new float[length];
        for (int i = 0; i < length; i++) {
            array[i] = byteBuffer.getFloat();
        }
        return array;
    }
}

