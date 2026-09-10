package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopKFrequentTest {

    @Test
    public void test1() {
        int [] rsl = TopKFrequent.process(new int[]{1,2,2,3,3,3}, 2);
        assertArrayEquals(new int[]{2,3}, rsl);
    }

    @Test
    public void test2() {
        int [] rsl = TopKFrequent.process(new int[]{7,7}, 1);
        assertArrayEquals(new int[]{7}, rsl);
    }
}
