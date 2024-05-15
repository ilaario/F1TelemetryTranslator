package Constants.Tyres;

public enum TyrePosition {
    RL("Rear Left"),
    RR("Rear Right"),
    FL("Front Left"),
    FR("Front Right");

    private String description;

    TyrePosition(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

