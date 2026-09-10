package ru.kirill.chapter4;

import java.util.Arrays;

public class SumArray {
    public static int process(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int middle = (array.length) / 2;
        int[] copyLeft = new int[middle];
        int[] copyRight = new  int[array.length - middle];
        System.arraycopy(array, 0, copyLeft, 0, middle);
        System.arraycopy(array, middle, copyRight, 0, array.length - middle);
        return process(copyLeft) + process(copyRight);
    }
}
