package com.poly.testlab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(5, 3), 8);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(5, 3), 2);
    }
}
