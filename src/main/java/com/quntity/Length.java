package com.quntity;

public class Length {

    private final float value;
    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(this.value==((Length) obj).value) return true;
        return obj instanceof Length && this.value == ((Length) obj).value &&
                this.unit==((Length) obj).unit;
    }

}
