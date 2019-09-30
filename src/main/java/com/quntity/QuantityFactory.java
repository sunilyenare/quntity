package com.quntity;

public class QuantityFactory {

    public static Quantity createFeet(double value) {
        return new Quantity(value, Unit.FEET);
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, Unit.INCH);
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, Unit.YARD);
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, Unit.LITER);
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, Unit.GALLON);
    }
}
