package com.quntity.test;

public class Quntity {
    private final float value;
    private final String feet;

    public Quntity(float value, String feet) {
        this.value = value;
        this.feet = feet;
    }

    public boolean compare(Quntity quntity) {
        return this.value==quntity.value;
    }
}
