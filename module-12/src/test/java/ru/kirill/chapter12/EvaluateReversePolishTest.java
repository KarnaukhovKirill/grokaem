package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishTest {
    @Test
    public void test1() {
        int rsl = EvaluateReversePolish.eyfvalRPN(new String[]{"1", "2", "+", "3", "*", "4", "-"});
        assertEquals(5, rsl);
    }

    @Test
    public void test2() {
        int rsl = EvaluateReversePolish.eyfvalRPN(new String[]{"4","13","5","/","+"});
        assertEquals(6, rsl);
    }
}
