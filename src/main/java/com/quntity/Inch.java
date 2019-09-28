package com.quntity;

public class Inch {
    private int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Inch)
            return this==(Inch)obj;

        return false;
    }
}
