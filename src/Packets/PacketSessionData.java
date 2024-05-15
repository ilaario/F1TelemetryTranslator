package Packets;

import java.util.List;

public class PacketSessionData extends PacketBase {
    private int weather;
    private int trackTemperature;
    private int airTemperature;
    private int totalLaps;
    private int trackLength;
    private int sessionType;
    private int trackId;
    private Integer era;
    private Integer formula;
    private int sessionTimeLeft;
    private int sessionDuration;
    private int pitSpeedLimit;
    private int gamePaused;
    private int isSpectating;
    private int spectatorCarIndex;
    private int sliProNativeSupport;
    private int numMarshalZones;
    private List<MarshalZone> marshalZones;
    private int safetyCarStatus;
    private int networkGame;
    private Integer numWeatherForecastSamples;
    private List<WeatherForecastSample> weatherForecastSamples;
    private Integer forecastAccuracy;
    private Integer aiDifficulty;
    private Integer seasonLinkIdentifier;
    private Integer weekendLinkIdentifier;
    private Integer sessionLinkIdentifier;
    private Integer pitStopWindowIdealLap;
    private Integer pitStopWindowLatestLap;
    private Integer pitStopRejoinPosition;
    private Integer steeringAssist;
    private Integer brakingAssist;
    private Integer gearboxAssist;
    private Integer pitAssist;
    private Integer pitReleaseAssist;
    private Integer ERSAssist;
    private Integer DRSAssist;
    private Integer dynamicRacingLine;
    private Integer dynamicRacingLineType;
    private Integer gameMode;
    private Integer ruleSet;
    private Integer timeOfDay;
    private Integer sessionLength;
    private Integer speedUnitsLeadPlayer;
    private Integer temperatureUnitsLeadPlayer;
    private Integer speedUnitsSecondaryPlayer;
    private Integer temperatureUnitsSecondaryPlayer;
    private Integer numSafetyCarPeriods;
    private Integer numVirtualSafetyCarPeriods;
    private Integer numRedFlagPeriods;

    // Getters and setters
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

