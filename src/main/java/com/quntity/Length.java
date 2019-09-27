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
        return obj instanceof Length;
    }

}
