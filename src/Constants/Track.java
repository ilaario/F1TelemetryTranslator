package Constants;

public enum Track {
    MELBOURNE(new TrackClass("Melbourne")),
    PAUL_RICARD(new TrackClass("Paul Ricard")),
    SHANGHAI(new TrackClass("Shanghai")),
    SAKHIR(new TrackClass("Sakhir (Bahrain)")),
    CATALUNYA(new TrackClass("Catalunya")),
    MONACO(new TrackClass("Monaco")),
    MONTREAL(new TrackClass("Montreal")),
    SILVERSTONE(new TrackClass("Silverstone")),
    HOCKENHEIM(new TrackClass("Hockenheim")),
    HUNGARORING(new TrackClass("Hungaroring")),
    SPA(new TrackClass("Spa")),
    MONZA(new TrackClass("Monza")),
    SINGAPORE(new TrackClass("Singapore")),
    SUZUKA(new TrackClass("Suzuka")),
    ABU_DHABI(new TrackClass("Abu Dhabi")),
    TEXAS(new TrackClass("Texas")),
    BRAZIL(new TrackClass("Brazil")),
    AUSTRIA(new TrackClass("Austria")),
    SOCHI(new TrackClass("Sochi")),
    MEXICO(new TrackClass("Mexico")),
    BAKU(new TrackClass("Baku (Azerbaijan)")),
    SAKHIR_SHORT(new TrackClass("Sakhir Short")),
    SILVERSTONE_SHORT(new TrackClass("Silverstone Short")),
    TEXAS_SHORT(new TrackClass("Texas Short")),
    SUZUKA_SHORT(new TrackClass("Suzuka Short")),
    HANOI(new TrackClass("Hanoi")),
    ZANDVOORT(new TrackClass("Zandvoort")),
    IMOLA(new TrackClass("Imola")),
    PORTIMAO(new TrackClass("Portimao")),
    JEDDAH(new TrackClass("Jeddah")),
    MIAMI(new TrackClass("Miami")),
    LAS_VEGAS(new TrackClass("Las Vegas")),
    LOSAIL(new TrackClass("Losail"));

    private final TrackClass name;

    Track(TrackClass name) {
        this.name = name;
    }

    public TrackClass getName() {
        return name;
    }

    public static Track fromName(String name) {
        for (Track track : Track.values()) {
            if (track.getName().getName().equals(name)) {
                return track;
            }
        }
        return null;
    }
}
