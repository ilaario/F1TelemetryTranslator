package Parser;

import Packets.CarTelemetryData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CarTelemetryDataParser extends F1Parser<CarTelemetryData> {
    private final int packetFormat;

    public CarTelemetryDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected CarTelemetryData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);

        CarTelemetryData data = new CarTelemetryData();

        // Read speed
        data.setM_speed(byteBuffer.getShort() & 0xFFFF);

        // Conditional parsing for throttle, steer, and brake based on packet format
        if (packetFormat == 2018) {
            data.setM_throttle(byteBuffer.get() & 0xFF);
            data.setM_steer(byteBuffer.get());
            data.setM_brake(byteBuffer.get() & 0xFF);
        } else if (packetFormat >= 2019) {
            data.setM_throttle(byteBuffer.getFloat());
            data.setM_steer(byteBuffer.getFloat());
            data.setM_brake(byteBuffer.getFloat());
        }

        // Continue parsing other fields
        data.setM_clutch(byteBuffer.get() & 0xFF);
        data.setM_gear(byteBuffer.get());
        data.setM_engineRPM(byteBuffer.getShort() & 0xFFFF);
        data.setM_drs(byteBuffer.get() & 0xFF);
        data.setM_revLightsPercent(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2021) {
            data.setM_revLightsBitValue(byteBuffer.getShort() & 0xFFFF);
        }

        // Arrays for temperatures and pressures, using loops for simplicity
        data.setM_brakesTemperature(readArrayShort(byteBuffer, 4));

        if (packetFormat >= 2020) {
            data.setM_tyresSurfaceTemperature(readArrayByte(byteBuffer, 4));
            data.setM_tyresInnerTemperature(readArrayByte(byteBuffer, 4));
        } else {
            data.setM_tyresSurfaceTemperature(readArrayShort(byteBuffer, 4));
            data.setM_tyresInnerTemperature(readArrayShort(byteBuffer, 4));
        }

        data.setM_engineTemperature(byteBuffer.getShort() & 0xFFFF);
        data.setM_tyresPressure(readArrayFloat(byteBuffer, 4));

        if (packetFormat >= 2019) {
            data.setM_surfaceType(readArrayByte(byteBuffer, 4));
        }

        return data;
    }

    private float[] readArrayFloat(ByteBuffer byteBuffer, int length) {
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = byteBuffer.getFloat();
        }
        return result;
    }

    private int[] readArrayShort(ByteBuffer byteBuffer, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = byteBuffer.getShort() & 0xFFFF;
        }
        return result;
    }

    private int[] readArrayByte(ByteBuffer byteBuffer, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = byteBuffer.get() & 0xFF;
        }
        return result;
    }
}
