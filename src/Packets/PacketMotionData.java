package Packets;

import java.util.List;

public class PacketMotionData extends PacketBase {
    private List<MotionData> carMotionData;
    private List<Double> suspensionPosition;
    private List<Double> suspensionVelocity;
    private List<Double> suspensionAcceleration;
    private List<Double> wheelSpeed;
    private List<Double> wheelSlip;
    private Double localVelocityX;
    private Double localVelocityY;
    private Double localVelocityZ;
    private Double angularVelocityX;
    private Double angularVelocityY;
    private Double angularVelocityZ;
    private Double angularAccelerationX;
    private Double angularAccelerationY;

    // Getters and setters
    public List<MotionData> getCarMotionData() {
        return carMotionData;
    }

    public void setCarMotionData(List<MotionData> carMotionData) {
        this.carMotionData = carMotionData;
    }

    public List<Double> getSuspensionPosition() {
        return suspensionPosition;
    }

    public void setSuspensionPosition(List<Double> suspensionPosition) {
        this.suspensionPosition = suspensionPosition;
    }

    public List<Double> getSuspensionVelocity() {
        return suspensionVelocity;
    }

    public void setSuspensionVelocity(List<Double> suspensionVelocity) {
        this.suspensionVelocity = suspensionVelocity;
    }

    public List<Double> getSuspensionAcceleration() {
        return suspensionAcceleration;
    }

    public void setSuspensionAcceleration(List<Double> suspensionAcceleration) {
        this.suspensionAcceleration = suspensionAcceleration;
    }

    public List<Double> getWheelSpeed() {
        return wheelSpeed;
    }

    public void setWheelSpeed(List<Double> wheelSpeed) {
        this.wheelSpeed = wheelSpeed;
    }

    public List<Double> getWheelSlip() {
        return wheelSlip;
    }

    public void setWheelSlip(List<Double> wheelSlip) {
        this.wheelSlip = wheelSlip;
    }

    public Double getLocalVelocityX() {
        return localVelocityX;
    }

    public void setLocalVelocityX(Double localVelocityX) {
        this.localVelocityX = localVelocityX;
    }

    public Double getLocalVelocityY() {
        return localVelocityY;
    }

    public void setLocalVelocityY(Double localVelocityY) {
        this.localVelocityY = localVelocityY;
    }

    public Double getLocalVelocityZ() {
        return localVelocityZ;
    }

    public void setLocalVelocityZ(Double localVelocityZ) {
        this.localVelocityZ = localVelocityZ;
    }

    public Double getAngularVelocityX() {
        return angularVelocityX;
    }

    public void setAngularVelocityX(Double angularVelocityX) {
        this.angularVelocityX = angularVelocityX;
    }

    public Double getAngularVelocityY() {
        return angularVelocityY;
    }

    public void setAngularVelocityY(Double angularVelocityY) {
        this.angularVelocityY = angularVelocityY;
    }

    public Double getAngularVelocityZ() {
        return angularVelocityZ;
    }

    public void setAngularVelocityZ(Double angularVelocityZ) {
        this.angularVelocityZ = angularVelocityZ;
    }

    public Double getAngularAccelerationX() {
        return angularAccelerationX;
    }

    public void setAngularAccelerationX(Double angularAccelerationX) {
        this.angularAccelerationX = angularAccelerationX;
    }

    public Double getAngularAccelerationY() {
        return angularAccelerationY;
    }

    public void setAngularAccelerationY(Double angularAccelerationY) {
        this.angularAccelerationY = angularAccelerationY;
    }
}

