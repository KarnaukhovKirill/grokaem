package ru.kirill.chapter4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SumArrayTest {

    @Test
    public void testSumArray() {
        int[] array = {1, 2, 3, 4, 5};
        int rslt = SumArray.process(array);
        assertEquals(15, rslt);
    }

    @Test
    public void testSumArray2() {
        int[] array = {1};
        int rslt = SumArray.process(array);
        assertEquals(1, rslt);
    }

    @Test
    public void testSumArray3() {
        int[] array = {1, 2};
        int rslt = SumArray.process(array);
        assertEquals(3, rslt);
    }

    @Test
    public void testSumArray4() {
        int[] array = new int[]{};
        int rslt = SumArray.process(array);
        assertEquals(0, rslt);
    }

    @Test
    public void testSumArray5() {
        int[] array = new int[]{-100, 0, 100};
        int rslt = SumArray.process(array);
        assertEquals(0, rslt);
    }

    @Test
    public void testSumArray6() {
        int[] array = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100};
        int rslt = SumArray.process(array);
        assertEquals(900, rslt);
    }
}
