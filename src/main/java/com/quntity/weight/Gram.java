package com.quntity.weight;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Gram implements Unit {
    private double conversionFactor = 1;
    @Override
    public Measurement getMeasurementType() {
        return Measurement.WEIGHT;
    }

    @Override
    public Unit getBaseUnit() {
        return this;
    }

    @Override
    public double convertToBase(Double value) {
        return value * conversionFactor;
    }
}
