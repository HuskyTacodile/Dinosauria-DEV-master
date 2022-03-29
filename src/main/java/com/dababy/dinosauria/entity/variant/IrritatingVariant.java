package com.dababy.dinosauria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum IrritatingVariant {
    //variants have been duplicated in order to make them rarer
    VARIANT1(0),
    VARIANT2(1),
    VARIANT3(2),
    VARIANT4(3),
    VARIANT5(4),
    VARIANT6(5),
    VARIANT7(6),
    VARIANT8(7),
    VARIANT9(8),
    VARIANT10(9),
    MELON(10),
    VARIANT11(11),
    VARIANT12(12),
    VARIANT13(13),
    VARIANT14(14),
    VARIANT15(15),
    VARIANT16(16),
    VARIANT17(17),
    VARIANT18(18),
    MELON2(19),
    ALBINO(20),
    VARIANT19(21),
    VARIANT20(22);


    private static final IrritatingVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(IrritatingVariant::getId)).toArray((i) -> new IrritatingVariant[i]);
    private final int id;

    private IrritatingVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static IrritatingVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
