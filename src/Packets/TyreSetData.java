package Packets;

public class TyreSetData {
    private int m_actualTyreCompound;
    private int m_visualTyreCompound;
    private int m_wear;
    private int m_available;
    private int m_recommendedSession;
    private int m_lifeSpan;
    private int m_usableLife;
    private int m_lapDeltaTime;
    private int m_fitted;

    // Getters and setters for all fields
    public int getM_actualTyreCompound() {
        return m_actualTyreCompound;
    }

    public void setM_actualTyreCompound(int m_actualTyreCompound) {
        this.m_actualTyreCompound = m_actualTyreCompound;
    }

    public int getM_visualTyreCompound() {
        return m_visualTyreCompound;
    }

    public void setM_visualTyreCompound(int m_visualTyreCompound) {
        this.m_visualTyreCompound = m_visualTyreCompound;
    }

    public int getM_wear() {
        return m_wear;
    }

    public void setM_wear(int m_wear) {
        this.m_wear = m_wear;
    }

    public int getM_available() {
        return m_available;
    }

    public void setM_available(int m_available) {
        this.m_available = m_available;
    }

    public int getM_recommendedSession() {
        return m_recommendedSession;
    }

    public void setM_recommendedSession(int m_recommendedSession) {
        this.m_recommendedSession = m_recommendedSession;
    }

    public int getM_lifeSpan() {
        return m_lifeSpan;
    }

    public void setM_lifeSpan(int m_lifeSpan) {
        this.m_lifeSpan = m_lifeSpan;
    }

    public int getM_usableLife() {
        return m_usableLife;
    }

    public void setM_usableLife(int m_usableLife) {
        this.m_usableLife = m_usableLife;
    }

    public int getM_lapDeltaTime() {
        return m_lapDeltaTime;
    }

    public void setM_lapDeltaTime(int m_lapDeltaTime) {
        this.m_lapDeltaTime = m_lapDeltaTime;
    }

    public int getM_fitted() {
        return m_fitted;
    }

    public void setM_fitted(int m_fitted) {
        this.m_fitted = m_fitted;
    }

    public String toString() {
        return "Actual Compound: " + m_actualTyreCompound + ", Visual Compound: " + m_visualTyreCompound + ", Wear: " + m_wear + ", Available: " + m_available + ", Recommended Session: " + m_recommendedSession + ", Life Span: " + m_lifeSpan + ", Usable Life: " + m_usableLife + ", Lap Delta Time: " + m_lapDeltaTime + ", Fitted: " + m_fitted;
    }
}

