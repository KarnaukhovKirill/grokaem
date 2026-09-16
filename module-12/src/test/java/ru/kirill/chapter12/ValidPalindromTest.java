package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromTest {

    @Test
    public void test1() {
        boolean rsl = ValidPalindrom.isPalindrome("Was it a car or a cat I saw?");
        assertTrue(rsl);
    }

    @Test
    public void test2() {
        boolean rsl = ValidPalindrom.isPalindrome("tab a cat");
        assertFalse(rsl);
    }

    @Test
    public void test3() {
        boolean rsl = ValidPalindrom.isPalindrome(".,");
        assertTrue(rsl);
    }

    @Test
    public void test4() {
        boolean rsl = ValidPalindrom.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(rsl);
    }
}
