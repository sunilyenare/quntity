package com.quntity;

import com.quntity.length.Feet;
import com.quntity.length.Inch;
import com.quntity.length.Yard;
import com.quntity.volume.Gallon;
import com.quntity.volume.Liter;

public class QuantityFactory {

    public static Quantity createFeet(double value) {
        return new Quantity(value, new Feet());
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }
}
