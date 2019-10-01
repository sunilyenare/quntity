package com.quntity;

public interface Unit {
     Measurement getMeasurementType();
     Unit getBaseUnit();
     double convertToBase(Double value);
}
