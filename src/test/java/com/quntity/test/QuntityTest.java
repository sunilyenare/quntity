package com.quntity.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuntityTest {

    @Test
    void givenZerofeetZeroInch_whenCompare_theShouldReturnTrue(){
        Quntity quntity=new Quntity(0,0);
        assertTrue(quntity.compare());

    }
}
