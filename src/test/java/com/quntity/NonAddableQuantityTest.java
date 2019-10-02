package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.quntity.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonAddableQuantityTest {
    @Nested
    class CelsiusTest {

        @Test
        void givenZeroCelsiusAndZeroCelsius_whenCheckEquality_TheyShouldBeEqual() {
            NonAddableQuantity zeroCelsius = createCelsius(0);
            NonAddableQuantity anotherCelsius = createCelsius(0);

            assertEquals(zeroCelsius, anotherCelsius);
        }

        @Test
        void givenZeroCelsiusAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createCelsius(0), new Object());
        }

        @Test
        void givenOneCelsiusAndTwoCelsius_whenCheckEquality_TheyShouldNotBeEqual() {
            NonAddableQuantity oneCelsius = createCelsius(1);
            NonAddableQuantity twoCelsius = createCelsius(2);

            assertFalse(oneCelsius.equals(twoCelsius));
        }

        @Test
        void givenOneCelsiusAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            NonAddableQuantity oneCelsius = createCelsius(1);

            assertFalse(oneCelsius.equals(null));
        }
    }

    @Nested
    class FahrenheitTest {

        @Test
        void givenZeroFahrenheitAndZeroFahrenheit_whenCheckEquality_TheyShouldBeEqual() {
            NonAddableQuantity zeroFahrenheit = createFahrenheit(0.0);
            NonAddableQuantity anotherFahrenheit = createFahrenheit(0.0);

            assertEquals(zeroFahrenheit, anotherFahrenheit);
        }

        @Test
        void givenZeroFahrenheitAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createFahrenheit(0.0), new Object());
        }

        @Test
        void givenOneFahrenheitAndTwoFahrenheit_whenCheckEquality_TheyShouldNotBeEqual() {
            NonAddableQuantity oneFahrenheit = createFahrenheit(1);
            NonAddableQuantity twoFahrenheit = createFahrenheit(2);

            assertFalse(oneFahrenheit.equals(twoFahrenheit));
        }

        @Test
        void givenOneFahrenheitAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            NonAddableQuantity oneFahrenheit = createFahrenheit(1);

            assertFalse(oneFahrenheit.equals(null));
        }
    }

    @Nested
    class CelsiusAndFahrenheitEqualityTest {
        @Test
        void givenOneCelsiusAndOneFahrenheit_whenCheckEquality_theyShouldNotBeEqual() {
            NonAddableQuantity oneCelsius = createCelsius(1);
            NonAddableQuantity oneFahrenheit = createFahrenheit(1);

            assertFalse(oneCelsius.equals(oneFahrenheit));
        }

        @Test
        void givenOneFeetAndOneCelsius_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneFeet = createFeet(1);
            NonAddableQuantity oneCelsius = createCelsius(1);

            assertNotEquals(oneFeet, oneCelsius);
        }

        @Test
        void givenOneLiterAndOneFahrenheit_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneLiter = createLiter(1);
            NonAddableQuantity oneFahrenheit = createFahrenheit(1);

            assertNotEquals(oneLiter, oneFahrenheit);
        }

        @Test
        void givenZeroCelsiusAndThreeTwoFahrenheit_whenCheckEquality_theyShouldBeEqual() {
            NonAddableQuantity zeroCelsius = createCelsius(0);
            NonAddableQuantity threeTwoFahrenheit = createFahrenheit(32);

            assertEquals(zeroCelsius, threeTwoFahrenheit);
        }

        @Test
        void givenThreeTwoFahrenheitAndZeroCelsius_whenCheckEquality_theyShouldBeEqual() {
            NonAddableQuantity threeTwoFahrenheit = createFahrenheit(32);
            NonAddableQuantity zeroCelsius = createCelsius(0);

            assertEquals(threeTwoFahrenheit, zeroCelsius);
        }

        @Test
        void givenFiveZeroFahrenheitAndOneZeroCelsius_whenCheckEquality_theyShouldBeEqual() {
            NonAddableQuantity fiveZeroFahrenheit = createFahrenheit(50);
            NonAddableQuantity oneZeroCelsius = createCelsius(10);

            assertEquals(fiveZeroFahrenheit, oneZeroCelsius);
        }
    }


}
