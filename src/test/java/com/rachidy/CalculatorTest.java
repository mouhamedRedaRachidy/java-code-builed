package com.rachidy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSayHello() {
        assertEquals("Hello, World!", Calculator.sayHello("World"));
        assertEquals("Hello, Java!", Calculator.sayHello("Java"));
    }

    @Test
    void testSum() {
        assertEquals(5, Calculator.sum(2, 3));
        assertEquals(0, Calculator.sum(-1, 1));
        assertEquals(-5, Calculator.sum(-2, -3));
    }

    @Test
    void testMaynes() {
        assertEquals(2, Calculator.maynes(5, 3));
        assertEquals(-2, Calculator.maynes(3, 5));
        assertEquals(0, Calculator.maynes(3, 3));
    }

    @Test
    void testDerb() {
        assertEquals(15, Calculator.derb(3, 5));
        assertEquals(0, Calculator.derb(0, 5));
        assertEquals(-6, Calculator.derb(-2, 3));
    }

    @Test
    void testQisma() {
        assertEquals(3, Calculator.qisma(10, 3));
        assertEquals(2, Calculator.qisma(10, 5));
        assertEquals(-2, Calculator.qisma(-10, 5));
    }

    @Test
    void testQismaByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.qisma(5, 0));
    }
}
