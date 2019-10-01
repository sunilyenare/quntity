package com.quntity.weight;

import com.quntity.Measurement;
import com.quntity.Unit;


public class KiloGram implements Unit {

    private double conversionFactor =1000;

    @Override
    public Measurement getMeasurementType() {
        return Measurement.WEIGHT;
    }

    @Override
    public Unit getBaseUnit() {
        return  new Gram();
    }

    @Override
    public double convertToBase(Double value) {
        return value * conversionFactor;
    }
}
