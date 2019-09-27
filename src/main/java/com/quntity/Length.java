package com.quntity;

public class Length implements Measurement {

    private final float value;
    private final String unit;

    public Length(float value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean compare(Measurement measurement) {
        return this.value == ((Length) measurement).value;
    }
}
