package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {
    Inch withZero = new Inch(0);

    @Test
    void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
        Inch withAnotherZero = new Inch(0);

        assertTrue(withZero.equals(withAnotherZero));
    }

    @Test
    void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

        assertFalse(withZero.equals(new String()));
    }

    @Test
    void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {

        assertFalse(withZero.equals(new Inch(1)));
    }

    @Test
    void givenZeroInchAndNull_whenCheckEquality_theyShouldNotBeEqual() {

        assertFalse(withZero.equals(null));
    }
}
