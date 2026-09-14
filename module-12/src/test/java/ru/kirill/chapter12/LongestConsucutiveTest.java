package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsucutiveTest {

    @Test
    public void test1() {
        int rsl = LongestConsucutive.longestConsecutive(new int[]{2,20,4,10,3,4,5});
        assertEquals(4, rsl);
    }

    @Test
    public void test2() {
        int rsl = LongestConsucutive.longestConsecutive(new int[]{0,3,2,5,4,6,1,1});
        assertEquals(7, rsl);
    }

    @Test
    public void test3() {
        int rsl = LongestConsucutive.longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6});
        assertEquals(7, rsl);
    }
}
