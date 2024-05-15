package Packets;

public class CarStatusData {
    private int m_tractionControl;
    private int m_antiLockBrakes;
    private int m_fuelMix;
    private int m_frontBrakeBias;
    private int m_pitLimiterStatus;
    private float m_fuelInTank;
    private float m_fuelCapacity;
    private int m_maxRPM;
    private int m_idleRPM;
    private int m_maxGears;
    private int m_drsAllowed;
    private int m_drsActivationDistance;
    private byte[] m_tyresWear;
    private int m_actualTyreCompound;
    private int m_visualTyreCompound;
    private int m_tyresAgeLaps;
    private int m_tyreCompound;
    private byte[] m_tyresDamage;
    private int m_frontLeftWingDamage;
    private int m_frontRightWingDamage;
    private int m_rearWingDamage;
    private int m_drsFault;
    private int m_engineDamage;
    private int m_gearBoxDamage;
    private int m_exhaustDamage;
    private int m_vehicleFiaFlags;
    private float m_enginePowerICE;
    private float m_enginePowerMGUK;
    private float m_ersStoreEnergy;
    private int m_ersDeployMode;
    private float m_ersHarvestedThisLapMGUK;
    private float m_ersHarvestedThisLapMGUH;
    private float m_ersDeployedThisLap;
    private float m_fuelRemainingLaps;
    private int m_networkPaused;

    // Getter and Setter
    public int getTractionControl() {
        return m_tractionControl;
    }

    public void setTractionControl(int m_tractionControl) {
        this.m_tractionControl = m_tractionControl;
    }

    public int getM_antiLockBrakes() {
        return m_antiLockBrakes;
    }

    public void setAntiLockBrakes(int m_antiLockBrakes) {
        this.m_antiLockBrakes = m_antiLockBrakes;
    }

    public int getFuelMix() {
        return m_fuelMix;
    }

    public void setFuelMix(int m_fuelMix) {
        this.m_fuelMix = m_fuelMix;
    }

    public int getFrontBrakeBias() {
        return m_frontBrakeBias;
    }

    public void setFrontBrakeBias(int m_frontBrakeBias) {
        this.m_frontBrakeBias = m_frontBrakeBias;
    }

    public int getPitLimiterStatus() {
        return m_pitLimiterStatus;
    }

    public void setPitLimiterStatus(int m_pitLimiterStatus) {
        this.m_pitLimiterStatus = m_pitLimiterStatus;
    }

    public float getFuelInTank() {
        return m_fuelInTank;
    }

    public void setFuelInTank(float m_fuelInTank) {
        this.m_fuelInTank = m_fuelInTank;
    }

    public float getFuelCapacity() {
        return m_fuelCapacity;
    }

    public void setFuelCapacity(float m_fuelCapacity) {
        this.m_fuelCapacity = m_fuelCapacity;
    }

    public int getMaxRPM() {
        return m_maxRPM;
    }

    public void setMaxRPM(int m_maxRPM) {
        this.m_maxRPM = m_maxRPM;
    }

    public int getIdleRPM() {
        return m_idleRPM;
    }

    public void setIdleRPM(int m_idleRPM) {
        this.m_idleRPM = m_idleRPM;
    }

    public int getMaxGears() {
        return m_maxGears;
    }

    public void setMaxGears(int m_maxGears) {
        this.m_maxGears = m_maxGears;
    }

    public int getDrsAllowed() {
        return m_drsAllowed;
    }

    public void setDrsAllowed(int m_drsAllowed) {
        this.m_drsAllowed = m_drsAllowed;
    }

    public int getDrsActivationDistance() {
        return m_drsActivationDistance;
    }

    public void setDrsActivationDistance(int m_drsActivationDistance) {
        this.m_drsActivationDistance = m_drsActivationDistance;
    }

    public byte[] getTyresWear() {
        return m_tyresWear;
    }

