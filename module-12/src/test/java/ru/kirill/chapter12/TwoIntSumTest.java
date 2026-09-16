package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoIntSumTest {

    @Test
    public void test1() {
        int [] rsl = TwoIntSum.twoSum(new int[]{1, 2, 3, 4}, 3);
        assertArrayEquals(new int[]{1,2}, rsl);
    }

    @Test
    public void test2() {
        int [] rsl = TwoIntSum.twoSum(new int[]{1, 2}, 3);
        assertArrayEquals(new int[]{1,2}, rsl);
    }

    @Test
    public void test3() {
        int [] rsl = TwoIntSum.twoSum(new int[]{1, 2 , 3, 6}, 5);
        assertArrayEquals(new int[]{2,3}, rsl);
    }

    @Test
    public void test4() {
        int [] rsl = TwoIntSum.twoSum(new int[]{1, 2 , 3, 6}, 7);
        assertArrayEquals(new int[]{1,4}, rsl);
    }

    @Test
    public void test5() {
        int [] rsl = TwoIntSum.twoSum(new int[]{2 , 3, 4}, 6);
        assertArrayEquals(new int[]{1,3}, rsl);
    }

    @Test
    public void test6() {
        int [] rsl = TwoIntSum.twoSum(new int[]{-5,-3,0,2,4,6,8}, 5);
        assertArrayEquals(new int[]{2,7}, rsl);
    }
}
