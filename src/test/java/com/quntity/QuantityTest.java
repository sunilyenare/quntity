package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.quntity.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
            Quantity anotherZeroLength = createFeet(0);
            final Quantity zeroFoot = createFeet(0);

            assertTrue(anotherZeroLength.equals(zeroFoot));
        }

        @Test
        void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

            assertFalse(createFeet(0).equals(new Object()));
        }

        @Test
        void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
            Quantity oneLength = createFeet(1);
            Quantity twoLength = createFeet(2);

            assertFalse(oneLength.equals(twoLength));
        }

        @Test
        void givenZeroFeetAndNull_whenCompare_TheyShouldNotBeEqual() {

            Quantity zeroLength = createFeet(1);

            assertFalse(zeroLength.equals(null));

        }

    }

    @Nested
    class InchTest {
        Quantity withZero = createInch(0);

        @Test
        void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
            Quantity withAnotherZero = createInch(0);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(createInch(1)));
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
            Quantity oneInch = createInch(1);
            Quantity oneFeet = createFeet(1);

            assertFalse(oneFeet.equals(oneInch));
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquality_thenShouldBeEqual() {
            Quantity zeroInch = createInch(0);
            Quantity zeroFeet = createFeet(0);

            assertTrue(zeroFeet.equals(zeroInch));
        }

        @Test
        void givenOneFeetAndTwelveInch_whenCheckEquality_theShouldBeEqual() {
            Quantity twelveInch = createInch(12);
            Quantity oneFeet = createFeet(1);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwentyFourInch_whenCheckEquality_theyShouldBeEqual() {
            Quantity twentyFourInch = createInch(24);
            Quantity twoFeet = createFeet(2);

            assertEquals(twoFeet, twentyFourInch);
        }

        @Test
        void givenTwelveInchAndOneFeet_whenCheckEquality_theyShouldbeEqual() {
            Quantity twelveInch = createInch(12);
            Quantity oneFeet = createFeet(1);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            Quantity oneYard = createYard(1);
            Quantity oneFeet = createFeet(1);

            assertFalse(oneFeet.equals(oneYard));
        }

        @Test
        void givenOneYardAndThreeFeet_whenCheckEquality_thenShouldBeEqual() {
            Quantity oneYard = createYard(1);
            Quantity threeFeet = createFeet(3);

            assertFalse(threeFeet.equals(oneYard));
        }

        @Test
        void givenOneGallonAndThreePointSeventyEightLiter_whenCheckEquality_thenShouldBeEqual() {
            Quantity oneGallon = createGallon(1);
            Quantity threePointSeventyEightLiter = createLiter(3.78);

            assertTrue(oneGallon.equals(threePointSeventyEightLiter));
        }

        @Test
        void givenOneGallonAndOneLiter_whenAdd_theyShouldReturnFourPointSevenEightLiter() throws IllegalArgumentException {

            Quantity oneGallon = createGallon(1);
            Quantity oneLiter = createLiter(1);

            assertEquals(createLiter(4.78), oneGallon.add(oneLiter));
        }

    }

    @Nested
    class GallonAndLiter {

        @Test
        void givenOneGallonAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneGallon = createGallon(1);
            Quantity oneLiter = createLiter(1);

            assertFalse(oneGallon.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneGallon_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneFeet = createFeet(1);
            Quantity oneGallon = createGallon(1);

            assertNotEquals(oneGallon, oneFeet);
        }

        @Test
        void givenOneInchAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneInch = createInch(1);
            Quantity oneLiter = createLiter(1);

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneLiterAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneLiter = createLiter(1);
            Quantity oneInch = createInch(1);

            assertFalse(oneLiter.equals(oneInch));
        }

        @Test
        void givenOneFeetAndOneGallon_whenAdded_theyShouldNotBeAdd() {
            Quantity oneFeet = createFeet(1);
            Quantity oneGallon = createGallon(1);

            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
                oneFeet.add(oneGallon);
            });

            assertEquals(oneFeet.unit.getMeasurementType() + " AND " + oneGallon.unit.getMeasurementType() + " NOT VALID FOR ADD OPERATION ", thrown.getMessage());
        }

        @Test
        void givenOneGallonAndOneFeet_whenAdded_theyShouldNotBeAdd() {
            Quantity oneGallon = createGallon(1);
            Quantity oneFeet = createFeet(1);

            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
                oneGallon.add(oneFeet);
            });

            assertEquals(oneGallon.unit.getMeasurementType() + " AND " + oneFeet.unit.getMeasurementType() + " NOT VALID FOR ADD OPERATION ", thrown.getMessage());
        }
    }

    @Nested
    class YardTest {
        Quantity withZero = createYard(0);

        @Test
        void givenZeroYardAndZeroYard_whenCheckEquality_theyShouldBeEqual() {
            Quantity withAnotherZero = createYard(0);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroYardAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroYardAndOneYard_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(createYard(1)));

        }

        @Test
        void givenZeroYardAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Nested
    class AddLengths {

        @Test
        void givenZeroInchAndZeroInch_whenAdd_theyShouldAdd() throws IllegalArgumentException {

            Quantity zeroInch = createInch(0);
            Quantity anotherZeroInch = createInch(0);
            assertEquals(createInch(0), zeroInch.add(anotherZeroInch));
        }

        @Test
        void givenOneInchAndOneInch_whenAdd_theyShouldAdd() throws IllegalArgumentException {

            Quantity oneInch = createInch(1);
            Quantity anotherOneInch = createInch(1);

            assertEquals(createInch(2.0), oneInch.add(anotherOneInch));
        }

        @Test
        void givenTwoInchAndTwoInch_whenAdd_theyShouldAdd() throws IllegalArgumentException {

            Quantity twoInch = createInch(2);
            Quantity anotherTwoInch = createInch(2);

            assertEquals(createInch(4.0), twoInch.add(anotherTwoInch));
        }

        @Test
        void givenOneFeetAndTwoInch_whenAdd_theyShouldReturnFourteen() throws IllegalArgumentException {

            Quantity oneFeet = createFeet(1);
            Quantity anotherTwoInch = createInch(2);

            assertEquals(createInch(14.0), oneFeet.add(anotherTwoInch));
        }

        @Test
        void givenOneInchAndOneFeet_whenAdd_theyShouldReturnOneThree() throws IllegalArgumentException {

            Quantity oneFeet = createFeet(1);
            Quantity oneInch = createInch(1);

            assertEquals(createInch(13.0), oneInch.add(oneFeet));
        }
    }

    @Nested
    class KiloGramTest {
        @Test
        void givenZeroKiloGramAndZeroKiloGram_whenCheckEquality_TheyShouldBeEqual() {
            Quantity zeroKiloGram = createKilogram(0);
            Quantity anotherKiloGram = createKilogram(0);

            assertEquals(zeroKiloGram, anotherKiloGram);
        }

        @Test
        void givenZeroKiloGramAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createKilogram(0), new Object());
        }

        @Test
        void givenOneKiloGramAndTwoKiloGram_whenCheckEquality_TheyShouldNotBeEqual() {
            Quantity oneKiloGram = createKilogram(1);
            Quantity twoKiloGram = createKilogram(2);

            assertFalse(oneKiloGram.equals(twoKiloGram));
        }

    }


}
