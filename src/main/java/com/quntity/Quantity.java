package com.quntity;

import java.io.IOException;

public class Quantity {
    private final double value;
    private final Unit unit;


    protected Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    double thisValue(){
        return this.unit.convertToBase(value);
    }
    double otherValue(Quantity other){
        return (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Quantity))
            return false;
        final Quantity other = (Quantity) obj;

        if (!this.unit.type.equals(other.unit.type)) {
            return false;
        }

        return thisValue() == otherValue(other);
    }


    public Quantity add(Quantity other) throws IllegalArgumentException {
        if (!this.unit.type.equals(other.unit.type)) {
            throw new IllegalArgumentException("UNIT ARE DIFFRENT");
        }
        return new Quantity(thisValue() + otherValue(other), other.unit.baseUnit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
