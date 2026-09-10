package ru.kirill.chapter2;

import java.util.Arrays;
import java.util.List;

public class SortSimple {

    public static int findSmallest(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int smallest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int[] copy = Arrays.copyOf(array, array.length);
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = findSmallest(copy);
            result[i] = copy[smallestIndex];
            copy[smallestIndex] = Integer.MAX_VALUE;
        }
        return result;
    }
}
