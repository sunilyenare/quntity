package com.quntity;

public class Length {

    private final float value;
    private final String unit;

    public Length(float value, String unit) {
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
