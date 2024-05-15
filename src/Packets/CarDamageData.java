package Packets;

import java.util.ArrayList;
import java.util.List;

public class CarDamageData {
    private List<Float> tyresWear;
    private byte[] tyresDamage = new byte[4];
    private byte[] brakesDamage = new byte[4];
    private int frontLeftWingDamage;
    private int frontRightWingDamage;
    private int rearWingDamage;
    private int floorDamage;
    private int diffuserDamage;
    private int sidepodDamage;
    private int drsFault;
    private int ersFault;
    private int gearBoxDamage;
    private int engineDamage;
    private int engineMGUHWear;
    private int engineESWear;
    private int engineCEWear;
    private int engineICEWear;
    private int engineMGUKWear;
    private int engineTCWear;
    private int engineBlown;
    private int engineSeized;

    // Getters and setters
    public List<Float> getTyresWear() {
        return tyresWear;
    }

    public void setTyresWear(ArrayList<Float> tyresWear) {
        this.tyresWear = tyresWear;
    }

    public byte[] getTyresDamage() {
        return tyresDamage;
    }

    public void setTyresDamage(byte[] tyresDamage) {
        this.tyresDamage = tyresDamage;
    }

    public byte[] getBrakesDamage() {
        return brakesDamage;
    }

    public void setBrakesDamage(byte[] brakesDamage) {
        this.brakesDamage = brakesDamage;
    }

    public int getFrontLeftWingDamage() {
        return frontLeftWingDamage;
    }

    public void setFrontLeftWingDamage(int frontLeftWingDamage) {
        this.frontLeftWingDamage = frontLeftWingDamage;
    }

    public int getFrontRightWingDamage() {
        return frontRightWingDamage;
    }

    public void setFrontRightWingDamage(int frontRightWingDamage) {
        this.frontRightWingDamage = frontRightWingDamage;
    }

    public int getRearWingDamage() {
        return rearWingDamage;
    }

    public void setRearWingDamage(int rearWingDamage) {
        this.rearWingDamage = rearWingDamage;
    }

    public int getFloorDamage() {
        return floorDamage;
    }

    public void setFloorDamage(int floorDamage) {
        this.floorDamage = floorDamage;
    }

    public int getDiffuserDamage() {
        return diffuserDamage;
    }

    public void setDiffuserDamage(int diffuserDamage) {
        this.diffuserDamage = diffuserDamage;
    }

    public int getSidepodDamage() {
        return sidepodDamage;
    }

    public void setSidepodDamage(int sidepodDamage) {
        this.sidepodDamage = sidepodDamage;
    }

    public int getDrsFault() {
        return drsFault;
    }

    public void setDrsFault(int drsFault) {
        this.drsFault = drsFault;
    }

    public int getErsFault() {
        return ersFault;
    }

    public void setErsFault(int ersFault) {
        this.ersFault = ersFault;
    }

    public int getGearBoxDamage() {
        return gearBoxDamage;
    }

    public void setGearBoxDamage(int gearBoxDamage) {
        this.gearBoxDamage = gearBoxDamage;
    }

    public int getEngineDamage() {
        return engineDamage;
    }

    public void setEngineDamage(int engineDamage) {
        this.engineDamage = engineDamage;
    }

    public int getEngineMGUHWear() {
        return engineMGUHWear;
    }

    public void setEngineMGUHWear(int engineMGUHWear) {
        this.engineMGUHWear = engineMGUHWear;
    }

    public int getEngineESWear() {
        return engineESWear;
    }

    public void setEngineESWear(int engineESWear) {
        this.engineESWear = engineESWear;
    }

    public int getEngineCEWear() {
        return engineCEWear;
    }

    public void setEngineCEWear(int engineCEWear) {
        this.engineCEWear = engineCEWear;
    }

    public int getEngineICEWear() {
        return engineICEWear;
    }

    public void setEngineICEWear(int engineICEWear) {
        this.engineICEWear = engineICEWear;
    }

    public int getEngineMGUKWear() {
        return engineMGUKWear;
    }

    public void setEngineMGUKWear(int engineMGUKWear) {
        this.engineMGUKWear = engineMGUKWear;
    }

    public int getEngineTCWear() {
        return engineTCWear;
    }

    public void setEngineTCWear(int engineTCWear) {
        this.engineTCWear = engineTCWear;
    }

    public int getEngineBlown() {
        return engineBlown;
    }

    public void setEngineBlown(int engineBlown) {
        this.engineBlown = engineBlown;
    }

    public int getEngineSeized() {
        return engineSeized;
    }

    public void setEngineSeized(int engineSeized) {
        this.engineSeized = engineSeized;
    }

    @Override
    public String toString() {
        return "CarDamageData{" +
                "tyresWear=" + tyresWear +
                ", tyresDamage=" + tyresDamage +
                ", brakesDamage=" + brakesDamage +
                ", frontLeftWingDamage=" + frontLeftWingDamage +
                ", frontRightWingDamage=" + frontRightWingDamage +
                ", rearWingDamage=" + rearWingDamage +
                ", floorDamage=" + floorDamage +
                ", diffuserDamage=" + diffuserDamage +
                ", sidepodDamage=" + sidepodDamage +
                ", drsFault=" + drsFault +
                ", ersFault=" + ersFault +
                ", gearBoxDamage=" + gearBoxDamage +
                ", engineDamage=" + engineDamage +
                ", engineMGUHWear=" + engineMGUHWear +
                ", engineESWear=" + engineESWear +
                ", engineCEWear=" + engineCEWear +
                ", engineICEWear=" + engineICEWear +
                ", engineMGUKWear=" + engineMGUKWear +
                ", engineTCWear=" + engineTCWear +
                ", engineBlown=" + engineBlown +
                ", engineSeized=" + engineSeized +
                '}';
    }
}
