package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DailyTemperaturesTest {
    @Test
    public void test1() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{30, 38, 30, 36, 35, 40, 28});
        assertArrayEquals(new int[]{1, 4, 1, 2, 1, 0, 0}, rsl);
    }

    @Test
    public void test2() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{22, 21, 20});
        assertArrayEquals(new int[]{0, 0, 0}, rsl);
    }

    @Test
    public void whenSingleDay() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{50});
        assertArrayEquals(new int[]{0}, rsl);
    }

    @Test
    public void whenStrictlyIncreasing() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60});
        assertArrayEquals(new int[]{1, 1, 1, 0}, rsl);
    }

    @Test
    public void whenEqualTemperaturesThenNotWarmer() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{30, 30, 30});
        assertArrayEquals(new int[]{0, 0, 0}, rsl);
    }

    @Test
    public void whenEqualTemperaturesThenWaitForStrictlyWarmer() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{30, 30, 31});
        assertArrayEquals(new int[]{2, 1, 0}, rsl);
    }

    @Test
    public void whenDecreasingThenOneWarmDay() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{50, 40, 30, 20, 60});
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, rsl);
    }

    @Test
    public void whenMixed() {
        int[] rsl = DailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, rsl);
    }
}
