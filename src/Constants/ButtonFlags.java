package Constants;

public enum ButtonFlags {
    CROSS_OR_A(0x0001),
    TRIANGLE_OR_Y(0x0002),
    CIRCLE_OR_B(0x0004),
    SQUARE_OR_X(0x0008),
    D_PAD_LEFT(0x0010),
    D_PAD_RIGHT(0x0020),
    D_PAD_UP(0x0040),
    D_PAD_DOWN(0x0080),
    OPTIONS_OR_MENU(0x0100),
    L1_OR_LB(0x0200),
    R1_OR_RB(0x0400),
    L2_OR_LT(0x0800),
    R2_OR_RT(0x1000),
    LEFT_STICK_CLICK(0x2000),
    RIGHT_STICK_CLICK(0x4000),
    RIGHT_STICK_LEFT(0x8000),
    RIGHT_STICK_RIGHT(0x10000),
    RIGHT_STICK_UP(0x20000),
    RIGHT_STICK_DOWN(0x40000),
    SPECIAL(0x80000),
    UDP_ACTION_1(0x00100000),
    UDP_ACTION_2(0x00200000),
    UDP_ACTION_3(0x00400000),
    UDP_ACTION_4(0x00800000),
    UDP_ACTION_5(0x01000000),
    UDP_ACTION_6(0x02000000),
    UDP_ACTION_7(0x04000000),
    UDP_ACTION_8(0x08000000),
    UDP_ACTION_9(0x10000000),
    UDP_ACTION_10(0x20000000),
    UDP_ACTION_11(0x40000000),
    UDP_ACTION_12(0x80000000);

    private final int value;

    ButtonFlags(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

