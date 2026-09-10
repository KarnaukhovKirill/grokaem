package ru.kirill.chapter12;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public static String encode(List<String> str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str) {
            stringBuilder.append(s.length()).append('#').append(s);
        }
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        List<String> rsl = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delIndex = str.indexOf("#", i);
            int lenght = Integer.parseInt(str.substring(i, delIndex));
            int start = delIndex + 1;
            rsl.add(str.substring(start, start + lenght));
            i = start + lenght;
        }
        return rsl;
    }
}
//2#we3#say1#:3#yes10#!@#$%^&*()8#!!!!#fff
