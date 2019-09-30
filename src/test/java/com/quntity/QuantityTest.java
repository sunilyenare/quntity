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
            Quantity anotherZeroLength = Quantity.createFeet(0);
            final Quantity zeroFoot = Quantity.createFeet(0);

            assertTrue(anotherZeroLength.equals(zeroFoot));
        }

        @Test
        void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

            assertFalse(Quantity.createFeet(0).equals(new Object()));
        }

        @Test
        void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
            Quantity oneLength = Quantity.createFeet(1);
            Quantity twoLength = Quantity.createFeet(2);

            assertFalse(oneLength.equals(twoLength));
        }

        @Test
        void givenZeroFeetAndNull_whenCompare_TheyShouldNotBeEqual() {

            Quantity zeroLength = Quantity.createFeet(1);

            assertFalse(zeroLength.equals(null));

        }

    }

    @Nested
    class InchTest {
        Quantity withZero = Quantity.createInch(0);

        @Test
        void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
            Quantity withAnotherZero = Quantity.createInch(0);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(Quantity.createInch(1)));
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
            Quantity oneInch = Quantity.createInch(1);
            Quantity oneFeet = Quantity.createFeet(1);

            assertFalse(oneFeet.equals(oneInch));
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquality_thenShouldBeEqual() {
            Quantity zeroInch = Quantity.createInch(0);
            Quantity zeroFeet = Quantity.createFeet(0);

            assertTrue(zeroFeet.equals(zeroInch));
        }

        @Test
        void givenOneFeetAndTwelveInch_whenCheckEquality_theShouldBeEqual() {
            Quantity twelveInch = Quantity.createInch(12);
            Quantity oneFeet = Quantity.createFeet(1);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwentyFourInch_whenCheckEquality_theyShouldBeEqual() {
            Quantity twentyFourInch = Quantity.createInch(24);
            Quantity twoFeet = Quantity.createFeet(2);

            assertEquals(twoFeet, twentyFourInch);
        }

        @Test
        void givenTwelveInchAndOneFeet_whenCheckEquality_theyShouldbeEqual() {
            Quantity twelveInch = Quantity.createInch(12);
            Quantity oneFeet = Quantity.createFeet(1);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            Quantity oneYard =  Quantity.createYard(1);
            Quantity oneFeet = Quantity.createFeet(1);

            assertFalse(oneFeet.equals(oneYard));
        }

        @Test
        void givenOneYardAndThreeFeet_whenCheckEquality_thenShouldBeEqual() {
            Quantity oneYard =  Quantity.createYard(1);
            Quantity threeFeet = Quantity.createFeet(3);

            assertFalse(threeFeet.equals(oneYard));
        }

        @Test
        void givenOneGallonAndThreePointSeventyEightLiter_whenCheckEquality_thenShouldBeEqual() {
            Quantity oneGallon =  Quantity.createGallon(1);
            Quantity threePointSeventyEightLiter = Quantity.createLiter(3.78);

            assertTrue(oneGallon.equals(threePointSeventyEightLiter));
        }

        @Test
        void givenOneGallonAndOneLiter_whenAdd_theyShouldReturnFourPointSevenEightLiter() throws IOException {

            Quantity oneGallon =  Quantity.createGallon(1);
            Quantity oneLiter = Quantity.createLiter(1);

            assertEquals(Quantity.createLiter(4.78), oneGallon.add(oneLiter));
        }

    }

    @Nested
    class GallonAndLiter {

        @Test
        void givenOneGallonAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneGallon =  Quantity.createGallon(1);
            Quantity oneLiter = Quantity.createLiter(1);

            assertFalse(oneGallon.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneGallon_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneFeet = Quantity.createFeet(1);
            Quantity oneGallon =  Quantity.createGallon(1);

            assertNotEquals(oneGallon, oneFeet);
        }

        @Test
        void givenOneInchAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneInch = Quantity.createInch(1);
            Quantity oneLiter = Quantity.createLiter(1);

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneLiterAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {
            Quantity oneLiter = Quantity.createLiter(1);
            Quantity oneInch = Quantity.createInch(1);

            assertFalse(oneLiter.equals(oneInch));
        }

        @Test
        void givenOneFeetAndOneGallon_whenAdded_theyShouldNotBeAdd() {
            Quantity oneFeet = Quantity.createFeet(1);
            Quantity oneGallon =  Quantity.createGallon(1);

            assertThrows(IOException.class, () -> {
                oneFeet.add(oneGallon);
            });
        }

        @Test
        void givenOneGallonAndOneFeet_whenAdded_theyShouldNotBeAdd() {
            Quantity oneGallon =  Quantity.createGallon(1);
            Quantity oneFeet = Quantity.createFeet(1);

            assertThrows(IOException.class, () -> {
                oneGallon.add(oneFeet);
            });
        }
    }

    @Nested
    class YardTest {
        Quantity withZero =  Quantity.createYard(0);

        @Test
        void givenZeroYardAndZeroYard_whenCheckEquality_theyShouldBeEqual() {
            Quantity withAnotherZero =  Quantity.createYard(0);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroYardAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroYardAndOneYard_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals( Quantity.createYard(1)));
           
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

            Quantity zeroInch = Quantity.createInch(0);
            Quantity anotherZeroInch = Quantity.createInch(0);
            assertEquals(Quantity.createInch(0), zeroInch.add(anotherZeroInch));
        }

        @Test
        void givenOneInchAndOneInch_whenAdd_theyShouldAdd() throws IOException {

            Quantity oneInch = Quantity.createInch(1);
            Quantity anotherOneInch = Quantity.createInch(1);

            assertEquals(Quantity.createInch(2.0), oneInch.add(anotherOneInch));
        }

        @Test
        void givenTwoInchAndTwoInch_whenAdd_theyShouldAdd() throws IOException {

            Quantity twoInch = Quantity.createInch(2);
            Quantity anotherTwoInch = Quantity.createInch(2);

            assertEquals(Quantity.createInch(4.0), twoInch.add(anotherTwoInch));
        }

        @Test
        void givenOneFeetAndTwoInch_whenAdd_theyShouldReturnFourteen() throws IOException {

            Quantity oneFeet = Quantity.createFeet(1);
            Quantity anotherTwoInch = Quantity.createInch(2);

            assertEquals(Quantity.createInch(14.0), oneFeet.add(anotherTwoInch));
        }
    }

}
