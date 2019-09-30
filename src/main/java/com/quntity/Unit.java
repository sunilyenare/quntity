package com.quntity;

import java.util.ArrayList;
import java.util.List;

public enum Unit {
    FEET(12, "LENGTH"), INCH(1, "LENGTH"), YARD(1, "LENGTH"),

    GALLON(3.78, "VOLUME"), LITER(1, "VOLUME");

    protected static List<Unit> unitLength = new ArrayList<Unit>();
    protected static List<Unit> unitVolume = new ArrayList<Unit>();
    private double conversionFactor;
    protected String type;

    Unit(double conversionFactor, String type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
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
