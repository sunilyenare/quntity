package com.quntity;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
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
        final double meInBase = this.unit.convertToBase(value);
        final double otherInBase = other.unit.convertToBase(other.value);
        return meInBase == otherInBase;
    }

    public Length add(Length that) {
        return new Length(this.unit.convertToBase(value) + that.value, Unit.INCH);
    }
}
