package ru.kirill.chapter12;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Stack;

public class ValidPrestn {

    public static boolean isValid(String s) {
        Map<Character, Character> characterMap = Map.of(')', '(', '}', '{', ']', '[');
        ArrayDeque<Character> characters = new ArrayDeque<>();

        char[] chars = s.toCharArray();
        for (Character c : chars) {
            if (characterMap.containsValue(c)) {
                characters.push(c);
            } else {
                Character peek = characters.peek();
                if (characterMap.containsKey(c) && characterMap.get(c) == peek) {
                    characters.pop();
                } else {
                    return false;
                }
            }

        }
        return characters.isEmpty();
    }
}
