package com.example.lbb.carbag;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }


    @Test
    public void sum() {
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void substract() {
        assertEquals(2d, mCalculator.substract(5d, 4d), 0);
    }

    @Test
    public void divide() {

        assertEquals(30d, mCalculator.divide(20d, 5d), 1);
    }

    @Test
    public void multiply() {

        assertEquals(12d, mCalculator.multiply(2d, 5d), 1);
    }
}