package Constants;

public enum Nationality {
    AMERICAN(1, "American"),
    ARGENTINEAN(2, "Argentinean"),
    AUSTRALIAN(3, "Australian"),
    AUSTRIAN(4, "Austrian"),
    AZERBAIJANI(5, "Azerbaijani"),
    BAHRAINI(6, "Bahraini"),
    BELGIAN(7, "Belgian"),
    BOLIVIAN(8, "Bolivian"),
    BRAZILIAN(9, "Brazilian"),
    BRITISH(10, "British"),
    BULGARIAN(11, "Bulgarian"),
    CAMEROONIAN(12, "Cameroonian"),
    CANADIAN(13, "Canadian"),
    CHILEAN(14, "Chilean"),
    CHINESE(15, "Chinese"),
    COLOMBIAN(16, "Colombian"),
    COSTA_RICAN(17, "Costa Rican"),
    CROATIAN(18, "Croatian"),
    CYPRIOT(19, "Cypriot"),
    CZECH(20, "Czech"),
    DANISH(21, "Danish"),
    DUTCH(22, "Dutch"),
    ECUADORIAN(23, "Ecuadorian"),
    ENGLISH(24, "English"),
    EMIRIAN(25, "Emirian"),
    ESTONIAN(26, "Estonian"),
    FINNISH(27, "Finnish"),
    FRENCH(28, "French"),
    GERMAN(29, "German"),
    GHANAIAN(30, "Ghanaian"),
    GREEK(31, "Greek"),
    GUATEMALAN(32, "Guatemalan"),
    HONDURAN(33, "Honduran"),
    HONG_KONGER(34, "Hong Konger"),
    HUNGARIAN(35, "Hungarian"),
    ICELANDER(36, "Icelander"),
    INDIAN(37, "Indian"),
    INDONESIAN(38, "Indonesian"),
    IRISH(39, "Irish"),
    ISRAELI(40, "Israeli"),
    ITALIAN(41, "Italian"),
    JAMAICAN(42, "Jamaican"),
    JAPANESE(43, "Japanese"),
    JORDANIAN(44, "Jordanian"),
    KUWAITI(45, "Kuwaiti"),
    LATVIAN(46, "Latvian"),
    LEBANESE(47, "Lebanese"),
    LITHUANIAN(48, "Lithuanian"),
    LUXEMBOURGER(49, "Luxembourger"),
    MALAYSIAN(50, "Malaysian"),
    MALTESE(51, "Maltese"),
    MEXICAN(52, "Mexican"),
    MONEGASQUE(53, "Monegasque"),
    NEW_ZEALANDER(54, "New Zealander"),
    NICARAGUAN(55, "Nicaraguan"),
    NORTHERN_IRISH(56, "Northern Irish"),
    NORWEGIAN(57, "Norwegian"),
    OMANI(58, "Omani"),
    PAKISTANI(59, "Pakistani"),
    PANAMANIAN(60, "Panamanian"),
    PARAGUAYAN(61, "Paraguayan"),
    PERUVIAN(62, "Peruvian"),
    POLISH(63, "Polish"),
    PORTUGUESE(64, "Portuguese"),
    QATARI(65, "Qatari"),
    ROMANIAN(66, "Romanian"),
    RUSSIAN(67, "Russian"),
    SALVADORAN(68, "Salvadoran"),
    SAUDI(69, "Saudi"),
    SCOTTISH(70, "Scottish"),
    SERBIAN(71, "Serbian"),
    SINGAPOREAN(72, "Singaporean"),
    SLOVAKIAN(73, "Slovakian"),
    SLOVENIAN(74, "Slovenian"),
    SOUTH_KOREAN(75, "South Korean"),
    SOUTH_AFRICAN(76, "South African"),
    SPANISH(77, "Spanish"),
    SWEDISH(78, "Swedish"),
    SWISS(79, "Swiss"),
    THAI(80, "Thai"),
    TURKISH(81, "Turkish"),
    URUGUAYAN(82, "Uruguayan"),
    UKRAINIAN(83, "Ukrainian"),
    VENEZUELAN(84, "Venezuelan"),
    BARBADIAN(85, "Barbadian"),
    WELSH(86, "Welsh"),
    VIETNAMESE(87, "Vietnamese"),
    NOT_FOUND(255, "Not Found");

    private final int code;
    private final String name;

    Nationality(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static Nationality fromCode(int code) {
        for (Nationality nationality : Nationality.values()) {
            if (nationality.getCode() == code) {
                return nationality;
            }
        }
        return NOT_FOUND; // Return the default value if code is not found
    }
}

