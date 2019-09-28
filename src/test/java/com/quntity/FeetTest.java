package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeetTest {


    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
        Feet anotherZeroFeet = new Feet(0);

        final Feet zeroFoot = new Feet(0);
        assertTrue(anotherZeroFeet.equals(zeroFoot));
    }

    @Test
    void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

        assertFalse(new Feet(0).equals(new Object()));
    }

    @Test
    void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
        Feet oneFeet = new Feet(1);
        Feet twoFeet = new Feet(2);

        assertFalse(oneFeet.equals(twoFeet));
    }
    @Test
    void givenZeroFeeAndNull_whenCompare_TheyShouldNotBeEqual(){

        Feet zeroFeet = new Feet(1);

        assertFalse(zeroFeet.equals(null));

    }
}
