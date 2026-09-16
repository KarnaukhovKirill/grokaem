package ru.kirill.chapter12;

public class ValidPalindrom {
    public static boolean isPalindrome(String s) {

        char[] chars = s.toCharArray();
        int last = chars.length - 1;
        int start = 0;


        while (start < last) {
            while (start < last && !Character.isLetterOrDigit(chars[start])) {
                start++;
            }
            while (last > start && !Character.isLetterOrDigit(chars[last])) {
                last--;
            }
            if (start < last && Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[last])) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
