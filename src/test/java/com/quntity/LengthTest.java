package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {

    @Nested
    class FeetTest{
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
        void givenZeroFeeAndNull_whenCompare_TheyShouldNotBeEqual() {

            Length zeroLength = new Length(1, Unit.FEET);

            assertFalse(zeroLength.equals(null));

        }

    }

    @Nested
    class InchTest{
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

            assertFalse(withZero.equals(new Length(1, Unit.INCH)));
        }

        @Test
        void givenZeroInchAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Test
    void givenOneInchAndOneFeet_whenCheckEquality_thenShouldNotbeEqual(){
        Length oneInch=new Length(1, Unit.INCH);
        Length oneFeet=new Length(1, Unit.FEET);

        assertFalse(oneFeet.equals(oneInch));
    }
    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquality_thenShouldbeEqual(){
        Length zeroInch=new Length(0, Unit.INCH);
        Length zeroFeet=new Length(0, Unit.FEET);

        assertTrue(zeroFeet.equals(zeroInch));
    }
}
