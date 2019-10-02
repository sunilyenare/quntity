package com.quntity;

public class AddableQuantity extends Quantity{
    private final double value;
    private final Unit unit;

    protected AddableQuantity(double value, Unit unit) {
        super(value,unit);
        this.value = value;
        this.unit = unit;
    }


    public AddableQuantity add(AddableQuantity other) throws IllegalArgumentException {
        if (!this.unit.getMeasurementType().equals(other.unit.getMeasurementType())) {
            throw new IllegalArgumentException(this.unit.getMeasurementType() + " AND " + other.unit.getMeasurementType() + " NOT VALID FOR ADD OPERATION ");
        }
        return new AddableQuantity(thisValueInBase() + otherValueInBase(other), other.unit.getBaseUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
