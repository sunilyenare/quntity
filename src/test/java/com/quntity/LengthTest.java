package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
            Length anotherZeroLength = new Length(0, Unit.FEET);
            final Length zeroFoot = new Length(0, Unit.FEET);

            assertTrue(anotherZeroLength.equals(zeroFoot));
        }

        @Test
        void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

            assertFalse(new Length(0, Unit.FEET).equals(new Object()));
        }

        @Test
        void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
            Length oneLength = new Length(1, Unit.FEET);
            Length twoLength = new Length(2, Unit.FEET);

            assertFalse(oneLength.equals(twoLength));
        }

        @Test
        void givenZeroFeetAndNull_whenCompare_TheyShouldNotBeEqual() {

            Length zeroLength = new Length(1, Unit.FEET);

            assertFalse(zeroLength.equals(null));

        }

    }

    @Nested
    class InchTest {
        Length withZero = new Length(0, Unit.INCH);

        @Test
        void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
            Length withAnotherZero = new Length(0, Unit.INCH);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new Length(1.0f, Unit.INCH)));
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
            Length oneInch = new Length(1, Unit.INCH);
            Length oneFeet = new Length(1, Unit.FEET);

            assertFalse(oneFeet.equals(oneInch));
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquality_thenShouldBeEqual() {
            Length zeroInch = new Length(0, Unit.INCH);
            Length zeroFeet = new Length(0, Unit.FEET);

            assertTrue(zeroFeet.equals(zeroInch));
        }

        @Test
        void givenOneFeetAndTwelveInch_whenCheckEquality_theShouldBeEqual() {
            Length twelveInch = new Length(12, Unit.INCH);
            Length oneFeet = new Length(1, Unit.FEET);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwentyFourInch_whenCheckEquality_theyShouldBeEqual() {
            Length twentyFourInch = new Length(24, Unit.INCH);
            Length twoFeet = new Length(2, Unit.FEET);

            assertEquals(twoFeet, twentyFourInch);
        }

        @Test
        void givenTwelveInchAndOneFeet_whenCheckEquality_theyShouldbeEqual() {
            Length twelveInch = new Length(12, Unit.INCH);
            Length oneFeet = new Length(1, Unit.FEET);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            Length oneYard = new Length(1, Unit.YARD);
            Length oneFeet = new Length(1, Unit.FEET);

            assertFalse(oneFeet.equals(oneYard));
        }

        @Test
        void givenOneYardAndThreeFeet_whenCheckEquality_thenShouldBeEqual() {
            Length oneYard = new Length(1, Unit.YARD);
            Length threeFeet = new Length(3, Unit.FEET);

            assertFalse(threeFeet.equals(oneYard));
        }

    }

    @Nested
    class YardTest {
        Length withZero = new Length(0, Unit.YARD);

        @Test
        void givenZeroYardAndZeroYard_whenCheckEquality_theyShouldBeEqual() {
            Length withAnotherZero = new Length(0, Unit.YARD);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroYardAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroYardAndOneYard_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new Length(1.0f, Unit.YARD)));
        }

        @Test
        void givenZeroYardAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Nested
    class AddLengths {

        @Test
        void givenZeroInchAndZeroInch_whenAdd_theyShouldAdd() {

            Length zeroInch = new Length(0.0, Unit.INCH);
            Length anotherZeroInch = new Length(0.0, Unit.INCH);

            assertEquals(new Length(0.0, Unit.INCH), zeroInch.add(anotherZeroInch));
        }

        @Test
        void givenOneInchAndOneInch_whenAdd_theyShouldAdd() {

            Length oneInch = new Length(1, Unit.INCH);
            Length anotherOneInch = new Length(1, Unit.INCH);

            assertEquals(new Length(2.0, Unit.INCH), oneInch.add(anotherOneInch));
        }

        @Test
        void givenTwoInchAndTwoInch_whenAdd_theyShouldAdd() {

            Length twoInch = new Length(2, Unit.INCH);
            Length anotherTwoInch = new Length(2, Unit.INCH);

            assertEquals(new Length(4.0, Unit.INCH), twoInch.add(anotherTwoInch));
        }
    }

}
