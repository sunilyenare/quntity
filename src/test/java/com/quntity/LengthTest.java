package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {


    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
        Length anotherZeroFeet = new Length(0, "feet");

        assertTrue(anotherZeroFeet.equals(new Length(0, "feet")));
    }

    @Test
    void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

        assertFalse(new Length(0, "feet").equals(new Object()));
    }

    @Test
    void givenOneFeetAndTw0Feet_whenCompare_TheyShouldNotBeEqual() {
        Length oneFeet = new Length(1, "feet");
        Length twoFeet = new Length(2, "feet");

        assertFalse(oneFeet.equals(twoFeet));
    }
}
