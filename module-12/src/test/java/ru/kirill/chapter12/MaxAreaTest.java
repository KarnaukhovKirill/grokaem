package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaTest {

    @Test
    public void test1() {
        int rsl = MaxArea.maxArea(new int[]{1,7,2,5,4,7,3,6});
        assertEquals(36, rsl);
    }

    @Test
    public void test2() {
        int rsl = MaxArea.maxArea(new int[]{2,2,2});
        assertEquals(4, rsl);
    }
}
