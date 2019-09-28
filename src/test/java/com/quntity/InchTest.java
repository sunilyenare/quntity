package com.quntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InchTest {
    @Test
    void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldNotBeEqual() {
        Inch withZero = new Inch(0);
        Inch withAnotherZero = new Inch(0);

        assertTrue(withZero.equals(withAnotherZero));
    }
}
