package Constants;

public enum Formulas {
    F1_MODERN(0, "F1 Modern"),
    F1_CLASSIC(1, "F1 Classic"),
    F2(2, "F2"),
    F1_GENERIC(3, "F1 Generic");

    private final int code;
    private final String description;

    Formulas(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Formulas fromCode(int code) {
        for (Formulas formula : Formulas.values()) {
            if (formula.getCode() == code) {
                return formula;
            }
        }
        throw new IllegalArgumentException("Invalid formula code: " + code);
    }
}

