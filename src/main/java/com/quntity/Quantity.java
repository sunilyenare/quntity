package com.quntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quantity {
    private final double value;
    private final Unit unit;
    private List<Unit> unitLength;
    private List<Unit> unitVolume;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
        unitLength = new ArrayList<Unit>();
        unitVolume = new ArrayList<Unit>();
    }

    private List<Unit> lengthUnits() {
        unitLength.add(Unit.FEET);
        unitLength.add(Unit.INCH);
        return unitLength;
    }

    private List<Unit> volumeUnit() {
        unitVolume.add(Unit.GALLON);
        unitVolume.add(Unit.LITER);
        return unitVolume;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Quantity))
            return false;
        final Quantity other = (Quantity) obj;


        if (lengthUnits().contains(this.unit) && volumeUnit().contains(other.unit) || volumeUnit().contains(this.unit) && lengthUnits().contains(other.unit)) {
            return false;
        }

        final double meInBase = this.unit.convertToBase(value);
        final double otherInBase = (double) Math.round(other.unit.convertToBase(other.value) * 100) / 100;
        return meInBase == otherInBase;
    }

    public Quantity add(Quantity other) throws IOException {
        if (lengthUnits().contains(this.unit) && volumeUnit().contains(other.unit) || volumeUnit().contains(this.unit) && lengthUnits().contains(other.unit)) {
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
