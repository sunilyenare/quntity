package com.quntity;

public class NonAddableQuantity {
    private final double value;
    private final Unit unit;

    public NonAddableQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double thisValueInBase() {
        return (double) Math.round(this.unit.convertToBase(value) * 100) / 100l;
    }

    private double otherValueInBase(NonAddableQuantity other) {

        return (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof NonAddableQuantity))
            return false;
        final NonAddableQuantity other = (NonAddableQuantity) obj;

        if (!this.unit.getMeasurementType().equals(other.unit.getMeasurementType())) {
            return false;
        }
        return thisValueInBase() == otherValueInBase(other);
    }

}
