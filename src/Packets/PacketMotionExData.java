package Packets;

import java.util.List;

public class PacketMotionExData extends PacketBase {
    private float[] suspensionPosition;
    private float[] suspensionVelocity;
    private float[] suspensionAcceleration;
    private float[] wheelSpeed;
    private float[] wheelSlipRatio;
    private float[] wheelSlipAngle;
    private float[] wheelLatForce;
    private float[] wheelLongForce;
    private double heightOfCOGAboveGround;
    private double localVelocityX;
    private double localVelocityY;
    private double localVelocityZ;
    private float[] wheelVertForce;
    private float AngularVelocityX;
    private float AngularVelocityY;
    private float AngularVelocityZ;
    private float AngularAccelerationX;
    private float AngularAccelerationY;
    private float AngularAccelerationZ;
    private float FrontWheelsAngle;

    // Getters and setters
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

    public float[] getWheelSlipRatio() {
        return wheelSlipRatio;
    }

    public void setWheelSlipRatio(float[] wheelSlipRatio) {
        this.wheelSlipRatio = wheelSlipRatio;
    }

    public float[] getWheelSlipAngle() {
        return wheelSlipAngle;
    }

    public void setWheelSlipAngle(float[] wheelSlipAngle) {
        this.wheelSlipAngle = wheelSlipAngle;
    }

    public float[] getWheelLatForce() {
        return wheelLatForce;
    }

    public void setWheelLatForce(float[] wheelLatForce) {
        this.wheelLatForce = wheelLatForce;
    }

    public float[] getWheelLongForce() {
        return wheelLongForce;
    }

    public void setWheelLongForce(float[] wheelLongForce) {
        this.wheelLongForce = wheelLongForce;
    }

    public double getHeightOfCOGAboveGround() {
        return heightOfCOGAboveGround;
    }

    public void setHeightOfCOGAboveGround(double heightOfCOGAboveGround) {
        this.heightOfCOGAboveGround = heightOfCOGAboveGround;
    }

    public double getLocalVelocityX() {
        return localVelocityX;
    }

    public void setLocalVelocityX(double localVelocityX) {
        this.localVelocityX = localVelocityX;
    }

    public double getLocalVelocityY() {
        return localVelocityY;
    }

    public void setLocalVelocityY(double localVelocityY) {
        this.localVelocityY = localVelocityY;
    }

    public double getLocalVelocityZ() {
        return localVelocityZ;
    }

    public void setLocalVelocityZ(double localVelocityZ) {
        this.localVelocityZ = localVelocityZ;
    }

    public float[] getWheelVertForce() {
        return wheelVertForce;
    }

    public void setWheelVertForce(float[] wheelVertForce) {
        this.wheelVertForce = wheelVertForce;
    }

    public float getAngularVelocityX() {
        return AngularVelocityX;
    }

    public void setAngularVelocityX(float AngularVelocityX) {
        this.AngularVelocityX = AngularVelocityX;

    }

    public float getAngularVelocityY() {
        return AngularVelocityY;
    }

    public void setAngularVelocityY(float AngularVelocityY) {
        this.AngularVelocityY = AngularVelocityY;
    }

    public float getAngularVelocityZ() {
        return AngularVelocityZ;
    }

    public void setAngularVelocityZ(float AngularVelocityZ) {
        this.AngularVelocityZ = AngularVelocityZ;
    }

    public float getAngularAccelerationX() {
        return AngularAccelerationX;
    }

    public void setAngularAccelerationX(float AngularAccelerationX) {
        this.AngularAccelerationX = AngularAccelerationX;
    }

    public float getAngularAccelerationY() {
        return AngularAccelerationY;
    }

    public void setAngularAccelerationY(float AngularAccelerationY) {
        this.AngularAccelerationY = AngularAccelerationY;
    }

    public float getAngularAccelerationZ() {
        return AngularAccelerationZ;
    }

    public void setAngularAccelerationZ(float AngularAccelerationZ) {
        this.AngularAccelerationZ = AngularAccelerationZ;
    }

    public float getFrontWheelsAngle() {
        return FrontWheelsAngle;
    }

    public void setFrontWheelsAngle(float FrontWheelsAngle) {
        this.FrontWheelsAngle = FrontWheelsAngle;
    }

    @Override
    public String toString() {
        return "PacketMotionExData{" +
                "suspensionPosition=" + suspensionPosition +
                ", suspensionVelocity=" + suspensionVelocity +
                ", suspensionAcceleration=" + suspensionAcceleration +
                ", wheelSpeed=" + wheelSpeed +
                ", wheelSlipRatio=" + wheelSlipRatio +
                ", wheelSlipAngle=" + wheelSlipAngle +
                ", wheelLatForce=" + wheelLatForce +
                ", wheelLongForce=" + wheelLongForce +
                ", heightOfCOGAboveGround=" + heightOfCOGAboveGround +
                ", localVelocityX=" + localVelocityX +
                ", localVelocityY=" + localVelocityY +
                ", localVelocityZ=" + localVelocityZ +
                ", wheelVertForce=" + wheelVertForce +
                ", AngularVelocityX=" + AngularVelocityX +
                ", AngularVelocityY=" + AngularVelocityY +
                ", AngularVelocityZ=" + AngularVelocityZ +
                ", AngularAccelerationX=" + AngularAccelerationX +
                ", AngularAccelerationY=" + AngularAccelerationY +
                ", AngularAccelerationZ=" + AngularAccelerationZ +
                ", FrontWheelsAngle=" + FrontWheelsAngle +
                '}';
    }
}
