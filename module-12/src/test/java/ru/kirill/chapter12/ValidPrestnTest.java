package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPrestnTest {

    @Test
    public void whenSquarePairThenTrue() {
        assertTrue(ValidPrestn.isValid("[]"));
    }

    @Test
    public void whenNestedAllTypesThenTrue() {
        assertTrue(ValidPrestn.isValid("([{}])"));
    }

    @Test
    public void whenWrongOrderThenFalse() {
        assertFalse(ValidPrestn.isValid("[(])"));
    }

    @Test
    public void whenSequentialPairsThenTrue() {
        assertTrue(ValidPrestn.isValid("()[]{}"));
    }

    @Test
    public void whenMixedNestedAndSequentialThenTrue() {
        assertTrue(ValidPrestn.isValid("{[()]}()[]"));
    }

    @Test
    public void whenDifferentTypePairThenFalse() {
        assertFalse(ValidPrestn.isValid("(]"));
    }

    @Test
    public void whenOnlyOpenBracketThenFalse() {
        assertFalse(ValidPrestn.isValid("("));
    }

    @Test
    public void whenOnlyCloseBracketThenFalse() {
        assertFalse(ValidPrestn.isValid("}"));
    }

    @Test
    public void whenCloseBeforeOpenThenFalse() {
        assertFalse(ValidPrestn.isValid(")("));
    }

    @Test
    public void whenExtraOpenBracketsThenFalse() {
        assertFalse(ValidPrestn.isValid("((()"));
    }

    @Test
    public void whenExtraCloseBracketsThenFalse() {
        assertFalse(ValidPrestn.isValid("())"));
    }

    @Test
    public void whenOddLengthThenFalse() {
        assertFalse(ValidPrestn.isValid("({)"));
    }
}
