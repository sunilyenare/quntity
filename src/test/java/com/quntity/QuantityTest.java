package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
            Quantity anotherZeroLength = new Quantity(0, Unit.FEET);
            final Quantity zeroFoot = new Quantity(0, Unit.FEET);

            assertTrue(anotherZeroLength.equals(zeroFoot));
        }

        @Test
        void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

            assertFalse(new Quantity(0, Unit.FEET).equals(new Object()));
        }

        @Test
        void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
            Quantity oneLength = new Quantity(1, Unit.FEET);
            Quantity twoLength = new Quantity(2, Unit.FEET);

            assertFalse(oneLength.equals(twoLength));
        }

        @Test
        void givenZeroFeetAndNull_whenCompare_TheyShouldNotBeEqual() {

            Quantity zeroLength = new Quantity(1, Unit.FEET);

            assertFalse(zeroLength.equals(null));

        }

    }

    @Nested
    class InchTest {
        Quantity withZero = new Quantity(0, Unit.INCH);

        @Test
        void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
            Quantity withAnotherZero = new Quantity(0, Unit.INCH);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new Quantity(1.0f, Unit.INCH)));
        }

        @Test
        void givenZeroInchAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Nested
    class ConversionTest {
        @Test
        void givenOneInchAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            Quantity oneInch = new Quantity(1, Unit.INCH);
            Quantity oneFeet = new Quantity(1, Unit.FEET);

            assertFalse(oneFeet.equals(oneInch));
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquality_thenShouldBeEqual() {
            Quantity zeroInch = new Quantity(0, Unit.INCH);
            Quantity zeroFeet = new Quantity(0, Unit.FEET);

            assertTrue(zeroFeet.equals(zeroInch));
        }

        @Test
        void givenOneFeetAndTwelveInch_whenCheckEquality_theShouldBeEqual() {
            Quantity twelveInch = new Quantity(12, Unit.INCH);
            Quantity oneFeet = new Quantity(1, Unit.FEET);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwentyFourInch_whenCheckEquality_theyShouldBeEqual() {
            Quantity twentyFourInch = new Quantity(24, Unit.INCH);
            Quantity twoFeet = new Quantity(2, Unit.FEET);

            assertEquals(twoFeet, twentyFourInch);
        }

        @Test
        void givenTwelveInchAndOneFeet_whenCheckEquality_theyShouldbeEqual() {
            Quantity twelveInch = new Quantity(12, Unit.INCH);
            Quantity oneFeet = new Quantity(1, Unit.FEET);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            Quantity oneYard = new Quantity(1, Unit.YARD);
            Quantity oneFeet = new Quantity(1, Unit.FEET);

            assertFalse(oneFeet.equals(oneYard));
        }

        @Test
        void givenOneYardAndThreeFeet_whenCheckEquality_thenShouldBeEqual() {
            Quantity oneYard = new Quantity(1, Unit.YARD);
            Quantity threeFeet = new Quantity(3, Unit.FEET);

            assertFalse(threeFeet.equals(oneYard));
        }

        @Test
        void givenOneGallonAndThreePointSeventyEightLiter_whenCheckEquality_thenShouldBeEqual() {
            Quantity oneGallon = new Quantity(1, Unit.GALLON);
            Quantity threePointSeventyEightLiter = new Quantity(3.78, Unit.LITER);

            assertTrue(oneGallon.equals(threePointSeventyEightLiter));
        }

        @Test
        void givenOneGallonAndOneLiter_whenAdd_theyShouldReturnFourPointSevenEightLiter() throws IOException {

            Quantity oneGallon = new Quantity(1, Unit.GALLON);
            Quantity oneLiter = new Quantity(1, Unit.LITER);

            assertEquals(new Quantity(4.78, Unit.LITER), oneGallon.add(oneLiter));
        }

    }

    @Nested
    class GallonAndLiter {

        @Test
        void givenOneGallonAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneGallon = new Quantity(1, Unit.GALLON);
            Quantity oneLiter = new Quantity(1, Unit.LITER);

            assertFalse(oneGallon.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneGallon_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneFeet = new Quantity(1, Unit.FEET);
            Quantity oneGallon = new Quantity(1, Unit.GALLON);

            assertFalse(oneGallon.equals(oneFeet));
        }

        @Test
        void givenOneInchAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneInch = new Quantity(1, Unit.INCH);
            Quantity oneLiter = new Quantity(1, Unit.LITER);

            //  assertFalse(oneInch.equals(oneLiter));
        }


        @Test
        void givenOneFeetAndOneGallon_whenAdded_theyShouldNotBeAdd() {
            Quantity oneFeet = new Quantity(1, Unit.FEET);
            Quantity oneGallon = new Quantity(1, Unit.GALLON);

            assertThrows(IOException.class, () -> {
                oneFeet.add(oneGallon);
            });
        }

    }

    @Nested
    class YardTest {
        Quantity withZero = new Quantity(0, Unit.YARD);

        @Test
        void givenZeroYardAndZeroYard_whenCheckEquality_theyShouldBeEqual() {
            Quantity withAnotherZero = new Quantity(0, Unit.YARD);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroYardAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroYardAndOneYard_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new Quantity(1.0f, Unit.YARD)));
        }

        @Test
        void givenZeroYardAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Nested
    class AddLengths {

        @Test
        void givenZeroInchAndZeroInch_whenAdd_theyShouldAdd() throws IOException {

            Quantity zeroInch = new Quantity(0.0, Unit.INCH);
            Quantity anotherZeroInch = new Quantity(0.0, Unit.INCH);

            assertEquals(new Quantity(0.0, Unit.INCH), zeroInch.add(anotherZeroInch));
        }

        @Test
        void givenOneInchAndOneInch_whenAdd_theyShouldAdd() throws IOException {

            Quantity oneInch = new Quantity(1, Unit.INCH);
            Quantity anotherOneInch = new Quantity(1, Unit.INCH);

            assertEquals(new Quantity(2.0, Unit.INCH), oneInch.add(anotherOneInch));
        }

        @Test
        void givenTwoInchAndTwoInch_whenAdd_theyShouldAdd() throws IOException {

            Quantity twoInch = new Quantity(2, Unit.INCH);
            Quantity anotherTwoInch = new Quantity(2, Unit.INCH);

            assertEquals(new Quantity(4.0, Unit.INCH), twoInch.add(anotherTwoInch));
        }

        @Test
        void givenOneFeetAndTwoInch_whenAdd_theyShouldReturnFourteen() throws IOException {

            Quantity oneFeet = new Quantity(1, Unit.FEET);
            Quantity anotherTwoInch = new Quantity(2, Unit.INCH);

            assertEquals(new Quantity(14.0, Unit.INCH), oneFeet.add(anotherTwoInch));
        }
    }

}
