package Packets;

import java.util.List;

public class PacketCarSetupData extends PacketBase{
    private List<CarSetupData> carSetups;

    public List<CarSetupData> getCarSetups() {
        return carSetups;
    }

    public void setCarSetups(List<CarSetupData> carSetups) {
        this.carSetups = carSetups;
    }

    @Override
    public String toString() {
        return "PacketCarSetupData{" +
                "carSetups=" + carSetups +
                '}';
    }
}
