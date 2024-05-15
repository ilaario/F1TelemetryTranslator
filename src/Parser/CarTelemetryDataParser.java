package Parser;

import Packets.CarTelemetryData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class CarTelemetryDataParser extends F1Parser<CarTelemetryData> {
    private final int packetFormat;

    public CarTelemetryDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected CarTelemetryData parse(ByteBuffer byteBuffer) {
        System.out.println(" - - - - PARSING CAR TELEMETRY DATA - - - - ");
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);

        CarTelemetryData data = new CarTelemetryData();

        // Read speed
        data.setM_speed(byteBuffer.getShort() & 0xFFFF);
        System.out.println("\tSpeed: " + data.getM_speed());

        // Conditional parsing for throttle, steer, and brake based on packet format
        if (packetFormat == 2018) {
            data.setM_throttle(byteBuffer.get() & 0xFF);
            System.out.println("\tThrottle: " + data.getM_throttle());
            data.setM_steer(byteBuffer.get());
            System.out.println("\tSteer: " + data.getM_steer());
            data.setM_brake(byteBuffer.get() & 0xFF);
            System.out.println("\tBrake: " + data.getM_brake());
        } else if (packetFormat >= 2019) {
            data.setM_throttle(byteBuffer.getFloat());
            System.out.println("\tThrottle: " + data.getM_throttle());
            data.setM_steer(byteBuffer.getFloat());
            System.out.println("\tSteer: " + data.getM_steer());
            data.setM_brake(byteBuffer.getFloat());
            System.out.println("\tBrake: " + data.getM_brake());
        }

        // Continue parsing other fields
        data.setM_clutch(byteBuffer.get() & 0xFF);
        System.out.println("\tClutch: " + data.getM_clutch());
        data.setM_gear(byteBuffer.get());
        System.out.println("\tGear: " + data.getM_gear());
        data.setM_engineRPM(byteBuffer.getShort() & 0xFFFF);
        System.out.println("\tEngine RPM: " + data.getM_engineRPM());
        data.setM_drs(byteBuffer.get() & 0xFF);
        System.out.println("\tDRS: " + data.getM_drs());
        data.setM_revLightsPercent(byteBuffer.get() & 0xFF);
        System.out.println("\tRev Lights Percent: " + data.getM_revLightsPercent());

        if (packetFormat >= 2021) {
            data.setM_revLightsBitValue(byteBuffer.getShort() & 0xFFFF);
            System.out.println("\tRev Lights Bit Value: " + data.getM_revLightsBitValue());
        }

        // Arrays for temperatures and pressures, using loops for simplicity
        data.setM_brakesTemperature(readArrayShort(byteBuffer, 4));
        System.out.println("\tBrakes Temperature: " + Arrays.toString(data.getM_brakesTemperature()));

        if (packetFormat >= 2020) {
            data.setM_tyresSurfaceTemperature(readArrayByte(byteBuffer, 4));
            System.out.println("\tTyres Surface Temperature: " + Arrays.toString(data.getM_tyresSurfaceTemperature()));
            data.setM_tyresInnerTemperature(readArrayByte(byteBuffer, 4));
            System.out.println("\tTyres Inner Temperature: " + Arrays.toString(data.getM_tyresInnerTemperature()));
        } else {
            data.setM_tyresSurfaceTemperature(readArrayShort(byteBuffer, 4));
            System.out.println("\tTyres Surface Temperature: " + Arrays.toString(data.getM_tyresSurfaceTemperature()));
            data.setM_tyresInnerTemperature(readArrayShort(byteBuffer, 4));
            System.out.println("\tTyres Inner Temperature: " + Arrays.toString(data.getM_tyresInnerTemperature()));
        }

        data.setM_engineTemperature(byteBuffer.getShort() & 0xFFFF);
        System.out.println("\tEngine Temperature: " + data.getM_engineTemperature());
        data.setM_tyresPressure(readArrayFloat(byteBuffer, 4));
        System.out.println("\tTyres Pressure: " + Arrays.toString(data.getM_tyresPressure()));

        if (packetFormat >= 2019) {
            data.setM_surfaceType(readArrayByte(byteBuffer, 4));
            System.out.println("\tSurface Type: " + Arrays.toString(data.getM_surfaceType()));
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
