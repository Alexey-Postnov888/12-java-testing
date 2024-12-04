package org.example.testting.javatesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerDecodeTest {

    @Test
    void testSimpleDecimal() {
        assertEquals(123, Integer.decode("123"));
    }

    @Test
    void testHexadecimal() {
        assertEquals(26, Integer.decode("0x1A"));
    }

    @Test
    void testOctal() {
        assertEquals(10, Integer.decode("012"));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(-123, Integer.decode("-123"));
    }

    @Test
    void testInvalidString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("abc"));
    }

    @Test
    void testOverflow() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("9999999999"));
    }

    @Test
    void testEmptyString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode(""));
    }

    @Test
    void testNullArgument() {
        assertThrows(NullPointerException.class, () -> Integer.decode(null));
    }
}