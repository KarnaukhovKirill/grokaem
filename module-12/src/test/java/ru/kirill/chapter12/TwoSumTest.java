package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum1() {
        int[] ints = TwoSum.twoSum(new int[]{5, 6, 7}, 11);
        assertArrayEquals(new int[]{0, 1}, ints);
    }

    @Test
    void twoSum2() {
        int[] ints = TwoSum.twoSum(new int[]{7, 10, 15}, 25);
        assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void twoSum3() {
        int[] ints = TwoSum.twoSum(new int[]{4, 5, 6}, 10);
        assertArrayEquals(new int[]{0, 2}, ints);
    }
}