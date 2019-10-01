package com.quntity;

public class Quantity {
    private final double value;
    protected final Unit unit;

    protected Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double thisValueInBase() {
        return this.unit.convertToBase(value);
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

        if (!this.unit.type.equals(other.unit.type)) {
            return false;
        }

        return thisValueInBase() == otherValueInBase(other);
    }


    public Quantity add(Quantity other) throws IllegalArgumentException {
        if (!this.unit.type.equals(other.unit.type)) {
            throw new IllegalArgumentException(this.unit.type + " AND " + other.unit.type + " NOT VALID FOR ADD OPERATION ");
        }
        return new Quantity(thisValueInBase() + otherValueInBase(other), other.unit.baseUnit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
