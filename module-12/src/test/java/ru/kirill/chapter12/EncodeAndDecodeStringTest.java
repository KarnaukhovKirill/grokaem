package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EncodeAndDecodeStringTest {

    @Test
    public void test1() {
        List<String> listToEncode = List.of("Hello", "World");
        String encodeStr = EncodeAndDecodeString.encode(listToEncode);

        List<String> rsl = EncodeAndDecodeString.decode(encodeStr);
        assertListEquals(listToEncode, rsl);
    }

    @Test
    public void test2() {
        List<String> listToEncode = List.of("");
        String encodeStr = EncodeAndDecodeString.encode(listToEncode);

        List<String> rsl = EncodeAndDecodeString.decode(encodeStr);
        assertListEquals(listToEncode, rsl);
    }

    @Test
    public void test3() {
        List<String> listToEncode = List.of("", "");
        String encodeStr = EncodeAndDecodeString.encode(listToEncode);

        List<String> rsl = EncodeAndDecodeString.decode(encodeStr);
        assertListEquals(listToEncode, rsl);
    }

    @Test
    public void test4() {
        List<String> listToEncode = List.of("we", "say", ":", "yes", "!@#$%^&*()", "!!!!#fff");
        String encodeStr = EncodeAndDecodeString.encode(listToEncode);

        List<String> rsl = EncodeAndDecodeString.decode(encodeStr);
        assertListEquals(listToEncode, rsl);
    }

    private void assertListEquals(List<String> listToEncode, List<String> rsl) {
        for (String s : listToEncode) {
            assertTrue(rsl.contains(s));
        }
    }
}
