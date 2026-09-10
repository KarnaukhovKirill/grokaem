package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductExpectSelfTest {

    @Test
    public void test1() {
        int [] rsl = ProductExpectSelf.productExceptSelf(new int[]{2,2,4,6});
        assertArrayEquals(new int[]{48,48,24,16}, rsl);
    }

    @Test
    public void test2() {
        int [] rsl = ProductExpectSelf.productExceptSelf(new int[]{-1,0,1,2,3});
        assertArrayEquals(new int[]{0,-6,0,0,0}, rsl);
    }
}
