package com.quntity;

public enum Unit {
    INCH(1, Measurement.LENGTH),
    FEET(12, Measurement.LENGTH, Unit.INCH),
    YARD(1, Measurement.LENGTH, Unit.FEET),
    LITER(1, Measurement.VOLUME),
    GALLON(3.78, Measurement.VOLUME, Unit.LITER);

    private double conversionFactor;
    protected Measurement type;
    protected Unit baseUnit;

    Unit(double conversionFactor, Measurement type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.baseUnit=this;
    }

    Unit(double conversionFactor, Measurement type, Unit baseUnit) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.baseUnit = baseUnit;
    }

    enum Measurement {
        LENGTH, VOLUME, WEIGHT;
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
