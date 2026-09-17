package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    @Test
    public void test1() {
        List<List<Integer>> rsl = ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
        assertEquals(List.of(List.of(-1,-1,2), List.of(-1, 0, 1)), rsl);
    }

    @Test
    public void noTripletSumsToZero_doesNotReuseSameElementTwice() {
        // Only one -1 in the array; no valid triplet sums to zero here.
        List<List<Integer>> rsl = ThreeSum.threeSum(new int[]{-5, -1, 2, 100});
        assertEquals(List.of(), rsl);
    }

    @Test
    public void allZeros() {
        List<List<Integer>> rsl = ThreeSum.threeSum(new int[]{0, 0, 0, 0});
        assertEquals(List.of(List.of(0, 0, 0)), rsl);
    }
}
