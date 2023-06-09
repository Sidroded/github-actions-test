package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        assertEquals(calculator.sum(2, 2), 4);
    }

    @Test
    public void multiplyTest() {
        assertEquals(calculator.multiply(2, 2), 4);
    }

    @Test
    public void subTest() {
        assertEquals(calculator.sub(4, 2), 2);
    }

    @Test
    public void devTest() {
        assertEquals(calculator.dev(4, 2), 2.0);
    }
}