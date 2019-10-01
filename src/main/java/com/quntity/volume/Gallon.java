package com.quntity.volume;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Gallon implements Unit {
    private double conversionFactor = 3.78;

    @Override
    public Measurement getMeasurementType() {
        return Measurement.VOLUME;
    }

    @Override
    public Unit getBaseUnit() {
        return new Liter();
    }

    @Override
    public double convertToBase(Double value) {
        return value * conversionFactor;
    }
}
