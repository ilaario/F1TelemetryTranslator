package Packets;

import java.util.List;

public class PacketCarStatusData extends PacketBase{
    private List<CarStatusData> carStatusData;

    public List<CarStatusData> getCarStatusData() {
        return carStatusData;
    }

    public void setCarStatusData(List<CarStatusData> carStatusData) {
        this.carStatusData = carStatusData;
    }

    @Override
    public String toString() {
        return "PacketCarStatusData{" +
                "carStatusData=" + carStatusData +
                '}';
    }
}
