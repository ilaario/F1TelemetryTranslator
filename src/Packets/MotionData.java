package Packets;

public class MotionData {
    private double worldPositionX;
    private double worldPositionY;
    private double worldPositionZ;
    private double worldVelocityX;
    private double worldVelocityY;
    private double worldVelocityZ;
    private int worldForwardDirX;
    private int worldForwardDirY;
    private int worldForwardDirZ;
    private int worldRightDirX;
    private int worldRightDirY;
    private int worldRightDirZ;
    private double gForceLateral;
    private double gForceLongitudinal;
    private double gForceVertical;
    private double yaw;
    private double pitch;
    private double roll;

    // Getters and setters
    public double getWorldPositionX() {
        return worldPositionX;
    }

    public void setWorldPositionX(double worldPositionX) {
        this.worldPositionX = worldPositionX;
    }

    public double getWorldPositionY() {
        return worldPositionY;
    }

    public void setWorldPositionY(double worldPositionY) {
        this.worldPositionY = worldPositionY;
    }

    public double getWorldPositionZ() {
        return worldPositionZ;
    }

    public void setWorldPositionZ(double worldPositionZ) {
        this.worldPositionZ = worldPositionZ;
    }

    public double getWorldVelocityX() {
        return worldVelocityX;
    }

    public void setWorldVelocityX(double worldVelocityX) {
        this.worldVelocityX = worldVelocityX;
    }

    public double getWorldVelocityY() {
        return worldVelocityY;
    }

    public void setWorldVelocityY(double worldVelocityY) {
        this.worldVelocityY = worldVelocityY;
    }

    public double getWorldVelocityZ() {
        return worldVelocityZ;
    }

    public void setWorldVelocityZ(double worldVelocityZ) {
        this.worldVelocityZ = worldVelocityZ;
    }

    public int getWorldForwardDirX() {
        return worldForwardDirX;
    }

    public void setWorldForwardDirX(int worldForwardDirX) {
        this.worldForwardDirX = worldForwardDirX;
    }

    public int getWorldForwardDirY() {
        return worldForwardDirY;
    }

    public void setWorldForwardDirY(int worldForwardDirY) {
        this.worldForwardDirY = worldForwardDirY;
    }

    public void setWorldForwardDirZ(int WorldForwardDirZ) {
        this.worldForwardDirZ = WorldForwardDirZ;
    }

    public int getWorldRightDirX() {
        return worldRightDirX;
    }

    public void setWorldRightDirX(int worldRightDirX) {
        this.worldRightDirX = worldRightDirX;
    }

    public int getWorldRightDirY() {
        return worldRightDirY;
    }

    public void setWorldRightDirY(int worldRightDirY) {
        this.worldRightDirY = worldRightDirY;
    }

    public int getWorldRightDirZ() {
        return worldRightDirZ;
    }

    public void setWorldRightDirZ(int worldRightDirZ) {
        this.worldRightDirZ = worldRightDirZ;
    }

    public double getGForceLateral() {
        return gForceLateral;
    }

    public void setGForceLateral(double gForceLateral) {
        this.gForceLateral = gForceLateral;
    }

    public double getGForceLongitudinal() {
        return gForceLongitudinal;
    }

    public void setGForceLongitudinal(double gForceLongitudinal) {
        this.gForceLongitudinal = gForceLongitudinal;
    }

    public double getGForceVertical() {
        return gForceVertical;
    }

    public void setGForceVertical(double gForceVertical) {
        this.gForceVertical = gForceVertical;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public MotionData() {
        super();
    }

    public int getWorldForwardDirZ() {
        return worldForwardDirZ;
    }

    @Override
    public String toString() {
        return "MotionData [\n\t\tgForceLateral=" + gForceLateral + ",\n\t\tgForceLongitudinal=" + gForceLongitudinal
                + ",\n\t\tgForceVertical=" + gForceVertical + ",\n\t\tpitch=" + pitch + ",\n\t\troll=" + roll + ",\n\t\tworldForwardDirX="
                + worldForwardDirX + ",\n\t\tworldForwardDirY=" + worldForwardDirY + ",\n\t\tworldForwardDirZ=" + worldForwardDirZ
                + ",\n\t\tworldPositionX=" + worldPositionX + ",\n\t\tworldPositionY=" + worldPositionY + ",\n\t\tworldPositionZ="
                + worldPositionZ + ", worldRightDirX=" + worldRightDirX + ", worldRightDirY=" + worldRightDirY
                + ",\n\t\tworldRightDirZ=" + worldRightDirZ + ",\n\t\tworldVelocityX=" + worldVelocityX + ",\n\t\tworldVelocityY="
                + worldVelocityY + ",\n\t\tworldVelocityZ=" + worldVelocityZ + ",\n\t\tyaw=" + yaw + "]";
    }
}
