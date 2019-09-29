package com.quntity;

public enum Unit {
    FEET(12) , INCH(1) ,YARD(1),GALLON(3.78),LITER(1);

    private double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
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
