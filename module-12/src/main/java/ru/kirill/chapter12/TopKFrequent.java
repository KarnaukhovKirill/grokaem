package ru.kirill.chapter12;

import java.util.*;

public class TopKFrequent {
    public static int[] process(int[] nums, int k) {
        if (nums.length == 1) return nums;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            int current = nums[i];
            freq.merge(current, 1, Integer::sum);
        }
        // 1 -> 1, 2 -> 2, 3 -> 3
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            Integer currentFreq = entry.getValue();
            if (buckets[currentFreq] == null) {
                buckets[currentFreq] = new ArrayList<>();
            }
            List<Integer> bucket = buckets[currentFreq];
            bucket.add(entry.getKey());
        }

        int idx = 0;
        int[] rsl = new int[k];
        for (int i = buckets.length - 1; i >= 0 && idx < k; i--) {
            if (buckets[i] == null) continue;
            for (int num : buckets[i]) {
                rsl[idx++] = num;
                if (idx == k) break;
            }
        }
        return rsl;
    }
}
