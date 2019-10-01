package com.quntity.weight;

import com.quntity.Measurement;
import com.quntity.Unit;

public class Gram implements Unit {
    @Override
    public Measurement getMeasurementType() {
        return null;
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
