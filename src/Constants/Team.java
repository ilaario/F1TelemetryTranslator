package Constants;

public enum Team {
    MERCEDES(0, new TeamClass("Mercedes", "#00D2BE")),
    FERRARI(1, new TeamClass("Ferrari", "#DC0000")),
    RED_BULL_RACING(2, new TeamClass("Red Bull Racing", "#0600EF")),
    WILLIAMS(3, new TeamClass("Williams", "#005AFF")),
    ASTON_MARTIN(4, new TeamClass("Aston Martin", "#006F62")),
    ALPINE(5, new TeamClass("Alpine", "#0090FF")),
    ALPHA_TAURI(6, new TeamClass("Alpha Tauri", "#2B4562")),
    HAAS(7, new TeamClass("Haas", "#FFFFFF")),
    MCLAREN(8, new TeamClass("McLaren", "#FF8700")),
    ALFA_ROMEO(9, new TeamClass("Alfa Romeo", "#900000")),
    ART_GRAND_PRIX(23, new TeamClass("ART Grand Prix", "#B4B3B4")),
    CAMPOS_VEXATEC(24, new TeamClass("Campos Vexatec Racing", "#EBC110")),
    CARLIN(25, new TeamClass("Carlin", "#243EF6")),
    CHAROUZ_RACING_SYSTEM(26, new TeamClass("Charouz Racing System", "#84020A")),
    DAMS(27, new TeamClass("DAMS", "#0ED4FA")),
    RUSSIAN_TIME(28, new TeamClass("Russian Time", "#181e2a")),
    MP_MOTORSPORT(29, new TeamClass("MP Motorsport", "#F7401A")),
    PERTAMINA(30, new TeamClass("Pertamina", "#ff2b08")),
    TRIDENT(32, new TeamClass("Trident", "#0E1185")),
    BWT_ARDEN(33, new TeamClass("BWT Arden", "#ff88d3")),
    UNI_VIRTUOSI(47, new TeamClass("Uni-Virtuosi", "#FBEC20")),
    PREMA(77, new TeamClass("Prema", "#E80309")),
    HITECH(80, new TeamClass("Hitech", "#E8E8E8")),
    RACING_POINT_2020(89, new TeamClass("Racing Point 2020", "#FAA0BE")),
    RENAULT_2020(90, new TeamClass("Renault 2020", "#FFF500"));

    private final int index;
    private final TeamClass TeamClass;

    Team(int index, TeamClass TeamClass) {
        this.index = index;
        this.TeamClass = TeamClass;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return TeamClass.getName();
    }

    public String getColor() {
        return TeamClass.getColor();
    }

    public static TeamClass getByIndex(int index) {
        for (Team team : Team.values()) {
            if (team.getIndex() == index) {
                return team.TeamClass;
            }
        }
        return null; // Handle unknown index
    }
}
