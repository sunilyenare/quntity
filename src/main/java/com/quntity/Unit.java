package com.quntity;

import java.util.ArrayList;
import java.util.List;

public enum Unit {
    FEET(12), INCH(1), YARD(1), GALLON(3.78), LITER(1);

    protected static List<Unit> unitLength = new ArrayList<Unit>();
    protected static List<Unit> unitVolume = new ArrayList<Unit>();
    private double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public static List<Unit> lengthUnits() {
        unitLength.add(Unit.FEET);
        unitLength.add(Unit.INCH);
        return unitLength;
    }

    public static List<Unit> volumeUnit() {
        unitVolume.add(Unit.GALLON);
        unitVolume.add(Unit.LITER);
        return unitVolume;
    }

    public double convertToBase(Double value) {
        return value * conversionFactor;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}
