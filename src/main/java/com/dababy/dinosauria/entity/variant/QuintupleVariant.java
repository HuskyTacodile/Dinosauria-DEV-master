package com.dababy.dinosauria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum QuintupleVariant {
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
    ALBINO(20);


    private static final QuintupleVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(QuintupleVariant::getId)).toArray(QuintupleVariant[]::new);
    private final int id;

    QuintupleVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static QuintupleVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
