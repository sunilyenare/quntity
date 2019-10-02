package com.quntity;

public class Quantity {
    private final double value;
    private final Unit unit;

    protected Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double thisValueInBase() {
        return (double) Math.round(this.unit.convertToBase(value) * 100) / 100l;
    }

    private double otherValueInBase(Quantity other) {
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


    public Quantity add(Quantity other) throws IllegalArgumentException {
        if (!this.unit.getMeasurementType().equals(other.unit.getMeasurementType())) {
            throw new IllegalArgumentException(this.unit.getMeasurementType() + " AND " + other.unit.getMeasurementType() + " NOT VALID FOR ADD OPERATION ");
        }
        return new Quantity(thisValueInBase() + otherValueInBase(other), other.unit.getBaseUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
