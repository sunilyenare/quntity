package com.quntity.temprature;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Fahrenheit implements Unit {
    private double conversionFactor =32;
    @Override
    public Measurement getMeasurementType() {
        return Measurement.TEMPRATURE;
    }

    @Override
    public Unit getBaseUnit() {
        return new Celsius();
    }

    @Override
    public double convertToBase(Double value) {
        return value*conversionFactor;
    }
}
