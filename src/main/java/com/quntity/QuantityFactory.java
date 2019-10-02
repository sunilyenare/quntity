package com.quntity;

import com.quntity.length.Feet;
import com.quntity.length.Inch;
import com.quntity.length.Yard;
import com.quntity.temprature.Celsius;
import com.quntity.temprature.Fahrenheit;
import com.quntity.volume.Gallon;
import com.quntity.volume.Liter;
import com.quntity.weight.Gram;
import com.quntity.weight.KiloGram;

public class QuantityFactory {

    public static AddableQuantity createFeet(double value) {
        return new AddableQuantity(value, new Feet());
    }

    public static AddableQuantity createInch(double value) {
        return new AddableQuantity(value, new Inch());
    }

    public static AddableQuantity createYard(double value) {
        return new AddableQuantity(value, new Yard());
    }

    public static AddableQuantity createLiter(double value) {
        return new AddableQuantity(value, new Liter());
    }

    public static AddableQuantity createGallon(double value) {
        return new AddableQuantity(value, new Gallon());
    }

    public static AddableQuantity createKilogram(double value) {
        return new AddableQuantity(value, new KiloGram());
    }

    public static AddableQuantity createGram(double value) {
        return new AddableQuantity(value, new Gram());
    }

    public static Quantity createCelsius(double value) {
        return new Quantity(value, new Celsius());
    }

    public static Quantity createFahrenheit(double value) {
        return new Quantity(value, new Fahrenheit());
    }
}
