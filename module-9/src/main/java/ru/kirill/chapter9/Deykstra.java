package ru.kirill.chapter9;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Deykstra {
    public static Integer process(HashMap<String, HashMap<String, Integer>> graph) {
        String start = "start";
        String finish = "finish";

        HashMap<String, Integer> costs = new HashMap<>();
        for (String node : graph.keySet()) {
            costs.put(node, Integer.MAX_VALUE);
        }

        costs.put(start, 0);

        HashMap<String, Boolean> processed = new HashMap<>();

        String node = findLowestCostNode(costs, processed);

        while (node != null) {
            int cost = costs.get(node);
            HashMap<String, Integer> neighbors = graph.get(node);

            for (Map.Entry<String, Integer> entry : neighbors.entrySet()) {
                int newCost = cost + entry.getValue();
                if (newCost < costs.get(entry.getKey())) {
                    costs.put(entry.getKey(), newCost);
                }

            }
            processed.put(node, true);
            node = findLowestCostNode(costs, processed);
        }

        return costs.get(finish);
    }

    private static String findLowestCostNode(HashMap<String, Integer> costs, HashMap<String, Boolean> processed) {
        Integer minimalCost = Integer.MAX_VALUE;
        String result = null;
        ArrayDeque<String> heap = new ArrayDeque<>();
        for (String node : costs.keySet()) {
            heap.add(node);
        }

        while (!heap.isEmpty()) {
            String poll = heap.poll();
            Integer cost = costs.get(poll);
            if (cost < minimalCost && processed.get(poll) == null) {
                minimalCost = cost;
                result = poll;
            }
        }

        return result;
    }
}
