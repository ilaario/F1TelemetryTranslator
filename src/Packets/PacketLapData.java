package Packets;

import java.util.List;

public class PacketLapData extends PacketBase {
    private List<LapData> lapData;
    private Integer timeTrialPBCarIdx;
    private Integer timeTrialRivalCarIdx;

    public void setLapData(List<LapData> lapDataList) {
    }

    // Getters and setters
    public List<LapData> getLapData() {
        return lapData;
    }

    public Integer getM_timeTrialPBCarIdx() {
        return timeTrialPBCarIdx;
    }

    public void setM_timeTrialPBCarIdx(Integer timeTrialPBCarIdx) {
        this.timeTrialPBCarIdx = timeTrialPBCarIdx;
    }

    public Integer getM_timeTrialRivalCarIdx() {
        return timeTrialRivalCarIdx;
    }

    public void setM_timeTrialRivalCarIdx(Integer timeTrialRivalCarIdx) {
        this.timeTrialRivalCarIdx = timeTrialRivalCarIdx;
    }

    @Override
    public String toString() {
        return "PacketLapData{" +
                "lapData=" + lapData +
                ", timeTrialPBCarIdx=" + timeTrialPBCarIdx +
                ", timeTrialRivalCarIdx=" + timeTrialRivalCarIdx +
                '}';
    }
}

