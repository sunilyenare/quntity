package com.quntity;

public enum Unit {
    FEET(12) , INCH(1) ;
    private int conversionFactor;

    Unit(int conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    public  float convertToBase(float value){
        return value * conversionFactor;
    }

}
