package com.quntity.temprature;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Celsius implements Unit {
    @Override
    public Measurement getMeasurementType() {
        return Measurement.WEIGHT;
    }

    @Override
    public Unit getBaseUnit() {
        return null;
    }

    @Override
    public double convertToBase(Double value) {
        return value;
    }

    @Override
    public String toString() {
        return "Celsius{}";
    }
}
