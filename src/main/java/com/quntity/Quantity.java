package com.quntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        List<Unit> lengthUnits = new ArrayList<Unit>();
        lengthUnits.add(Unit.FEET);
        lengthUnits.add(Unit.INCH);

        List<Unit> volumeUnits = new ArrayList<Unit>();
        volumeUnits.add(Unit.GALLON);
        volumeUnits.add(Unit.LITER);

        if (lengthUnits.contains(this.unit) && volumeUnits.contains(other.unit) || volumeUnits.contains(this.unit) && lengthUnits.contains(other.unit)) {
            return false;
        }

        final double meInBase = this.unit.convertToBase(value);
        final double otherInBase = (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
        return meInBase == otherInBase;
    }

    public Quantity add(Quantity other) throws IOException {

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
