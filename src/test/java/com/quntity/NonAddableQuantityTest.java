package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.quntity.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class NonAddableQuantityTest {
    @Nested
    class CelsiusTest {

        @Test
        void givenZeroCelsiusAndZeroCelsius_whenCheckEquality_TheyShouldBeEqual() {
            Quantity zeroCelsius = createCelsius(0);
            Quantity anotherCelsius = createCelsius(0);

            assertEquals(zeroCelsius, anotherCelsius);
        }

        @Test
        void givenZeroCelsiusAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createCelsius(0), new Object());
        }

        @Test
        void givenOneCelsiusAndTwoCelsius_whenCheckEquality_TheyShouldNotBeEqual() {
            Quantity oneCelsius = createCelsius(1);
            Quantity twoCelsius = createCelsius(2);

            assertFalse(oneCelsius.equals(twoCelsius));
        }

        @Test
        void givenOneCelsiusAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            Quantity oneCelsius = createCelsius(1);

            assertFalse(oneCelsius.equals(null));
        }
    }

    @Nested
    class FahrenheitTest {

        @Test
        void givenZeroFahrenheitAndZeroFahrenheit_whenCheckEquality_TheyShouldBeEqual() {
            Quantity zeroFahrenheit = createFahrenheit(0.0);
            Quantity anotherFahrenheit = createFahrenheit(0.0);

            assertEquals(zeroFahrenheit, anotherFahrenheit);
        }

        @Test
        void givenZeroFahrenheitAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createFahrenheit(0.0), new Object());
        }

        @Test
        void givenOneFahrenheitAndTwoFahrenheit_whenCheckEquality_TheyShouldNotBeEqual() {
            Quantity oneFahrenheit = createFahrenheit(1);
            Quantity twoFahrenheit = createFahrenheit(2);

            assertFalse(oneFahrenheit.equals(twoFahrenheit));
        }

        @Test
        void givenOneFahrenheitAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            Quantity oneFahrenheit = createFahrenheit(1);

            assertFalse(oneFahrenheit.equals(null));
        }
    }

    @Nested
    class CelsiusAndFahrenheitEqualityTest {
        @Test
        void givenOneCelsiusAndOneFahrenheit_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneCelsius = createCelsius(1);
            Quantity oneFahrenheit = createFahrenheit(1);

            assertFalse(oneCelsius.equals(oneFahrenheit));
        }

        @Test
        void givenOneFeetAndOneCelsius_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneFeet = createFeet(1);
            Quantity oneCelsius = createCelsius(1);

            assertNotEquals(oneFeet, oneCelsius);
        }

        @Test
        void givenOneLiterAndOneFahrenheit_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneLiter = createLiter(1);
            Quantity oneFahrenheit = createFahrenheit(1);

            assertNotEquals(oneLiter, oneFahrenheit);
        }

        @Test
        void givenZeroCelsiusAndThreeTwoFahrenheit_whenCheckEquality_theyShouldBeEqual() {
            Quantity zeroCelsius = createCelsius(0);
            Quantity threeTwoFahrenheit = createFahrenheit(32);

            assertEquals(zeroCelsius, threeTwoFahrenheit);
        }

        @Test
        void givenThreeTwoFahrenheitAndZeroCelsius_whenCheckEquality_theyShouldBeEqual() {
            Quantity threeTwoFahrenheit = createFahrenheit(32);
            Quantity zeroCelsius = createCelsius(0);

            assertEquals(threeTwoFahrenheit, zeroCelsius);
        }

        @Test
        void givenFiveZeroFahrenheitAndOneZeroCelsius_whenCheckEquality_theyShouldBeEqual() {
            Quantity fiveZeroFahrenheit = createFahrenheit(50);
            Quantity oneZeroCelsius = createCelsius(10);

            assertEquals(fiveZeroFahrenheit, oneZeroCelsius);
        }
    }


}
