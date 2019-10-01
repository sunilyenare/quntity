package com.quntity.length;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Inch implements Unit {
    private double conversionFactor = 1;


    @Override
    public Measurement getMeasurementType() {
        return Measurement.LENGTH;
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