    public int getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }

    public int getTotalLaps() {
        return totalLaps;
    }

    public void setTotalLaps(int totalLaps) {
        this.totalLaps = totalLaps;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public Integer getEra() {
        return era;
    }

    public void setEra(Integer era) {
        this.era = era;
    }

    public Integer getFormula() {
        return formula;
    }

    public void setFormula(Integer formula) {
        this.formula = formula;
    }

    public int getSessionTimeLeft() {
        return sessionTimeLeft;
    }

    public void setSessionTimeLeft(int sessionTimeLeft) {
        this.sessionTimeLeft = sessionTimeLeft;
    }

    public int getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public int getPitSpeedLimit() {
        return pitSpeedLimit;
    }

    public void setPitSpeedLimit(int pitSpeedLimit) {
        this.pitSpeedLimit = pitSpeedLimit;
    }

    public int getGamePaused() {
        return gamePaused;
    }

    public void setGamePaused(int gamePaused) {
        this.gamePaused = gamePaused;
    }

    public int getIsSpectating() {
        return isSpectating;
    }

    public void setIsSpectating(int isSpectating) {
        this.isSpectating = isSpectating;
    }

    public int getSpectatorCarIndex() {
        return spectatorCarIndex;
    }

    public void setSpectatorCarIndex(int spectatorCarIndex) {
        this.spectatorCarIndex = spectatorCarIndex;
    }

    public int getSliProNativeSupport() {
        return sliProNativeSupport;
    }

    public void setSliProNativeSupport(int sliProNativeSupport) {
        this.sliProNativeSupport = sliProNativeSupport;
    }

    public int getNumMarshalZones() {
        return numMarshalZones;
    }

    public void setNumMarshalZones(int numMarshalZones) {
        this.numMarshalZones = numMarshalZones;
    }

    public List<MarshalZone> getMarshalZones() {
        return marshalZones;
    }

    public void setMarshalZones(List<MarshalZone> marshalZones) {
        this.marshalZones = marshalZones;
    }

    public int getSafetyCarStatus() {
        return safetyCarStatus;
    }

    public void setSafetyCarStatus(int safetyCarStatus) {
        this.safetyCarStatus = safetyCarStatus;
    }

    public int getNetworkGame() {
        return networkGame;
    }

    public void setNetworkGame(int networkGame) {
        this.networkGame = networkGame;
    }

    public Integer getNumWeatherForecastSamples() {
        return numWeatherForecastSamples;
    }

    public void setNumWeatherForecastSamples(Integer numWeatherForecastSamples) {
        this.numWeatherForecastSamples = numWeatherForecastSamples;
    }

    public List<WeatherForecastSample> getWeatherForecastSamples() {
        return weatherForecastSamples;
    }

    public void setWeatherForecastSamples(List<WeatherForecastSample> weatherForecastSamples) {
        this.weatherForecastSamples = weatherForecastSamples;
    }

    public Integer getForecastAccuracy() {
        return forecastAccuracy;
    }

    public void setForecastAccuracy(Integer forecastAccuracy) {
        this.forecastAccuracy = forecastAccuracy;
    }

    public Integer getAiDifficulty() {
        return aiDifficulty;
    }

    public void setAiDifficulty(Integer aiDifficulty) {
        this.aiDifficulty = aiDifficulty;
    }

    public Integer getSeasonLinkIdentifier() {
        return seasonLinkIdentifier;
    }

    public void setSeasonLinkIdentifier(Integer seasonLinkIdentifier) {
        this.seasonLinkIdentifier = seasonLinkIdentifier;
    }

    public Integer getWeekendLinkIdentifier() {
        return weekendLinkIdentifier;
    }

    public void setWeekendLinkIdentifier(Integer weekendLinkIdentifier) {
        this.weekendLinkIdentifier = weekendLinkIdentifier;
    }

    public Integer getSessionLinkIdentifier() {
        return sessionLinkIdentifier;
    }

    public void setSessionLinkIdentifier(Integer sessionLinkIdentifier) {
        this.sessionLinkIdentifier = sessionLinkIdentifier;
    }

    public Integer getPitStopWindowIdealLap() {
        return pitStopWindowIdealLap;
    }

    public void setPitStopWindowIdealLap(Integer pitStopWindowIdealLap) {
        this.pitStopWindowIdealLap = pitStopWindowIdealLap;
    }

    public Integer getPitStopWindowLatestLap() {
        return pitStopWindowLatestLap;
    }

    public void setPitStopWindowLatestLap(Integer pitStopWindowLatestLap) {
        this.pitStopWindowLatestLap = pitStopWindowLatestLap;
    }

    public Integer getPitStopRejoinPosition() {
        return pitStopRejoinPosition;
    }

    public void setPitStopRejoinPosition(Integer pitStopRejoinPosition) {
        this.pitStopRejoinPosition = pitStopRejoinPosition;
    }

    public Integer getSteeringAssist() {
        return steeringAssist;
    }

    public void setSteeringAssist(Integer steeringAssist) {
        this.steeringAssist = steeringAssist;
    }

    public Integer getBrakingAssist() {
        return brakingAssist;
    }

    public void setBrakingAssist(Integer brakingAssist) {
        this.brakingAssist = brakingAssist;
    }

    public Integer getGearboxAssist() {
        return gearboxAssist;
    }

    public void setGearboxAssist(Integer gearboxAssist) {
        this.gearboxAssist = gearboxAssist;
    }

    public Integer getPitAssist() {
        return pitAssist;
    }

    public void setPitAssist(Integer pitAssist) {
        this.pitAssist = pitAssist;
    }

    public Integer getPitReleaseAssist() {
        return pitReleaseAssist;
    }

    public void setPitReleaseAssist(Integer pitReleaseAssist) {
        this.pitReleaseAssist = pitReleaseAssist;
    }

    public Integer getERSAssist() {
        return ERSAssist;
    }

    public void setERSAssist(Integer ERSAssist) {
        this.ERSAssist = ERSAssist;
    }

    public Integer getDRSAssist() {
        return DRSAssist;
    }

    public void setDRSAssist(Integer DRSAssist) {
        this.DRSAssist = DRSAssist;
    }

    public Integer getDynamicRacingLine() {
        return dynamicRacingLine;
    }

    public void setDynamicRacingLine(Integer dynamicRacingLine) {
        this.dynamicRacingLine = dynamicRacingLine;
    }

    public Integer getDynamicRacingLineType() {
        return dynamicRacingLineType;
    }

    public void setDynamicRacingLineType(Integer dynamicRacingLineType) {
        this.dynamicRacingLineType = dynamicRacingLineType;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public void setGameMode(Integer gameMode) {
        this.gameMode = gameMode;
    }

    public Integer getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(Integer ruleSet) {
        this.ruleSet = ruleSet;
    }

    public Integer getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(Integer timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Integer getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Integer sessionLength) {
        this.sessionLength = sessionLength;
    }

    public Integer getSpeedUnitsLeadPlayer() {
        return speedUnitsLeadPlayer;
    }

    public void setSpeedUnitsLeadPlayer(Integer speedUnitsLeadPlayer) {
        this.speedUnitsLeadPlayer = speedUnitsLeadPlayer;
    }

    public Integer getTemperatureUnitsLeadPlayer() {
        return temperatureUnitsLeadPlayer;
    }

    public void setTemperatureUnitsLeadPlayer(Integer temperatureUnitsLeadPlayer) {
        this.temperatureUnitsLeadPlayer = temperatureUnitsLeadPlayer;
    }

    public Integer getSpeedUnitsSecondaryPlayer() {
        return speedUnitsSecondaryPlayer;
    }

    public void setSpeedUnitsSecondaryPlayer(Integer speedUnitsSecondaryPlayer) {
        this.speedUnitsSecondaryPlayer = speedUnitsSecondaryPlayer;
    }

    public Integer getTemperatureUnitsSecondaryPlayer() {
        return temperatureUnitsSecondaryPlayer;
    }

    public void setTemperatureUnitsSecondaryPlayer(Integer temperatureUnitsSecondaryPlayer) {
        this.temperatureUnitsSecondaryPlayer = temperatureUnitsSecondaryPlayer;
    }

    public Integer getNumSafetyCarPeriods() {
        return numSafetyCarPeriods;
    }

    public void setNumSafetyCarPeriods(Integer numSafetyCarPeriods) {
        this.numSafetyCarPeriods = numSafetyCarPeriods;
    }

    public Integer getNumVirtualSafetyCarPeriods() {
        return numVirtualSafetyCarPeriods;
    }

    public void setNumVirtualSafetyCarPeriods(Integer numVirtualSafetyCarPeriods) {
        this.numVirtualSafetyCarPeriods = numVirtualSafetyCarPeriods;
    }

    public Integer getNumRedFlagPeriods() {
        return numRedFlagPeriods;
    }

    public void setNumRedFlagPeriods(Integer numRedFlagPeriods) {
        this.numRedFlagPeriods = numRedFlagPeriods;
    }
}

