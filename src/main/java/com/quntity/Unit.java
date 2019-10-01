package com.quntity;

public enum Unit {
    FEET(12, Measurement.LENGTH), INCH(1, Measurement.LENGTH), YARD(1, Measurement.LENGTH),

    GALLON(3.78, Measurement.VOLUME), LITER(1, Measurement.VOLUME);

    private double conversionFactor;
    protected Measurement type;

    Unit(double conversionFactor, Measurement type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    enum Measurement{
        LENGTH,VOLUME;
    }

    public Unit getBaseUnit() {
        if (this == FEET) {
            return INCH;
        }
        return LITER;
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
