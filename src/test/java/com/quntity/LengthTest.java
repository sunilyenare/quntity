package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {

    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
        Length zeroFeet = new Length(0, "feet");

        assertTrue(zeroFeet.compare(zeroFeet));
    }

    @Test
    void givenOneFeetAndTw0Feet_whenCompare_TheyShouldNotBeEqual() {
        Length oneFeet = new Length(1, "feet");
        Length twoFeet = new Length(2, "feet");

        assertFalse(oneFeet.compare(twoFeet));
    }
}
