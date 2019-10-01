package com.quntity.length;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Yard implements Unit {
    private double conversionFactor = 3;

    @Override
    public Measurement getMeasurementType() {
        return Measurement.LENGTH;
    }

    @Override
    public Unit getBaseUnit() {
        return new Feet();
    }

    @Override
    public double convertToBase(Double value) {
        return value * conversionFactor;
    }
}
