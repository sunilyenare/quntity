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
        return null;
    }

    @Override
    public double convertToBase(Double value) {
        return 0;
    }
}
