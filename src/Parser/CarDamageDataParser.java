package Parser;

import Packets.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class CarDamageDataParser extends F1Parser<CarDamageData> {
    private final int packetFormat;

    public CarDamageDataParser(int packetFormat) {
        this.packetFormat = packetFormat;
    }

    @Override
    protected CarDamageData parse(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN); // Assuming the binary data is in little endian format

        CarDamageData data = new CarDamageData();

        // Parsing arrays
        ArrayList<Float> tyresWear = new ArrayList<Float>(4);
        for (int i = 0; i < tyresWear.size(); i++) {
             tyresWear.add(byteBuffer.getFloat());
        }
        data.setTyresWear(tyresWear);

        byte[] tyresDamage = new byte[4];
        byteBuffer.get(tyresDamage);
        data.setTyresDamage(tyresDamage);

        byte[] brakesDamage = new byte[4];
        byteBuffer.get(brakesDamage);
        data.setBrakesDamage(brakesDamage);

        // Parsing individual bytes
        data.setFrontLeftWingDamage(byteBuffer.get());
        data.setFrontRightWingDamage(byteBuffer.get());
        data.setRearWingDamage(byteBuffer.get());
        data.setFloorDamage(byteBuffer.get());
        data.setDiffuserDamage(byteBuffer.get());
        data.setSidepodDamage(byteBuffer.get());
        data.setDrsFault(byteBuffer.get());

        // Conditionally parsed fields
        if (this.packetFormat >= 2022) {
            data.setErsFault(byteBuffer.get());
        }

        // Continue parsing other fields
        data.setGearBoxDamage(byteBuffer.get());
        data.setEngineDamage(byteBuffer.get());
        data.setEngineMGUHWear(byteBuffer.get());
        data.setEngineESWear(byteBuffer.get());
        data.setEngineCEWear(byteBuffer.get());
        data.setEngineICEWear(byteBuffer.get());
        data.setEngineMGUKWear(byteBuffer.get());
        data.setEngineTCWear(byteBuffer.get());

        if (this.packetFormat >= 2022) {
            data.setEngineBlown(byteBuffer.get());
            data.setEngineSeized(byteBuffer.get());
        }

        return data;
    }
}

