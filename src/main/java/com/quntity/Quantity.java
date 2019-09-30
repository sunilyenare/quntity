package com.quntity;

import java.io.IOException;

public class Quantity {
    private final double value;
    private final Unit unit;


    protected Quantity(double value, Unit unit) {
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

        if (Unit.lengthUnits().contains(this.unit) && Unit.volumeUnit().contains(other.unit) || Unit.volumeUnit().contains(this.unit) && Unit.lengthUnits().contains(other.unit)) {
            return false;
        }


        final double meInBase = this.unit.convertToBase(value);
        final double otherInBase = (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
        return meInBase == otherInBase;
    }

    public Quantity add(Quantity other) throws IOException {
        if (Unit.lengthUnits().contains(this.unit) && Unit.volumeUnit().contains(other.unit) || Unit.volumeUnit().contains(this.unit) && Unit.lengthUnits().contains(other.unit)) {
            throw new IOException();
        }
        return new Quantity(this.unit.convertToBase(value) + other.unit.convertToBase(other.value), other.unit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
