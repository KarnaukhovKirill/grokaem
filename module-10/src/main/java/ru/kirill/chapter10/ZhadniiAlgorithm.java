package ru.kirill.chapter10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ZhadniiAlgorithm {
    public static Set<String> process(Set<String> setNeeded, Map<String, Set<String>> stations) {
        if (setNeeded.isEmpty() || stations.isEmpty()) return Set.of();
        Set<String> finalStations = new HashSet<>();

        HashSet<String> copySetNeeded = new HashSet<>(setNeeded);
        HashMap<String, Set<String>> copyStations = new HashMap<>(stations);

        while (!copySetNeeded.isEmpty() && !copyStations.isEmpty()) {
            String value = getValueWithMaxCount(copySetNeeded, copyStations);
            if (value == null) {
                break;
            }
            Set<String> strings = copyStations.get(value);
            copySetNeeded.removeAll(strings);
            copyStations.remove(value);
            finalStations.add(value);
        }
        return finalStations;
    }

    private static String getValueWithMaxCount(Set<String> setNeeded, Map<String, Set<String>> stations) {
        Set<Map.Entry<String, Set<String>>> entries = stations.entrySet();
        String value = null;
        long maxCount = 0;
        for (Map.Entry<String, Set<String>> set : entries) {
            long count = set.getValue().stream().filter(setNeeded::contains).count();
            if (count > maxCount) {
                maxCount = count;
                value = set.getKey();
            }
        }
        return value;
    }
}
