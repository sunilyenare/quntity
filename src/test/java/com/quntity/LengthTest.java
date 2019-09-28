package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {


    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
        Length anotherZeroLength = new Length(0, Length.Unit.FEET);

        final Length zeroFoot = new Length(0,Length.Unit.FEET);
        assertTrue(anotherZeroLength.equals(zeroFoot));
    }

    @Test
    void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

        assertFalse(new Length(0,Length.Unit.FEET).equals(new Object()));
    }

    @Test
    void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
        Length oneLength = new Length(1,Length.Unit.FEET);
        Length twoLength = new Length(2,Length.Unit.FEET);

        assertFalse(oneLength.equals(twoLength));
    }
    @Test
    void givenZeroFeeAndNull_whenCompare_TheyShouldNotBeEqual(){

        Length zeroLength = new Length(1,Length.Unit.FEET);

        assertFalse(zeroLength.equals(null));

    }
}
