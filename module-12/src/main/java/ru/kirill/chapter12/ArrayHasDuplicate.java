package ru.kirill.chapter12;

import java.util.*;

public class ArrayHasDuplicate {
    public static boolean hasDuplicate(int[] ints) {
        var hashMap = new HashSet<>();
        for (int i = 0; i < ints.length; i++) {
            var chislo = ints[i];
            if (hashMap.contains(chislo)) {
                return true;
            }
            hashMap.add(chislo);
        }
        return false;
    }
}
