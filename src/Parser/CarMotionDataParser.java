package Parser;

import Packets.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CarMotionDataParser extends F1Parser<MotionData> {

    public CarMotionDataParser() {
        // Constructor body can remain empty if there's nothing to initialize
    }

    @Override
    protected MotionData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN); // Assuming data is little endian as in most game data

        MotionData data = new MotionData();

        // Read floating point values for world position and velocity
        data.setWorldPositionX(byteBuffer.getFloat());
        data.setWorldPositionY(byteBuffer.getFloat());
        data.setWorldPositionZ(byteBuffer.getFloat());
        data.setWorldVelocityX(byteBuffer.getFloat());
        data.setWorldVelocityY(byteBuffer.getFloat());
        data.setWorldVelocityZ(byteBuffer.getFloat());

        // Read short integers for world directions
        data.setWorldForwardDirX(byteBuffer.getShort());
        data.setWorldForwardDirY(byteBuffer.getShort());
        data.setWorldForwardDirZ(byteBuffer.getShort());
        data.setWorldRightDirX(byteBuffer.getShort());
        data.setWorldRightDirY(byteBuffer.getShort());
        data.setWorldRightDirZ(byteBuffer.getShort());

        // Read floating point values for g-forces and orientation
        data.setGForceLateral(byteBuffer.getFloat());
        data.setGForceLongitudinal(byteBuffer.getFloat());
        data.setGForceVertical(byteBuffer.getFloat());
        data.setYaw(byteBuffer.getFloat());
        data.setPitch(byteBuffer.getFloat());
        data.setRoll(byteBuffer.getFloat());

        return data;
    }
}

