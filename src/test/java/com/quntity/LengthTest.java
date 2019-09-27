package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {


    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
        Length anotherZeroFeet = new Length(0, Length.Unit.Foot);

        final Length zeroFoot = new Length(0, Length.Unit.Foot);
        assertTrue(anotherZeroFeet.equals(zeroFoot));
    }

    @Test
    void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

        assertFalse(new Length(0, Length.Unit.Foot).equals(new Object()));
    }

    @Test
    void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
        Length oneFeet = new Length(1, Length.Unit.Foot);
        Length twoFeet = new Length(2, Length.Unit.Foot);

        assertFalse(oneFeet.equals(twoFeet));
    }
    @Test
    void givenZeroFeeAndNull_whenCompare_TheyShouldNotBeEqual(){

        Length zeroFeet = new Length(1, Length.Unit.Foot);

        assertFalse(zeroFeet.equals(null));

    }
}
