package Packets;

import java.util.List;

public class PacketMotionExData extends PacketBase {
    private List<Double> suspensionPosition;
    private List<Double> suspensionVelocity;
    private List<Double> suspensionAcceleration;
    private List<Double> wheelSpeed;
    private List<Double> wheelSlipRatio;
    private List<Double> wheelSlipAngle;
    private List<Double> wheelLatForce;
    private List<Double> wheelLongForce;
    private double heightOfCOGAboveGround;
    private double localVelocityX;
    private double localVelocityY;
    private double localVelocityZ;

    // Getters and setters
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

    public List<Double> getWheelSlipRatio() {
        return wheelSlipRatio;
    }

    public void setWheelSlipRatio(List<Double> wheelSlipRatio) {
        this.wheelSlipRatio = wheelSlipRatio;
    }

    public List<Double> getWheelSlipAngle() {
        return wheelSlipAngle;
    }

    public void setWheelSlipAngle(List<Double> wheelSlipAngle) {
        this.wheelSlipAngle = wheelSlipAngle;
    }

    public List<Double> getWheelLatForce() {
        return wheelLatForce;
    }

    public void setWheelLatForce(List<Double> wheelLatForce) {
        this.wheelLatForce = wheelLatForce;
    }

    public List<Double> getWheelLongForce() {
        return wheelLongForce;
    }

    public void setWheelLongForce(List<Double> wheelLongForce) {
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
}
