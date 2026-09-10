package ru.kirill.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSimpleTest {

    @Test
    void findSmallest() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = SortSimple.findSmallest(array);
        assertEquals(0, result);
    }

    @Test
    void findLargest() {
        int[] array = new int[]{1, 2, 0, 4, 5, 6, 7, 8, 9};
        int smallest = SortSimple.findSmallest(array);
        assertEquals(2, smallest);
    }

    @Test
    void findSmallestInTheEnd() {
        int[] array = new int[]{1, 2, 100, 4, 5, 6, 7, 8, 0};
        int smallest = SortSimple.findSmallest(array);
        assertEquals(8, smallest);
    }

    @Test
    void findSmallestInTheOnlyOne() {
        int[] array = new int[]{1};
        int smallest = SortSimple.findSmallest(array);
        assertEquals(0, smallest);
    }

    @Test
    void findSmallestInTheSame() {
        int[] array = new int[]{0, 0, 0};
        int smallest = SortSimple.findSmallest(array);
        assertEquals(0, smallest);
    }

    @Test
    void sort() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] sort = SortSimple.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, sort);
    }

    @Test
    void sort2() {
        int[] array = new int[]{5,3,1,10};
        int[] sort = SortSimple.sort(array);
        assertArrayEquals(new int[]{1,3,5,10}, sort);
    }

    @Test
    void sort3() {
        int[] array = new int[]{0,0,0};
        int[] sort = SortSimple.sort(array);
        assertArrayEquals(new int[]{0,0,0}, sort);
    }
}