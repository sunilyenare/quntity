package com.quntity.volume;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Liter implements Unit {
    private double conversionFactor = 1;

    @Override
    public Measurement getMeasurementType() {
        return Measurement.VOLUME;
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
