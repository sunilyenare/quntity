package com.quntity;

public enum Unit {
    FEET(12) , INCH(1) ,YARD(1);

    private double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(Double value) {
        return value * conversionFactor;
    }
}
