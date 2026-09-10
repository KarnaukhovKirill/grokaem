package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    public void test1() {
        var rsl = ValidAnagram.isAnagram("abc", "cba");
        assertTrue(rsl);
    }

    @Test
    public void test4() {
        var rsl = ValidAnagram.isAnagram("racecar", "carrace");
        assertTrue(rsl);
    }

    @Test
    public void test2() {
        var rsl = ValidAnagram.isAnagram("", "");
        assertFalse(rsl);
    }

    @Test
    public void test3() {
        var rsl = ValidAnagram.isAnagram("jar", "jam");
        assertFalse(rsl);
    }
}