    public void setTyresWear(byte[] m_tyresWear) {
        this.m_tyresWear = m_tyresWear;
    }

    public int getActualTyreCompound() {
        return m_actualTyreCompound;
    }

    public void setActualTyreCompound(int m_actualTyreCompound) {
        this.m_actualTyreCompound = m_actualTyreCompound;
    }

    public int getVisualTyreCompound() {
        return m_visualTyreCompound;
    }

    public void setVisualTyreCompound(int m_visualTyreCompound) {
        this.m_visualTyreCompound = m_visualTyreCompound;
    }

    public int getTyresAgeLaps() {
        return m_tyresAgeLaps;
    }

    public void setTyresAgeLaps(int m_tyresAgeLaps) {
        this.m_tyresAgeLaps = m_tyresAgeLaps;
    }

    public int getTyreCompound() {
        return m_tyreCompound;
    }

    public void setTyreCompound(int m_tyreCompound) {
        this.m_tyreCompound = m_tyreCompound;
    }

    public byte[] getTyresDamage() {
        return m_tyresDamage;
    }

    public void setTyresDamage(byte[] m_tyresDamage) {
        this.m_tyresDamage = m_tyresDamage;
    }

    public int getFrontLeftWingDamage() {
        return m_frontLeftWingDamage;
    }

    public void setFrontLeftWingDamage(int m_frontLeftWingDamage) {
        this.m_frontLeftWingDamage = m_frontLeftWingDamage;
    }

    public int getFrontRightWingDamage() {
        return m_frontRightWingDamage;
    }

    public void setFrontRightWingDamage(int m_frontRightWingDamage) {
        this.m_frontRightWingDamage = m_frontRightWingDamage;
    }

    public int getRearWingDamage() {
        return m_rearWingDamage;
    }

    public void setRearWingDamage(int m_rearWingDamage) {
        this.m_rearWingDamage = m_rearWingDamage;
    }

    public int getDrsFault() {
        return m_drsFault;
    }

    public void setDrsFault(int m_drsFault) {
        this.m_drsFault = m_drsFault;
    }

    public int getEngineDamage() {
        return m_engineDamage;
    }

    public void setEngineDamage(int m_engineDamage) {
        this.m_engineDamage = m_engineDamage;
    }

    public int getGearBoxDamage() {
        return m_gearBoxDamage;
    }

    public void setGearBoxDamage(int m_gearBoxDamage) {
        this.m_gearBoxDamage = m_gearBoxDamage;
    }

    public int getExhaustDamage() {
        return m_exhaustDamage;
    }

    public void setExhaustDamage(int m_exhaustDamage) {
        this.m_exhaustDamage = m_exhaustDamage;
    }

    public int getVehicleFiaFlags() {
        return m_vehicleFiaFlags;
    }

    public void setVehicleFiaFlags(int m_vehicleFiaFlags) {
        this.m_vehicleFiaFlags = m_vehicleFiaFlags;
    }

    public float getEnginePowerICE() {
        return m_enginePowerICE;
    }

    public void setEnginePowerICE(float m_enginePowerICE) {
        this.m_enginePowerICE = m_enginePowerICE;
    }

    public float getEnginePowerMGUK() {
        return m_enginePowerMGUK;
    }

    public void setEnginePowerMGUK(float m_enginePowerMGUK) {
        this.m_enginePowerMGUK = m_enginePowerMGUK;
    }

    public float getErsStoreEnergy() {
        return m_ersStoreEnergy;
    }

    public void setErsStoreEnergy(float m_ersStoreEnergy) {
        this.m_ersStoreEnergy = m_ersStoreEnergy;
    }

    public int getErsDeployMode() {
        return m_ersDeployMode;
    }

    public void setErsDeployMode(int m_ersDeployMode) {
        this.m_ersDeployMode = m_ersDeployMode;
    }

    public float getErsHarvestedThisLapMGUK() {
        return m_ersHarvestedThisLapMGUK;
    }

