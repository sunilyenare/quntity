package com.quntity.temprature;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Fahrenheit implements Unit {
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
        return ((5 * (value - 32.0)) / 9.0);
    }
}
