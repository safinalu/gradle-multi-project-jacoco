package com.safinalu.module1.package1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utils11Test {

    @Test
    public void returnOneOne() {
        assertEquals("module1-one-one", Utils11.returnOneOne());
    }

    @Test
    public void returnOneTwo() {
        assertEquals("module1-one-two", Utils11.returnOneTwo());
    }
}
