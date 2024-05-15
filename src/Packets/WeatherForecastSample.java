package Packets;

public class WeatherForecastSample {
    private int sessionType;
    private int timeOffset;
    private int weather;
    private int trackTemperature;
    private int trackTemperatureChange;
    private int airTemperature;
    private int airTemperatureChange;
    private int rainPercentage;

    // Getters and setters
    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }

    public int getTimeOffset() {
        return timeOffset;
    }

    public void setTimeOffset(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTrackTemperature() {
        return trackTemperature;
    }

    public void setTrackTemperature(int trackTemperature) {
        this.trackTemperature = trackTemperature;
    }

    public int getTrackTemperatureChange() {
        return trackTemperatureChange;
    }

    public void setTrackTemperatureChange(int trackTemperatureChange) {
        this.trackTemperatureChange = trackTemperatureChange;
    }

    public int getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }

    public int getAirTemperatureChange() {
        return airTemperatureChange;
    }

    public void setAirTemperatureChange(int airTemperatureChange) {
        this.airTemperatureChange = airTemperatureChange;
    }

    public int getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(int rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    @Override
    public String toString() {
        return "WeatherForecastSample{" +
                "sessionType=" + sessionType +
                ", timeOffset=" + timeOffset +
                ", weather=" + weather +
                ", trackTemperature=" + trackTemperature +
                ", trackTemperatureChange=" + trackTemperatureChange +
                ", airTemperature=" + airTemperature +
                ", airTemperatureChange=" + airTemperatureChange +
                ", rainPercentage=" + rainPercentage +
                '}';
    }
}
