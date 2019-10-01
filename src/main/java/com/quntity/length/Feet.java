package com.quntity.length;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Feet implements Unit {
    private double conversionFactor = 12.0;

    @Override
    public Measurement getMeasurementType() {
        return Measurement.LENGTH;
    }

    @Override
    public Unit getBaseUnit() {
        return new Inch();
    }

    @Override
    public double convertToBase(Double value) {
        return value * conversionFactor;
    }
}
