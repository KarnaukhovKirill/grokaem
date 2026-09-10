package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class GroupAnagramTest {

    @Test
    public void test1() {
        var rsl = GroupAnagram.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
        List<List<String>> expect = List.of(List.of("hat"), List.of("act", "act"), List.of("stop", "pots", "tops"));
        assertEquals(expect.size(), rsl.size());
    }

    @Test
    public void test2() {
        var rsl = GroupAnagram.groupAnagrams(new String[]{"x"});
        assertEquals(List.of(List.of("x")), rsl);
    }

    @Test
    public void test3() {
        var rsl = GroupAnagram.groupAnagrams(new String[]{""});
        assertEquals(List.of(List.of("")), rsl);
    }
}
