package com.quntity.temprature;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Celsius implements Unit {
    private double conversionFactor =1;
    @Override
    public Measurement getMeasurementType() {
        return Measurement.TEMPRATURE;
    }

    @Override
    public Unit getBaseUnit() {
        return this;
    }

    @Override
    public double convertToBase(Double value) {
        return value*conversionFactor;
    }

    @Override
    public String toString() {
        return "Celsius{}";
    }
}
