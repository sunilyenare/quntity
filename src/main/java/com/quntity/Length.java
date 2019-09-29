package com.quntity;

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
        final float meInBase = this.unit.convertToBase(value);
        final float otherInBase = other.unit.convertToBase(other.value);
        return meInBase == otherInBase;
    }

}
