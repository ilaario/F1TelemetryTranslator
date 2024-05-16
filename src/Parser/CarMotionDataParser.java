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
        //System.out.println("World Position X: " + data.getWorldPositionX());
        data.setWorldPositionY(byteBuffer.getFloat());
        //System.out.println("World Position Y: " + data.getWorldPositionY());
        data.setWorldPositionZ(byteBuffer.getFloat());
        //System.out.println("World Position Z: " + data.getWorldPositionZ());
        data.setWorldVelocityX(byteBuffer.getFloat());
        //System.out.println("World Velocity X: " + data.getWorldVelocityX());
        data.setWorldVelocityY(byteBuffer.getFloat());
        //System.out.println("World Velocity Y: " + data.getWorldVelocityY());
        data.setWorldVelocityZ(byteBuffer.getFloat());
        //System.out.println("World Velocity Z: " + data.getWorldVelocityZ());

        // Read short integers for world directions
        data.setWorldForwardDirX(byteBuffer.getShort());
        //System.out.println("World Forward Dir X: " + data.getWorldForwardDirX());
        data.setWorldForwardDirY(byteBuffer.getShort());
        //System.out.println("World Forward Dir Y: " + data.getWorldForwardDirY());
        data.setWorldForwardDirZ(byteBuffer.getShort());
        //System.out.println("World Forward Dir Z: " + data.getWorldForwardDirZ());
        data.setWorldRightDirX(byteBuffer.getShort());
        //System.out.println("World Right Dir X: " + data.getWorldRightDirX());
        data.setWorldRightDirY(byteBuffer.getShort());
        //System.out.println("World Right Dir Y: " + data.getWorldRightDirY());
        data.setWorldRightDirZ(byteBuffer.getShort());
        //System.out.println("World Right Dir Z: " + data.getWorldRightDirZ());

        // Read floating point values for g-forces and orientation
        data.setGForceLateral(byteBuffer.getFloat());
        //System.out.println("GForce Lateral: " + data.getGForceLateral());
        data.setGForceLongitudinal(byteBuffer.getFloat());
        //System.out.println("GForce Longitudinal: " + data.getGForceLongitudinal());
        data.setGForceVertical(byteBuffer.getFloat());
        //System.out.println("GForce Vertical: " + data.getGForceVertical());
        data.setYaw(byteBuffer.getFloat());
        //System.out.println("Yaw: " + data.getYaw());
        data.setPitch(byteBuffer.getFloat());
        //System.out.println("Pitch: " + data.getPitch());
        data.setRoll(byteBuffer.getFloat());
        //System.out.println("Roll: " + data.getRoll());

        return data;
    }
}

