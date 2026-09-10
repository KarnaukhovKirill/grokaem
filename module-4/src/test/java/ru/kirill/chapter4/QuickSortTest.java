package ru.kirill.chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void quickSortTest1() {
        int[] sortedArray =  QuickSort.process(new int[]{1});
        Assertions.assertArrayEquals(new int[]{1}, sortedArray);
    }

    @Test
    public void quickSortTest2() {
        int[] sortedArray =  QuickSort.process(new int[]{1,-1,22});
        Assertions.assertArrayEquals(new int[]{-1,1,22}, sortedArray);
    }

    @Test
    public void quickSortTest3() {
        int[] sortedArray =  QuickSort.process(new int[]{1,-1,22, 10});
        Assertions.assertArrayEquals(new int[]{-1,1,10,22}, sortedArray);
    }

    @Test
    public void quickSortTest4() {
        int[] sortedArray =  QuickSort.process(new int[]{});
        Assertions.assertArrayEquals(new int[]{}, sortedArray);
    }
}
