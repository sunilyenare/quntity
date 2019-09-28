package com.quntity;

public class Length {
    public enum Unit {
        FEET, INCH
    }

    private final float value;
    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj instanceof Length)
            return this.value == ((Length) obj).value;
        return false;
    }

}
