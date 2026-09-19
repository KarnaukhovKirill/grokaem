package ru.kirill.chapter12;

public class MaxArea {
    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int rsl = 0;
        while (left < right) {
            rsl = Math.max(rsl, Math.min(heights[left], heights[right]) * (right - left));
            if (heights[left] < heights[right]) {
                left++;
                rsl = Math.max(rsl, Math.min(heights[left], heights[right]) * (right - left));
            } else {
                right--;
                rsl = Math.max(rsl, Math.min(heights[left], heights[right]) * (right - left));
            }
        }
        return rsl;
    }
}
