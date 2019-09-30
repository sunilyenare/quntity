package com.quntity;

import java.io.IOException;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Quantity))
            return false;
        final Quantity other = (Quantity) obj;
        final double meInBase = this.unit.convertToBase(value);
        final double otherInBase = (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
        System.out.println(meInBase + "this");
        System.out.println(otherInBase + "that");
        return meInBase == otherInBase;
    }

    public Quantity add(Quantity that) throws IOException {
        if (this.unit == Unit.FEET || this.unit == Unit.INCH && that.unit == Unit.GALLON || that.unit == Unit.LITER) {
            throw new IOException();
        }
        return new Quantity(this.unit.convertToBase(value) + that.unit.convertToBase(that.value), that.unit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
