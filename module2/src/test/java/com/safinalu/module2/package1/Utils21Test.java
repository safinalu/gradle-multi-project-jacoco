package com.safinalu.module2.package1;

import module2.package1.Utils21;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utils21Test {

    @Test
    public void returnOneOne() {
        assertEquals("module2-one-one", Utils21.returnOneOne());
    }

    @Test
    public void returnOneTwo() {

        //missed call for Utils21.returnOneTwo()
        //assertEquals("module2-one-two", Utils21.returnOneTwo());
    }
}
