package ru.kirill.chapter12;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MinStack {
    LinkedList<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.addFirst(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        stack.removeFirst();
        minStack.removeFirst();
    }

    public int top() {
        if (stack.isEmpty()) return 0;
        return stack.getFirst();
    }

    public int getMin() {
        if (minStack.isEmpty()) return Integer.MIN_VALUE;
        return minStack.peek();
    }
}
