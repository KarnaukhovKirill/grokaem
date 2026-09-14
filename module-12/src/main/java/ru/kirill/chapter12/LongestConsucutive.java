package ru.kirill.chapter12;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsucutive {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> setOfNums = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            setOfNums.add(nums[i]);
        }
        int max = 0;
        for (int j : setOfNums) {

            if (!setOfNums.contains(j-1)) {
                int val = j;
                int curMax = 0;
                while (setOfNums.contains(val)) {
                    val++;
                    curMax++;
                }
                max = Math.max(max, curMax);
            }
        }
        return max;
    }
}
