package org.nizhikebinesi.codeproblems.numbers;

import org.junit.Assert;

import org.junit.Test;

import static org.nizhikebinesi.codeproblems.numbers.SumIntegerNumberDigits.*;

public class TestSumIntegerNumberDigits {

    @Test
    public void testZero() {
        int num = 0;
        int expected = 0;

        int actual = getSumIntegerNumberDigits(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOrdinaryInteger() {
        int num = 42;
        int expected = 6;

        int actual = getSumIntegerNumberDigits(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNumber() {
        int num = -1;
        int expected = 1;

        int actual = getSumIntegerNumberDigits(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaxInteger() {
        int num = Integer.MAX_VALUE;
        int expected = 46;

        int actual = getSumIntegerNumberDigits(num);

        Assert.assertEquals(expected, actual);
    }

}
