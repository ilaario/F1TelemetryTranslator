public enum EventCode {
    SSTA("SSTA"),
    SEND("SEND"),
    FTLP("FTLP"),
    RTMT("RTMT"),
    DRSE("DRSE"),
    DRSD("DRSD"),
    TMPT("TMPT"),
    CHQF("CHQF"),
    RCWN("RCWN"),
    PENA("PENA"),
    SPTP("SPTP"),
    STLG("STLG"),
    LGOT("LGOT"),
    DTSV("DTSV"),
    SGSV("SGSV"),
    FLBK("FLBK"),
    BUTN("BUTN"),
    RDFL("RDFL"),
    OVTK("OVTK");

    private final String code;

    EventCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
