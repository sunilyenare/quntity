package com.quntity;

import java.util.HashMap;
import java.util.Map;

public class Length {

    public static final int ONE_FEET_IN_INCH = 12;
    private final float value;
    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Length))
            return false;
        final Length other = (Length) obj;

        Map<String, Double> conversions = new HashMap<>();
        conversions.put("FEETFEET", 1.0);
        conversions.put("FEETINCH", 12.0);
        conversions.put("INCHINCH", 1.0);
        conversions.put("INCHFEET", 1.0/12);
        conversions.put("CMFEET",1.0);
        conversions.put("CMINCH",1.0);
        conversions.put("INCHCM",1.0);
        conversions.put("FEETCM",1.0);
        conversions.put("CMCM",1.0);

        final String key = unit.toString() + other.unit.toString();

        if (unit.equals(Unit.FEET) && other.unit.equals(Unit.FEET)) {
            return value * conversions.get(key) == other.value;
        }
        if (unit.equals(Unit.INCH) && other.unit.equals(Unit.INCH)) {
            return value * conversions.get(key) == other.value;
        }
        if (unit.equals(Unit.FEET) && other.unit.equals(Unit.INCH)) {
            return value * conversions.get(key) == other.value;
        }
        if (unit.equals(Unit.INCH) && other.unit.equals(Unit.FEET)) {
            return value * conversions.get(key) == other.value;
        }

//        final float meInBase = this.unit.convertToBase(value);
//        final float otherInBase = other.unit.convertToBase(other.value);
//        return meInBase == otherInBase;
    }

}
