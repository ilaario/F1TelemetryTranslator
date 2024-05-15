package Constants.Tyres;

public enum Tyres {
    HYPER_SOFT(new TyresClass("#ffb3c3", "Hyper Soft")),
    ULTRA_SOFT(new TyresClass("#b14ba7", "Ultra Soft")),
    SUPER_SOFT(new TyresClass("#f92d29", "Super Soft")),
    SOFT(new TyresClass("#ebd25f", "Soft")),
    MEDIUM(new TyresClass("#ffffff", "Medium")),
    HARD(new TyresClass("#03a2f3", "Hard")),
    SUPER_HARD(new TyresClass("#ff803f", "Super Hard")),
    INTERMEDIATE(new TyresClass("#3ac82b", "Intermediate")),
    WET(new TyresClass("#4491d2", "Wet")),
    DRY(new TyresClass("#3ac82b", "Dry")),
    C5(new TyresClass("#f92d29", "C5")),
    C4(new TyresClass("#f92d29", "C4")),
    C3(new TyresClass("#ebd25f", "C3")),
    C2(new TyresClass("#ffffff", "C2")),
    C1(new TyresClass("#ffffff", "C1")),
    C0(new TyresClass("#ffffff", "C0"));

    private TyresClass tyreType;

    Tyres(TyresClass tyreType) {
        this.tyreType = tyreType;
    }

    public String getColor() {
        return tyreType.getColor();
    }

    public String getName() {
        return tyreType.getName();
    }
}
