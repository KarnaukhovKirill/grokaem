package ru.kirill.chapter12;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int rsl = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                rsl += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                rsl += rightMax - height[right];
                right--;
            }
        }
        return rsl;
    }
}
