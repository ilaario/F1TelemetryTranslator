package Packets;

import java.util.List;

public class PacketCarDamageData extends PacketBase {
    private List<CarDamageData> carDamageData;

    public List<CarDamageData> getCarDamageData() {
        return carDamageData;
    }

    public void setCarDamageData(List<CarDamageData> carDamageData) {
        this.carDamageData = carDamageData;
    }

    @Override
    public PacketHeader getHeader() {
        return super.getHeader();
    }

    @Override
    public void setHeader(PacketHeader header) {
        super.setHeader(header);
    }

    // Getters and setters
}

