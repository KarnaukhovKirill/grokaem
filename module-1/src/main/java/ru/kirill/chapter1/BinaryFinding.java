package ru.kirill.chapter1;

import java.util.ArrayList;
import java.util.List;

public class BinaryFinding<T extends Comparable<T>> {

    public int process(List<T> list, T target) {
        List<T> sorted = list.stream().sorted().toList();
        int startIndex = 0;
        int endIndex = sorted.size() - 1;

        while (startIndex <= endIndex) {
            int currentIndex = (startIndex + endIndex) / 2;
            T current = sorted.get(currentIndex);
            int cmp = current.compareTo(target);

            if (cmp == 0) {
                return currentIndex;
            } else if (cmp < 0) {
                startIndex = currentIndex + 1;
            } else {
                endIndex = currentIndex - 1;
            }
        }
        return -1;
    }

    public int processRecursive(List<T> list, T target) {
        List<T> sorted = list.stream().sorted().toList();
        return processRecursive(sorted, target, 0, sorted.size() - 1);
    }

    private int processRecursive(List<T> sorted, T target, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
        }

        int currentIndex = (startIndex + endIndex) / 2;
        T current = sorted.get(currentIndex);
        int cmp = current.compareTo(target);

        if (cmp == 0) {
            return currentIndex;
        } else if (cmp < 0) {
            return processRecursive(sorted, target, currentIndex + 1, endIndex);
        } else {
            return processRecursive(sorted, target, startIndex, currentIndex - 1);
        }
    }
}
