package ru.kirill.chapter12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

public class ValidAnagram {
//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        if (s.length() <= 0 || t.length() <= 0) return false;
//        String[] split1 = s.split("");
//        String[] split2 = t.split("");
//        HashMap<String, Integer> firstHashMap = new HashMap<>();
//        HashMap<String, Integer> secondHashMap = new HashMap<>();
//        for (int i = 0 ; i <= s.length() - 1; i++) {
//            firstHashMap.merge(split1[i], 1, Integer::sum);
//        }
//        for (int i = 0 ; i <= t.length() - 1; i++) {
//            secondHashMap.merge(split2[i], 1, Integer::sum);
//        }
//        return firstHashMap.equals(secondHashMap);
//    }

    public static boolean isAnagram(String s, String t) {
                if (s.length() != t.length()) return false;
        if (s.length() <= 0 || t.length() <= 0) return false;
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if (Arrays.equals(first, second)) {
            return true;
        }
        return false;
    }
}
