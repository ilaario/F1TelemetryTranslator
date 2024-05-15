package Parser;

import Packets.WeatherForecastSample;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class WeatherForecastSampleParser extends F1Parser<WeatherForecastSample> {
    private final int packetFormat;

    public WeatherForecastSampleParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected WeatherForecastSample parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        WeatherForecastSample data = new WeatherForecastSample();

        data.setSessionType(byteBuffer.get() & 0xFF);
        data.setTimeOffset(byteBuffer.get() & 0xFF);
        data.setWeather(byteBuffer.get() & 0xFF);
        data.setTrackTemperature(byteBuffer.get());

        if (packetFormat == 2020) {
            data.setAirTemperature(byteBuffer.get());
        }

        if (packetFormat >= 2021) {
            data.setTrackTemperatureChange(byteBuffer.get());
            data.setAirTemperature(byteBuffer.get());
            data.setAirTemperatureChange(byteBuffer.get());
            data.setRainPercentage(byteBuffer.get() & 0xFF);
        }

        return data;
    }
}

