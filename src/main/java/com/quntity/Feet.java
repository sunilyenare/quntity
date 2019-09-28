package com.quntity;

public class Feet {


    private final float value;

    public Feet(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Feet)
           return this.value==((Feet)obj).value;
        return false;
    }

}
