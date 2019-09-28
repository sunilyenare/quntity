package com.quntity;

public class Length {
    public enum Unit {
        FEET, INCH
    }

    private final float value;

    public Length(float value, Unit unit) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj instanceof Length)
            return this.value == ((Length) obj).value;
        return false;
    }

}
