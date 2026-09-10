package ru.kirill.chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class DeykstraTest {

    @Test
    public void test1() {
        var graph = new HashMap<String, HashMap<String, Integer>>();
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 5);
        graph.get("start").put("b", 2);
        graph.put("a", new HashMap<>());
        graph.put("b", new HashMap<>());
        graph.get("a").put("c", 4);
        graph.get("a").put("d", 2);
        graph.get("b").put("d", 7);
        graph.put("c", new HashMap<>());
        graph.put("d", new HashMap<>());
        graph.get("c").put("finish", 3);
        graph.get("d").put("finish", 1);
        graph.put("finish", new HashMap<>());
        Integer lostCost = Deykstra.process(graph);
        Assertions.assertEquals(8, lostCost);
    }

    @Test
    public void test2() {
        var graph = new HashMap<String, HashMap<String, Integer>>();
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 10);
        graph.put("a", new HashMap<>());
        graph.put("b", new HashMap<>());
        graph.get("a").put("b", 20);
        graph.get("b").put("c", 1);
        graph.put("c", new HashMap<>());
        graph.get("c").put("a", 1);
        graph.get("b").put("finish", 30);
        graph.put("finish", new HashMap<>());
        Integer lostCost = Deykstra.process(graph);
        Assertions.assertEquals(60, lostCost);
    }

    @Test
    public void test3() {
        var graph = new HashMap<String, HashMap<String, Integer>>();
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 2);
        graph.get("start").put("b", 2);
        graph.put("a", new HashMap<>());
        graph.put("b", new HashMap<>());
        graph.get("a").put("finish", 2);
        graph.get("a").put("c", 2);
        graph.get("b").put("a", 2);
        graph.put("c", new HashMap<>());
        graph.get("c").put("b", -1);
        graph.get("c").put("finish", 2);
        graph.put("finish", new HashMap<>());
        Integer lostCost = Deykstra.process(graph);
        Assertions.assertEquals(4, lostCost);
    }
}
