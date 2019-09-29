package com.quntity;

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
        final double otherInBase = other.unit.convertToBase(other.value);
        System.out.println(meInBase+"this");
        System.out.println(otherInBase+"that");
        return meInBase == otherInBase;
    }

    public Quantity add(Quantity that) {
        return new Quantity(this.unit.convertToBase(value) + that.unit.convertToBase(that.value), Unit.INCH);
    }
}
