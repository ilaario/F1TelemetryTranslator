package Constants.Tyres;

public enum VisualTyres {
    INTERMEDIATE(new TyresClass("#3ac82b", "Intermediate")),
    WET(new TyresClass("#4491d2", "Wet")),
    SOFT(new TyresClass("#f92d29", "Soft")),
    MEDIUM(new TyresClass("#ebd25f", "Medium")),
    HARD(new TyresClass("#ffffff", "Hard")),
    SUPER_SOFT(new TyresClass("#b14ba7", "Super Soft"));

    private TyresClass visualTyreType;

    VisualTyres(TyresClass visualTyreType) {
        this.visualTyreType = visualTyreType;
    }

    public String getColor() {
        return visualTyreType.getColor();
    }

    public String getName() {
        return visualTyreType.getName();
    }
}

