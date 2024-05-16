package Packets;

import java.util.Arrays;
import java.util.List;

public class PacketMotionData extends PacketBase {
    private List<MotionData> carMotionData;
    private float[] suspensionPosition = new float[4];
    private float[] suspensionVelocity = new float[4];
    private float[] suspensionAcceleration = new float[4];
    private float[] wheelSpeed = new float[4];
    private float[] wheelSlip = new float[4];
    private float localVelocityX;
    private float localVelocityY;
    private float localVelocityZ;
    private float angularVelocityX;
    private float angularVelocityY;
    private float angularVelocityZ;
    private float angularAccelerationX;
    private float angularAccelerationY;
    private float angularAccelerationZ;
    private float frontWheelsAngle;

    // Getters and setters
    public List<MotionData> getCarMotionData() {
        return carMotionData;
    }

    public void setCarMotionData(List<MotionData> carMotionData) {
        this.carMotionData = carMotionData;
    }

    public float[] getSuspensionPosition() {
        return suspensionPosition;
    }

    public void setSuspensionPosition(float[] suspensionPosition) {
        this.suspensionPosition = suspensionPosition;
    }

    public float[] getSuspensionVelocity() {
        return suspensionVelocity;
    }

    public void setSuspensionVelocity(float[] suspensionVelocity) {
        this.suspensionVelocity = suspensionVelocity;
    }

    public float[] getSuspensionAcceleration() {
        return suspensionAcceleration;
    }

    public void setSuspensionAcceleration(float[] suspensionAcceleration) {
        this.suspensionAcceleration = suspensionAcceleration;
    }

    public float[] getWheelSpeed() {
        return wheelSpeed;
    }

    public void setWheelSpeed(float[] wheelSpeed) {
        this.wheelSpeed = wheelSpeed;
    }

    public float[] getWheelSlip() {
        return wheelSlip;
    }

    public void setWheelSlip(float[] wheelSlip) {
        this.wheelSlip = wheelSlip;
    }

    public float getLocalVelocityX() {
        return localVelocityX;
    }

    public void setLocalVelocityX(float localVelocityX) {
        this.localVelocityX = localVelocityX;
    }

    public float getLocalVelocityY() {
        return localVelocityY;
    }

    public void setLocalVelocityY(float localVelocityY) {
        this.localVelocityY = localVelocityY;
    }

    public float getLocalVelocityZ() {
        return localVelocityZ;
    }

    public void setLocalVelocityZ(float localVelocityZ) {
        this.localVelocityZ = localVelocityZ;
    }

    public float getAngularVelocityX() {
        return angularVelocityX;
    }

    public void setAngularVelocityX(float angularVelocityX) {
        this.angularVelocityX = angularVelocityX;
    }

    public float getAngularVelocityY() {
        return angularVelocityY;
    }

    public void setAngularVelocityY(float angularVelocityY) {
        this.angularVelocityY = angularVelocityY;
    }

    public float getAngularVelocityZ() {
        return angularVelocityZ;
    }

    public void setAngularVelocityZ(float angularVelocityZ) {
        this.angularVelocityZ = angularVelocityZ;
    }

    public float getAngularAccelerationX() {
        return angularAccelerationX;
    }

    public void setAngularAccelerationX(float angularAccelerationX) {
        this.angularAccelerationX = angularAccelerationX;
    }

    public float getAngularAccelerationY() {
        return angularAccelerationY;
    }

    public void setAngularAccelerationY(float angularAccelerationY) {
        this.angularAccelerationY = angularAccelerationY;
    }

    public float getAngularAccelerationZ() {
        return angularAccelerationZ;
    }

    public void setAngularAccelerationZ(float angularAccelerationZ) {
        this.angularAccelerationZ = angularAccelerationZ;
    }

    public float getFrontWheelsAngle() {
        return frontWheelsAngle;
    }

    public void setFrontWheelsAngle(float frontWheelsAngle) {
        this.frontWheelsAngle = frontWheelsAngle;
    }

    @Override
    public String toString() {
        return "PacketMotionData{" +
                "\n\tsuspensionPosition=" + Arrays.toString(suspensionPosition) +
                ",\n\tsuspensionVelocity=" + Arrays.toString(suspensionVelocity) +
                ",\n\tsuspensionAcceleration=" + Arrays.toString(suspensionAcceleration) +
                ",\n\twheelSpeed=" + Arrays.toString(wheelSpeed) +
                ",\n\twheelSlip=" + Arrays.toString(wheelSlip) +
                ",\n\tlocalVelocityX=" + localVelocityX +
                ",\n\tlocalVelocityY=" + localVelocityY +
                ",\n\tlocalVelocityZ=" + localVelocityZ +
                ",\n\tangularVelocityX=" + angularVelocityX +
                ",\n\tangularVelocityY=" + angularVelocityY +
                ",\n\tangularVelocityZ=" + angularVelocityZ +
                ",\n\tangularAccelerationX=" + angularAccelerationX +
                ",\n\tangularAccelerationY=" + angularAccelerationY +
                ",\n\tangularAccelerationZ=" + angularAccelerationZ +
                ",\n\tfrontWheelsAngle=" + frontWheelsAngle +
                '}';
    }
}

