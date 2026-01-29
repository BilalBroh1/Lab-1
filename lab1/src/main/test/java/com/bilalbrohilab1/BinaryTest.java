package com.bilalbrohilab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTest {

    @Test
    public void testOr1() {
        assertEquals("111", Binary.or(new Binary("101"), new Binary("010")).getValue());
    }

    @Test
    public void testOr2() {
        assertEquals("1", Binary.or(new Binary("1"), new Binary("0")).getValue());
    }

    @Test
    public void testOr3() {
        assertEquals("1111", Binary.or(new Binary("1010"), new Binary("0101")).getValue());
    }

    @Test
    public void testAnd1() {
        assertEquals("000", Binary.and(new Binary("101"), new Binary("010")).getValue());
    }

    @Test
    public void testAnd2() {
        assertEquals("1", Binary.and(new Binary("1"), new Binary("1")).getValue());
    }

    @Test
    public void testAnd3() {
        assertEquals("1000", Binary.and(new Binary("1100"), new Binary("1010")).getValue());
    }

    @Test
    public void testMultiply1() {
        assertEquals("1111", Binary.multiply(new Binary("101"), new Binary("11")).getValue());
    }

    @Test
    public void testMultiply2() {
        assertEquals("0", Binary.multiply(new Binary("0"), new Binary("101")).getValue());
    }

    @Test
    public void testMultiply3() {
        assertEquals("100", Binary.multiply(new Binary("10"), new Binary("10")).getValue());
    }
}
