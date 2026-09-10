package ru.kirill.chapter4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GreatestNumberInArrayTest {
    @Test
    public void test_process() {
        int[] array = new int[]{1,2,3};
        int rslt = GreatestNumberInArray.process(array);
        assertEquals(3, rslt);
    }

    @Test
    public void test_process2() {
        int[] array = new int[]{};
        int rslt = GreatestNumberInArray.process(array);
        assertEquals(0, rslt);
    }

    @Test
    public void test_process3() {
        int[] array = new int[]{100, 0, 0};
        int rslt = GreatestNumberInArray.process(array);
        assertEquals(100, rslt);
    }

    @Test
    public void test_process4() {
        int[] array = new int[]{-100, 0, 100};
        int rslt = GreatestNumberInArray.process(array);
        assertEquals(100, rslt);
    }
}
