package org.nizhikebinesi.codeproblems.numbers;

import org.junit.Assert;
import org.nizhikebinesi.codeproblems.numbers.ThreeMaxArrayNumbers.*;

import org.junit.Test;

import static org.nizhikebinesi.codeproblems.numbers.ThreeMaxArrayNumbers.findThreeMaxArrayNumbers;

public class TestThreeMaxArrayNumbers {

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectLength() {
        Integer[] arr = {};

        findThreeMaxArrayNumbers(arr);
    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        Integer[] arr = null;

        findThreeMaxArrayNumbers(arr);
    }

    @Test
    public void testIntegerArrayMinSize() {
        Integer[] arr = {1, 2, 3};

        Triple expected = new Triple(3, 2, 1);

        Triple actual = findThreeMaxArrayNumbers(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIntegerArray() {
        Integer[] arr = {1, 42, 2, 3, 4, 5};

        Triple expected = new Triple(42, 5, 4);

        Triple actual = findThreeMaxArrayNumbers(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLongArray() {
        Long[] arr = {1L, Long.MAX_VALUE, 42L, 2L, 3L, 4L, 5L};

        Triple expected = new Triple(Long.MAX_VALUE, 42L, 5L);

        Triple actual = findThreeMaxArrayNumbers(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFloatArray() {
        Float[] arr = {1.0f, 132.8f, 2.29f, 3.32f};

        Triple expected = new Triple(132.8f, 3.32f, 2.29f);

        Triple actual = findThreeMaxArrayNumbers(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDoubleArray() {
        Double[] arr = {1.0, 132.8, 2.29, 3.32};

        Triple expected = new Triple(132.8, 3.32 , 2.29);

        Triple actual = findThreeMaxArrayNumbers(arr);

        Assert.assertEquals(expected, actual);
    }
}
