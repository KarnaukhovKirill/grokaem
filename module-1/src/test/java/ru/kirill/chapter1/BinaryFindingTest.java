package ru.kirill.chapter1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryFindingTest {

    @Test
    public void testBinaryFinding() {
        BinaryFinding<Integer> binaryFinding = new BinaryFinding<>();
        Integer findingInt = 2;
        var result = binaryFinding.process(List.of(1, 2, 3), findingInt);
        assertEquals(1, result);
    }

    @Test
    public void testBinaryFindingWithEmptyList() {
        BinaryFinding<Integer> binaryFinding = new BinaryFinding<>();
        Integer findingInt = 0;
        var result = binaryFinding.process(List.of(findingInt), findingInt);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryFindingWithOneElement() {
        BinaryFinding<Integer> binaryFinding = new BinaryFinding<>();
        Integer findingInt = 1;
        var result = binaryFinding.process(List.of(), findingInt);
        assertEquals(-1, result);
    }

    @Test
    public void testBinaryFindingWithMultipleElements() {
        BinaryFinding<String> binaryFinding = new BinaryFinding<>();
        String findingInt = "1";
        var result = binaryFinding.process(List.of("1", "2", "3"), findingInt);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryFindingWithMultipleElementsWithEmptyList() {
        BinaryFinding<String> binaryFinding = new BinaryFinding<>();
        String findingInt = "";
        assertThrows(NullPointerException.class, () -> binaryFinding.process(null, findingInt));
    }

    @Test
    public void testBinaryFindingRecursive() {
        BinaryFinding<Integer> binaryFinding = new BinaryFinding<>();
        Integer findingInt = 2;
        var result = binaryFinding.processRecursive(List.of(1, 2, 3), findingInt);
        assertEquals(1, result);
    }

    @Test
    public void testBinaryFindingWithEmptyListRecursive() {
        BinaryFinding<Integer> binaryFinding = new BinaryFinding<>();
        Integer findingInt = 0;
        var result = binaryFinding.processRecursive(List.of(findingInt), findingInt);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryFindingWithOneElementRecursive() {
        BinaryFinding<Integer> binaryFinding = new BinaryFinding<>();
        Integer findingInt = 1;
        var result = binaryFinding.processRecursive(List.of(), findingInt);
        assertEquals(-1, result);
    }

    @Test
    public void testBinaryFindingWithMultipleElementsRecursive() {
        BinaryFinding<String> binaryFinding = new BinaryFinding<>();
        String findingInt = "1";
        var result = binaryFinding.processRecursive(List.of("1", "2", "3"), findingInt);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryFindingWithMultipleElementsRecursive2() {
        BinaryFinding<String> binaryFinding = new BinaryFinding<>();
        String findingInt = "1";
        var result = binaryFinding.processRecursive(List.of("3", "2", "1"), findingInt);
        assertEquals(0, result);
    }

    @Test
    public void testBinaryFindingWithMultipleElementsWithEmptyListRecursive() {
        BinaryFinding<String> binaryFinding = new BinaryFinding<>();
        String findingInt = "";
        assertThrows(NullPointerException.class, () -> binaryFinding.processRecursive(null, findingInt));
    }
}
