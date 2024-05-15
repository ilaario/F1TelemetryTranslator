package Parser;

import Packets.CarStatusData;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CarStatusDataParser extends F1Parser<CarStatusData> {
    private final int packetFormat;

    public CarStatusDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected CarStatusData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);

        CarStatusData data = new CarStatusData();

        // Basic data parsing
        data.setTractionControl(byteBuffer.get() & 0xFF);
        data.setAntiLockBrakes(byteBuffer.get() & 0xFF);
        data.setFuelMix(byteBuffer.get() & 0xFF);
        data.setFrontBrakeBias(byteBuffer.get() & 0xFF);
        data.setPitLimiterStatus(byteBuffer.get() & 0xFF);
        data.setFuelInTank(byteBuffer.getFloat());
        data.setFuelCapacity(byteBuffer.getFloat());

        // Conditional fields based on packet format
        if (packetFormat >= 2019) {
            data.setFuelRemainingLaps(byteBuffer.getFloat());
        }

        data.setMaxRPM(byteBuffer.getShort() & 0xFFFF);
        data.setIdleRPM(byteBuffer.getShort() & 0xFFFF);
        data.setMaxGears(byteBuffer.get() & 0xFF);
        data.setDrsAllowed(byteBuffer.get() & 0xFF);

        if (packetFormat >= 2020) {
            data.setDrsActivationDistance(byteBuffer.getShort() & 0xFFFF);
        }

        if (packetFormat >= 2018 && packetFormat <= 2020) {
            byte[] tyresWear = new byte[4];
            byteBuffer.get(tyresWear);
            data.setTyresWear(tyresWear);
        }

        if (packetFormat >= 2019) {
            data.setActualTyreCompound(byteBuffer.get() & 0xFF);
            data.setVisualTyreCompound(byteBuffer.get() & 0xFF);
        } else {
            data.setTyreCompound(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2020) {
            data.setTyresAgeLaps(byteBuffer.get() & 0xFF);
        }

        if (packetFormat < 2021) {
            byte[] tyresDamage = new byte[4];
            byteBuffer.get(tyresDamage);
            data.setTyresDamage(tyresDamage);
            data.setFrontLeftWingDamage(byteBuffer.get() & 0xFF);
            data.setFrontRightWingDamage(byteBuffer.get() & 0xFF);
            data.setRearWingDamage(byteBuffer.get() & 0xFF);
        }

        if (packetFormat == 2020) {
            data.setDrsFault(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2018 && packetFormat <= 2020) {
            data.setEngineDamage(byteBuffer.get() & 0xFF);
            data.setGearBoxDamage(byteBuffer.get() & 0xFF);
        }

        if (packetFormat >= 2019) {
            data.setVehicleFiaFlags(byteBuffer.get() & 0xFF);
        } else {
            data.setExhaustDamage(byteBuffer.get() & 0xFF);
            data.setVehicleFiaFlags(byteBuffer.get());
        }

        if (packetFormat >= 2023) {
            data.setEnginePowerICE(byteBuffer.getFloat());
            data.setEnginePowerMGUK(byteBuffer.getFloat());
        }

        data.setErsStoreEnergy(byteBuffer.getFloat());
        data.setErsDeployMode(byteBuffer.get() & 0xFF);
        data.setErsHarvestedThisLapMGUK(byteBuffer.getFloat());
        data.setErsHarvestedThisLapMGUH(byteBuffer.getFloat());
        data.setErsDeployedThisLap(byteBuffer.getFloat());

        if (packetFormat >= 2021) {
            data.setNetworkPaused(byteBuffer.get());
        }

        return data;
    }
}

