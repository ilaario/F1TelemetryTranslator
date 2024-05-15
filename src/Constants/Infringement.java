package Constants;

public enum Infringement {
    BLOCKING_BY_SLOW_DRIVING(0, "Blocking by slow driving"),
    BLOCKING_BY_WRONG_WAY_DRIVING(1, "Blocking by wrong way driving"),
    REVERSING_OFF_THE_START_LINE(2, "Reversing off the start line"),
    BIG_COLLISION(3, "Big Collision"),
    SMALL_COLLISION(4, "Small Collision"),
    COLLISION_FAILED_TO_HAND_BACK_POSITION_SINGLE(5, "Collision failed to hand back position single"),
    COLLISION_FAILED_TO_HAND_BACK_POSITION_MULTIPLE(6, "Collision failed to hand back position multiple"),
    CORNER_CUTTING_GAINED_TIME(7, "Corner cutting gained time"),
    CORNER_CUTTING_OVERTAKE_SINGLE(8, "Corner cutting overtake single"),
    CORNER_CUTTING_OVERTAKE_MULTIPLE(9, "Corner cutting overtake multiple"),
    CROSSED_PIT_EXIT_LANE(10, "Crossed pit exit lane"),
    IGNORING_BLUE_FLAGS(11, "Ignoring blue flags"),
    IGNORING_YELLOW_FLAGS(12, "Ignoring yellow flags"),
    IGNORING_DRIVE_THROUGH(13, "Ignoring drive through"),
    TOO_MANY_DRIVE_THROUGHS(14, "Too many drive throughs"),
    DRIVE_THROUGH_REMINDER_SERVE_WITHIN_N_LAPS(15, "Drive through reminder serve within n laps"),
    DRIVE_THROUGH_REMINDER_SERVE_THIS_LAP(16, "Drive through reminder serve this lap"),
    PIT_LANE_SPEEDING(17, "Pit lane speeding"),
    PARKED_FOR_TOO_LONG(18, "Parked for too long"),
    IGNORING_TYRE_REGULATIONS(19, "Ignoring tyre regulations"),
    TOO_MANY_PENALTIES(20, "Too many penalties"),
    MULTIPLE_WARNINGS(21, "Multiple warnings"),
    APPROACHING_DISQUALIFICATION(22, "Approaching disqualification"),
    TYRE_REGULATIONS_SELECT_SINGLE(23, "Tyre regulations select single"),
    TYRE_REGULATIONS_SELECT_MULTIPLE(24, "Tyre regulations select multiple"),
    LAP_INVALIDATED_CORNER_CUTTING(25, "Lap invalidated corner cutting"),
    LAP_INVALIDATED_RUNNING_WIDE(26, "Lap invalidated running wide"),
    CORNER_CUTTING_RAN_WIDE_GAINED_TIME_MINOR(27, "Corner cutting ran wide gained time minor"),
    CORNER_CUTTING_RAN_WIDE_GAINED_TIME_SIGNIFICANT(28, "Corner cutting ran wide gained time significant"),
    CORNER_CUTTING_RAN_WIDE_GAINED_TIME_EXTREME(29, "Corner cutting ran wide gained time extreme"),
    LAP_INVALIDATED_WALL_RIDING(30, "Lap invalidated wall riding"),
    LAP_INVALIDATED_FLASHBACK_USED(31, "Lap invalidated flashback used"),
    LAP_INVALIDATED_RESET_TO_TRACK(32, "Lap invalidated reset to track"),
    BLOCKING_THE_PITLANE(33, "Blocking the pitlane"),
    JUMP_START(34, "Jump start"),
    SAFETY_CAR_TO_CAR_COLLISION(35, "Safety car to car collision"),
    SAFETY_CAR_ILLEGAL_OVERTAKE(36, "Safety car illegal overtake"),
    SAFETY_CAR_EXCEEDING_ALLOWED_PACE(37, "Safety car exceeding allowed pace"),
    VIRTUAL_SAFETY_CAR_EXCEEDING_ALLOWED_PACE(38, "Virtual safety car exceeding allowed pace"),
    FORMATION_LAP_BELOW_ALLOWED_SPEED(39, "Formation lap below allowed speed"),
    FORMATION_LAP_PARKING(40, "Formation lap parking"),
    RETIRED_MECHANICAL_FAILURE(41, "Retired mechanical failure"),
    RETIRED_TERMINALLY_DAMAGED(42, "Retired terminally damaged"),
    SAFETY_CAR_FALLING_TOO_FAR_BACK(43, "Safety car falling too far back"),
    BLACK_FLAG_TIMER(44, "Black flag timer"),
    UNSERVED_STOP_GO_PENALTY(45, "Unserved stop go penalty"),
    UNSERVED_DRIVE_THROUGH_PENALTY(46, "Unserved drive through penalty"),
    ENGINE_COMPONENT_CHANGE(47, "Engine component change"),
    GEARBOX_CHANGE(48, "Gearbox change"),
    PARC_FERME_CHANGE(49, "Parc Fermé change"),
    LEAGUE_GRID_PENALTY(50, "League grid penalty"),
    RETRY_PENALTY(51, "Retry penalty"),
    ILLEGAL_TIME_GAIN(52, "Illegal time gain"),
    MANDATORY_PITSTOP(53, "Mandatory pitstop"),
    ATTRIBUTE_ASSIGNED(54, "Attribute assigned");

    private final int code;
    private final String description;

    Infringement(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Infringement fromCode(int code) {
        for (Infringement infringement : Infringement.values()) {
            if (infringement.getCode() == code) {
                return infringement;
            }
        }
        throw new IllegalArgumentException("Invalid infringement code: " + code);
    }
}

