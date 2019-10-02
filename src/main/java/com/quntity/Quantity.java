package com.quntity;

public class Quantity {
    protected final double value;
    protected final Unit unit;

    protected Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    protected double thisValueInBase() {
        return (double) Math.round(this.unit.convertToBase(value) * 100) / 100;
    }

    protected double otherValueInBase(Quantity other) {
        return (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Quantity))
            return false;
        final Quantity other = (Quantity) obj;

        if (!this.unit.getMeasurementType().equals(other.unit.getMeasurementType())) {
            return false;
        }
        return thisValueInBase() == otherValueInBase(other);
    }

}
