package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {
    @Test
    void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
        Inch withZero = new Inch(0);
        Inch withAnotherZero = new Inch(0);

        assertTrue(withZero.equals(withAnotherZero));
    }

    @Test
    void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {
        Inch withZero = new Inch(0);

        assertFalse(withZero.equals(new String()));
    }

    @Test
    void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {
        Inch withZero = new Inch(0);

        assertFalse(withZero.equals(new Inch(1)));
    }
}
