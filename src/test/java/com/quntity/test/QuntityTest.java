package com.quntity.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuntityTest {

    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual(){
        Quntity zeroFeet=new Quntity(0,"feet");
        assertTrue(zeroFeet.compare(zeroFeet));
    }

    @Test
    void givenOneFeetAndTw0Feet_whenCompare_TheyShouldNotBeEqual(){
        Quntity oneFeet=new Quntity(1,"feet");
        Quntity twoFeet=new Quntity(2,"feet");

        assertFalse(oneFeet.compare(twoFeet));
    }
}
