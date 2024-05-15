package Packets;

import java.util.List;

public class CarTelemetryData {
    private int m_speed;
    private double m_throttle, m_steer, m_brake;
    private int m_clutch, m_gear, m_engineRPM, m_drs, m_revLightsPercent, m_engineTemperature;
    private Integer m_revLightsBitValue;  // Optional
    private float[] m_tyresPressure;
    private int[] m_brakesTemperature;
    private int[] m_tyresSurfaceTemperature;
    private int[] m_tyresInnerTemperature;
    private int[] m_surfaceType;  // Optional

    // Constructor, getters, and setters would be implemented here
    public CarTelemetryData(int m_speed, double m_throttle, double m_steer, double m_brake, int m_clutch, int m_gear, int m_engineRPM, int m_drs, int m_revLightsPercent, int m_engineTemperature, Integer m_revLightsBitValue, float[] m_tyresPressure, int[] m_brakesTemperature, int[] m_tyresSurfaceTemperature, int[] m_tyresInnerTemperature, int[] m_surfaceType) {
        this.m_speed = m_speed;
        this.m_throttle = m_throttle;
        this.m_steer = m_steer;
        this.m_brake = m_brake;
        this.m_clutch = m_clutch;
        this.m_gear = m_gear;
        this.m_engineRPM = m_engineRPM;
        this.m_drs = m_drs;
        this.m_revLightsPercent = m_revLightsPercent;
        this.m_engineTemperature = m_engineTemperature;
        this.m_revLightsBitValue = m_revLightsBitValue;
        this.m_tyresPressure = m_tyresPressure;
        this.m_brakesTemperature = m_brakesTemperature;
        this.m_tyresSurfaceTemperature = m_tyresSurfaceTemperature;
        this.m_tyresInnerTemperature = m_tyresInnerTemperature;
        this.m_surfaceType = m_surfaceType;
    }

    public CarTelemetryData() {
    }

    public int getM_speed() {
        return m_speed;
    }

    public void setM_speed(int m_speed) {
        this.m_speed = m_speed;
    }

    public double getM_throttle() {
        return m_throttle;
    }

    public void setM_throttle(double m_throttle) {
        this.m_throttle = m_throttle;
    }

    public double getM_steer() {
        return m_steer;
    }

    public void setM_steer(double m_steer) {
        this.m_steer = m_steer;
    }

    public double getM_brake() {
        return m_brake;
    }

    public void setM_brake(double m_brake) {
        this.m_brake = m_brake;
    }

    public int getM_clutch() {
        return m_clutch;
    }

    public void setM_clutch(int m_clutch) {
        this.m_clutch = m_clutch;
    }

    public int getM_gear() {
        return m_gear;
    }

    public void setM_gear(int m_gear) {
        this.m_gear = m_gear;
    }

    public int getM_engineRPM() {
        return m_engineRPM;
    }

    public void setM_engineRPM(int m_engineRPM) {
        this.m_engineRPM = m_engineRPM;
    }

    public int getM_drs() {
        return m_drs;
    }

    public void setM_drs(int m_drs) {
        this.m_drs = m_drs;
    }

    public int getM_revLightsPercent() {
        return m_revLightsPercent;
    }

    public void setM_revLightsPercent(int m_revLightsPercent) {
        this.m_revLightsPercent = m_revLightsPercent;
    }

    public int getM_engineTemperature() {
        return m_engineTemperature;
    }

    public void setM_engineTemperature(int m_engineTemperature) {
        this.m_engineTemperature = m_engineTemperature;
    }

    public Integer getM_revLightsBitValue() {
        return m_revLightsBitValue;
    }

    public void setM_revLightsBitValue(Integer m_revLightsBitValue) {
        this.m_revLightsBitValue = m_revLightsBitValue;
    }

    public float[] getM_tyresPressure() {
        return m_tyresPressure;
    }

    public void setM_tyresPressure(float[] m_tyresPressure) {
        this.m_tyresPressure = m_tyresPressure;
    }

    public int[] getM_brakesTemperature() {
        return m_brakesTemperature;
    }

    public void setM_brakesTemperature(int[] m_brakesTemperature) {
        this.m_brakesTemperature = m_brakesTemperature;
    }

    public int[] getM_tyresSurfaceTemperature() {
        return m_tyresSurfaceTemperature;
    }

    public void setM_tyresSurfaceTemperature(int[] m_tyresSurfaceTemperature) {
        this.m_tyresSurfaceTemperature = m_tyresSurfaceTemperature;
    }

    public int[] getM_tyresInnerTemperature() {
        return m_tyresInnerTemperature;
    }

    public void setM_tyresInnerTemperature(int[] m_tyresInnerTemperature) {
        this.m_tyresInnerTemperature = m_tyresInnerTemperature;
    }

    public int[] getM_surfaceType() {
        return m_surfaceType;
    }

    public void setM_surfaceType(int[] m_surfaceType) {
        this.m_surfaceType = m_surfaceType;
    }

    @Override
    public String toString() {
        return "CarTelemetryData{" +
                "m_speed=" + m_speed +
                ", m_throttle=" + m_throttle +
                ", m_steer=" + m_steer +
                ", m_brake=" + m_brake +
                ", m_clutch=" + m_clutch +
                ", m_gear=" + m_gear +
                ", m_engineRPM=" + m_engineRPM +
                ", m_drs=" + m_drs +
                ", m_revLightsPercent=" + m_revLightsPercent +
                ", m_engineTemperature=" + m_engineTemperature +
                ", m_revLightsBitValue=" + m_revLightsBitValue +
                ", m_tyresPressure=" + m_tyresPressure +
                ", m_brakesTemperature=" + m_brakesTemperature +
                ", m_tyresSurfaceTemperature=" + m_tyresSurfaceTemperature +
                ", m_tyresInnerTemperature=" + m_tyresInnerTemperature +
                ", m_surfaceType=" + m_surfaceType +
                '}';
    }
}

