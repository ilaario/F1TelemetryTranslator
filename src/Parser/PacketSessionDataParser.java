package Parser;

import Constants.PacketSize;
import Packets.MarshalZone;
import Packets.PacketSessionData;
import Packets.WeatherForecastSample;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class PacketSessionDataParser extends F1Parser<PacketSessionData> {
    private final int packetFormat;
    private final boolean bigintEnabled;

    public PacketSessionDataParser(ByteBuffer buffer, int packetFormat, boolean bigintEnabled) {
        this.packetFormat = packetFormat;
        this.bigintEnabled = bigintEnabled;
        parse(buffer); // Immediately parse the buffer upon instantiation
    }

    @Override
    protected PacketSessionData parse(ByteBuffer byteBuffer) {
        if (getRemainingBytes(byteBuffer) < PacketSize.SESSION.getSize()) {
            System.err.println("PSD Error: Motion packet size is too small. \n\tExpected at least " + PacketSize.SESSION.getSize() + " bytes.\n\tReceived " + getRemainingBytes(byteBuffer) + " bytes.");
            return null;
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        PacketSessionData data = new PacketSessionData();

        PacketHeaderParser headerParser = new PacketHeaderParser(packetFormat, bigintEnabled);
        data.setHeader(headerParser.parse(byteBuffer));

        data.setWeather(byteBuffer.get() & 0xFF);
        data.setTrackTemperature(byteBuffer.get());
        data.setAirTemperature(byteBuffer.get());
        data.setTotalLaps(byteBuffer.get() & 0xFF);
        data.setTrackLength(byteBuffer.getShort() & 0xFFFF);
        data.setSessionType(byteBuffer.get() & 0xFF);
        data.setTrackId(byteBuffer.get());

        if (packetFormat == 2018) {
            data.setEra(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2019) {
            data.setFormula(byteBuffer.get() & 0xFF);
        }

        data.setSessionTimeLeft(byteBuffer.getShort() & 0xFFFF);
        data.setSessionDuration(byteBuffer.getShort() & 0xFFFF);
        data.setPitSpeedLimit(byteBuffer.get() & 0xFF);
        data.setGamePaused(byteBuffer.get() & 0xFF);
        data.setIsSpectating(byteBuffer.get() & 0xFF);
        data.setSpectatorCarIndex(byteBuffer.get() & 0xFF);
        data.setSliProNativeSupport(byteBuffer.get() & 0xFF);
        data.setNumMarshalZones(byteBuffer.get() & 0xFF);

        List<MarshalZone> marshalZones = new ArrayList<>();
        MarshalZoneParser marshalZoneParser = new MarshalZoneParser();
        for (int i = 0; i < 21; i++) { // The array length is fixed at 21
            marshalZones.add(marshalZoneParser.parse(byteBuffer));
        }
        data.setMarshalZones(marshalZones);

        data.setSafetyCarStatus(byteBuffer.get() & 0xFF);
        data.setNetworkGame(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2020) {
            data.setNumWeatherForecastSamples(byteBuffer.get() & 0xFF);
        }

        List<WeatherForecastSample> weatherForecastSamples = new ArrayList<>();
        WeatherForecastSampleParser weatherForecastSampleParser = new WeatherForecastSampleParser(packetFormat);
        int forecastSampleLength = packetFormat == 2020 ? 20 : (packetFormat >= 2021 ? 56 : 0);
        for (int i = 0; i < forecastSampleLength; i++) {
            weatherForecastSamples.add(weatherForecastSampleParser.parse(byteBuffer));
        }
        data.setWeatherForecastSamples(weatherForecastSamples);

        if (packetFormat >= 2021) {
            data.setForecastAccuracy(byteBuffer.get() & 0xFF);
            data.setAiDifficulty(byteBuffer.get() & 0xFF);
            data.setSeasonLinkIdentifier(byteBuffer.getInt());
            data.setWeekendLinkIdentifier(byteBuffer.getInt());
            data.setSessionLinkIdentifier(byteBuffer.getInt());
            data.setPitStopWindowIdealLap(byteBuffer.get() & 0xFF);
            data.setPitStopWindowLatestLap(byteBuffer.get() & 0xFF);
            data.setPitStopRejoinPosition(byteBuffer.get() & 0xFF);
            data.setSteeringAssist(byteBuffer.get() & 0xFF);
            data.setBrakingAssist(byteBuffer.get() & 0xFF);
            data.setGearboxAssist(byteBuffer.get() & 0xFF);
            data.setPitAssist(byteBuffer.get() & 0xFF);
            data.setPitReleaseAssist(byteBuffer.get() & 0xFF);
            data.setERSAssist(byteBuffer.get() & 0xFF);
            data.setDRSAssist(byteBuffer.get() & 0xFF);
            data.setDynamicRacingLine(byteBuffer.get() & 0xFF);
            data.setDynamicRacingLineType(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2022) {
            data.setGameMode(byteBuffer.get() & 0xFF);
            data.setRuleSet(byteBuffer.get() & 0xFF);
            data.setTimeOfDay(byteBuffer.getInt());
            data.setSessionLength(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2023) {
            data.setSpeedUnitsLeadPlayer(byteBuffer.get() & 0xFF);
            data.setTemperatureUnitsLeadPlayer(byteBuffer.get() & 0xFF);
            data.setSpeedUnitsSecondaryPlayer(byteBuffer.get() & 0xFF);
            data.setTemperatureUnitsSecondaryPlayer(byteBuffer.get() & 0xFF);
            data.setNumSafetyCarPeriods(byteBuffer.get() & 0xFF);
            data.setNumVirtualSafetyCarPeriods(byteBuffer.get() & 0xFF);
            data.setNumRedFlagPeriods(byteBuffer.get() & 0xFF);
        }

        return data;
    }
}

