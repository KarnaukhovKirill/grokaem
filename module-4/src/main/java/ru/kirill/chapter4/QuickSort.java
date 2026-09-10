package ru.kirill.chapter4;

public class QuickSort {

    public static int[] process(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        int[] result = array.clone();
        partition(result, 0, result.length - 1);
        return result;
    }

    private static void partition(int[] result, int begin, int end) {
        if (begin < end) {
            int pivotIndex = split(result, begin, end);
            partition(result, begin, pivotIndex - 1);
            partition(result, pivotIndex + 1, end);
        }
    }

    private static int split(int[] result, int begin, int end) {
        int pivotIndex = begin + (end - begin) / 2;
        swap(result, pivotIndex, end);
        int pivot = result[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (result[j] < pivot) {
                i++;
                swap(result, i, j);
            }
        }

        swap(result, end, i + 1);

        return i+1;
    }

    private static void swap(int[] result, int i, int j) {
        int swapTemp = result[i];
        result[i] = result[j];
        result[j] = swapTemp;
    }
}
