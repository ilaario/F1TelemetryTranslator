package Constants;

public enum EventCode {
    SessionStarted("SSTA"),
    SessionEnded("SEND"),
    FastestLap("FTLP"),
    Retirement("RTMT"),
    DRSEnabled("DRSE"),
    DRSDisabled("DRSD"),
    TeammateInPits("TMPT"),
    ChequeredFlag("CHQF"),
    RaceWinner("RCWN"),
    PenaltyIssued("PENA"),
    SpeedTrapTriggered("SPTP"),
    StartLights("STLG"),
    LightsOut("LGOT"),
    DriveThroughServed("DTSV"),
    StopGoServed("SGSV"),
    Flashback("FLBK"),
    ButtonStatus("BUTN"),
    RedFlag("RDFL"),
    Overtake("OVTK");

    private final String code;

    EventCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static EventCode getEventCode(String code) {
        for (EventCode eventCode : EventCode.values()) {
            if (eventCode.code.equals(code)) {
                return eventCode;
            }
        }
        return null;
    }
}