    public void setErsHarvestedThisLapMGUK(float m_ersHarvestedThisLapMGUK) {
        this.m_ersHarvestedThisLapMGUK = m_ersHarvestedThisLapMGUK;
    }

    public float getErsHarvestedThisLapMGUH() {
        return m_ersHarvestedThisLapMGUH;
    }

    public void setErsHarvestedThisLapMGUH(float m_ersHarvestedThisLapMGUH) {
        this.m_ersHarvestedThisLapMGUH = m_ersHarvestedThisLapMGUH;
    }

    public float getErsDeployedThisLap() {
        return m_ersDeployedThisLap;
    }

    public void setErsDeployedThisLap(float m_ersDeployedThisLap) {
        this.m_ersDeployedThisLap = m_ersDeployedThisLap;
    }

    public float getFuelRemainingLaps() {
        return m_fuelRemainingLaps;
    }

    public void setFuelRemainingLaps(float m_fuelRemainingLaps) {
        this.m_fuelRemainingLaps = m_fuelRemainingLaps;
    }

    public int getNetworkPaused() {
        return m_networkPaused;
    }

    public void setNetworkPaused(int m_networkPaused) {
        this.m_networkPaused = m_networkPaused;
    }

    public CarStatusData() {
        // Constructor body can remain empty if there's nothing to initialize
    }

    @Override
    public String toString() {
        return "CarStatusData{" +
                "m_tractionControl=" + m_tractionControl +
                ", m_antiLockBrakes=" + m_antiLockBrakes +
                ", m_fuelMix=" + m_fuelMix +
                ", m_frontBrakeBias=" + m_frontBrakeBias +
                ", m_pitLimiterStatus=" + m_pitLimiterStatus +
                ", m_fuelInTank=" + m_fuelInTank +
                ", m_fuelCapacity=" + m_fuelCapacity +
                ", m_maxRPM=" + m_maxRPM +
                ", m_idleRPM=" + m_idleRPM +
                ", m_maxGears=" + m_maxGears +
                ", m_drsAllowed=" + m_drsAllowed +
                ", m_drsActivationDistance=" + m_drsActivationDistance +
                ", m_tyresWear=" + java.util.Arrays.toString(m_tyresWear) +
                ", m_actualTyreCompound=" + m_actualTyreCompound +
                ", m_visualTyreCompound=" + m_visualTyreCompound +
                ", m_tyresAgeLaps=" + m_tyresAgeLaps +
                ", m_tyreCompound=" + m_tyreCompound +
                ", m_tyresDamage=" + java.util.Arrays.toString(m_tyresDamage) +
                ", m_frontLeftWingDamage=" + m_frontLeftWingDamage +
                ", m_frontRightWingDamage=" + m_frontRightWingDamage +
                ", m_rearWingDamage=" + m_rearWingDamage +
                ", m_drsFault=" + m_drsFault +
                ", m_engineDamage=" + m_engineDamage +
                ", m_gearBoxDamage=" + m_gearBoxDamage +
                ", m_exhaustDamage=" + m_exhaustDamage +
                ", m_vehicleFiaFlags=" + m_vehicleFiaFlags +
                ", m_enginePowerICE=" + m_enginePowerICE +
                ", m_enginePowerMGUK=" + m_enginePowerMGUK +
                ", m_ersStoreEnergy=" + m_ersStoreEnergy +
                ", m_ersDeployMode=" + m_ersDeployMode +
                ", m_ersHarvestedThisLapMGUK=" + m_ersHarvestedThisLapMGUK +
                ", m_ersHarvestedThisLapMGUH=" + m_ersHarvestedThisLapMGUH +
                ", m_ersDeployedThisLap=" + m_ersDeployedThisLap +
                ", m_fuelRemainingLaps=" + m_fuelRemainingLaps +
                ", m_networkPaused=" + m_networkPaused +
                '}';
    }
}
