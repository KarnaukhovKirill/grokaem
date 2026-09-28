package ru.kirill.chapter12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] rsl = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();   // индексы ждущих дней
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();  /* снять вершину */;
                rsl[idx] =  i - idx; /* ? */;
            }
            stack.push(i);
        }
        return rsl;
    }
}
