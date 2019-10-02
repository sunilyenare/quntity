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
            AddableQuantity zeroCelsius = createCelsius(0);
            AddableQuantity anotherCelsius = createCelsius(0);

            assertEquals(zeroCelsius, anotherCelsius);
        }

        @Test
        void givenZeroCelsiusAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createCelsius(0), new Object());
        }

        @Test
        void givenOneCelsiusAndTwoCelsius_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneCelsius = createCelsius(1);
            AddableQuantity twoCelsius = createCelsius(2);

            assertFalse(oneCelsius.equals(twoCelsius));
        }

        @Test
        void givenOneCelsiusAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneCelsius = createCelsius(1);

            assertFalse(oneCelsius.equals(null));
        }
    }

    @Nested
    class FahrenheitTest {

        @Test
        void givenZeroFahrenheitAndZeroFahrenheit_whenCheckEquality_TheyShouldBeEqual() {
            AddableQuantity zeroFahrenheit = createFahrenheit(0.0);
            AddableQuantity anotherFahrenheit = createFahrenheit(0.0);

            assertEquals(zeroFahrenheit, anotherFahrenheit);
        }

        @Test
        void givenZeroFahrenheitAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createFahrenheit(0.0), new Object());
        }

        @Test
        void givenOneFahrenheitAndTwoFahrenheit_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneFahrenheit = createFahrenheit(1);
            AddableQuantity twoFahrenheit = createFahrenheit(2);

            assertFalse(oneFahrenheit.equals(twoFahrenheit));
        }

        @Test
        void givenOneFahrenheitAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneFahrenheit = createFahrenheit(1);

            assertFalse(oneFahrenheit.equals(null));
        }
    }

    @Nested
    class CelsiusAndFahrenheitEqualityTest {
        @Test
        void givenOneCelsiusAndOneFahrenheit_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneCelsius = createCelsius(1);
            AddableQuantity oneFahrenheit = createFahrenheit(1);

            assertFalse(oneCelsius.equals(oneFahrenheit));
        }

        @Test
        void givenOneFeetAndOneCelsius_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity oneCelsius = createCelsius(1);

            assertNotEquals(oneFeet, oneCelsius);
        }

        @Test
        void givenOneLiterAndOneFahrenheit_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneLiter = createLiter(1);
            AddableQuantity oneFahrenheit = createFahrenheit(1);

            assertNotEquals(oneLiter, oneFahrenheit);
        }

        @Test
        void givenZeroCelsiusAndThreeTwoFahrenheit_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity zeroCelsius = createCelsius(0);
            AddableQuantity threeTwoFahrenheit = createFahrenheit(32);

            assertEquals(zeroCelsius, threeTwoFahrenheit);
        }

        @Test
        void givenThreeTwoFahrenheitAndZeroCelsius_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity threeTwoFahrenheit = createFahrenheit(32);
            AddableQuantity zeroCelsius = createCelsius(0);

            assertEquals(threeTwoFahrenheit, zeroCelsius);
        }

        @Test
        void givenFiveZeroFahrenheitAndOneZeroCelsius_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity fiveZeroFahrenheit = createFahrenheit(50);
            AddableQuantity oneZeroCelsius = createCelsius(10);

            assertEquals(fiveZeroFahrenheit, oneZeroCelsius);
        }
    }


}
