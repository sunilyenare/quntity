package com.quntity;

public class Length {

    enum Unit {
        Foot
    }

    private final float value;
    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Length)
           return this.value==((Length)obj).value;
        return false;
    }

}
