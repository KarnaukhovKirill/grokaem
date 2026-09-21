package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    @Test
    public void test1() {
        int rsl = TrappingRainWater.trap(new int[]{0,2,0,3,1,0,1,3,2,1});
        assertEquals(9, rsl);
    }

    @Test
    public void whenClassicExampleThenSix() {
        int rsl = TrappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        assertEquals(6, rsl);
    }

    @Test
    public void whenWallsOnEdgesAndValleyInBetween() {
        int rsl = TrappingRainWater.trap(new int[]{4,2,0,3,2,5});
        assertEquals(9, rsl);
    }

    @Test
    public void whenSingleValley() {
        int rsl = TrappingRainWater.trap(new int[]{3,0,3});
        assertEquals(3, rsl);
    }

    @Test
    public void whenWideValley() {
        int rsl = TrappingRainWater.trap(new int[]{5,0,0,0,5});
        assertEquals(15, rsl);
    }

    @Test
    public void whenSymmetricWithSteps() {
        int rsl = TrappingRainWater.trap(new int[]{3,1,2,1,3});
        assertEquals(5, rsl);
    }

    @Test
    public void whenAscendingThenZero() {
        int rsl = TrappingRainWater.trap(new int[]{1,2,3,4});
        assertEquals(0, rsl);
    }

    @Test
    public void whenDescendingThenZero() {
        int rsl = TrappingRainWater.trap(new int[]{4,3,2,1});
        assertEquals(0, rsl);
    }

    @Test
    public void whenAllZeroThenZero() {
        int rsl = TrappingRainWater.trap(new int[]{0,0,0});
        assertEquals(0, rsl);
    }

    @Test
    public void whenAllEqualThenZero() {
        int rsl = TrappingRainWater.trap(new int[]{2,2,2,2});
        assertEquals(0, rsl);
    }

    @Test
    public void whenSingleBarThenZero() {
        int rsl = TrappingRainWater.trap(new int[]{5});
        assertEquals(0, rsl);
    }

    @Test
    public void whenTwoBarsThenZero() {
        int rsl = TrappingRainWater.trap(new int[]{5, 0});
        assertEquals(0, rsl);
    }
}
