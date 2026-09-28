package ru.kirill.chapter12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class EvaluateReversePolish {

    private static final Map<String, IntBinaryOperator> OPERATORS = Map.of(
            "+", Integer::sum,
            "-", (left, right) -> left - right,
            "*", (left, right) -> left * right,
            "/", (left, right) -> left / right
    );

    public static int eyfvalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            IntBinaryOperator operator = OPERATORS.get(token);
            if (operator == null) {
                stack.push(Integer.parseInt(token));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(operator.applyAsInt(left, right));
            }
        }
        return stack.pop();
    }
}
