package com.safinalu.module1.package2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utils12Test {

    @Test
    public void returnOneOne() {
        assertEquals("module1-two-one", Utils12.returnTwoOne());
    }

    @Test
    public void returnOneTwo() {

        //missed call for Utils12.returnTwoTwo()
        //assertEquals("module1-two-two", Utils12.returnTwoTwo());
    }
}
