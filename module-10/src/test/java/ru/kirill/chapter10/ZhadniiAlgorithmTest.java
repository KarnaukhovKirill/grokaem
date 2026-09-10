package ru.kirill.chapter10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

public class ZhadniiAlgorithmTest {

    @Test
    public void test1() {
        Set<String> setNeeded = Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az");
        Map<String, Set<String>> stations = Map.of("kone", Set.of("id", "nv", "ut"),
                "ktwo", Set.of("wa", "id", "mt"),
                "kthree", Set.of("or", "nv", "ca"),
                "kfour", Set.of("nv", "ut"),
                "kfive", Set.of("ca", "az"));
        Set<String> finalStations = ZhadniiAlgorithm.process(setNeeded, stations);
        Assertions.assertEquals(4, finalStations.size());
    }

    @Test
    public void test2() {
        Set<String> setNeeded = Set.of("mt");
        Map<String, Set<String>> stations = Map.of("kone", Set.of("id", "nv", "ut"),
                "ktwo", Set.of("wa", "id", "mt"),
                "kthree", Set.of("or", "nv", "ca"),
                "kfour", Set.of("nv", "ut"),
                "kfive", Set.of("ca", "az"));
        Set<String> finalStations = ZhadniiAlgorithm.process(setNeeded, stations);
        Assertions.assertEquals(1, finalStations.size());
    }

    @Test
    public void test3() {
        Set<String> setNeeded = Set.of("zzzzz");
        Map<String, Set<String>> stations = Map.of("kone", Set.of("id", "nv", "ut"),
                "ktwo", Set.of("wa", "id", "mt"),
                "kthree", Set.of("or", "nv", "ca"),
                "kfour", Set.of("nv", "ut"),
                "kfive", Set.of("ca", "az"));
        Set<String> finalStations = ZhadniiAlgorithm.process(setNeeded, stations);
        Assertions.assertEquals(0, finalStations.size());
    }

    @Test
    public void test4() {
        Set<String> setNeeded = Set.of("zzzzz");
        Map<String, Set<String>> stations = Map.of("kone", Set.of("id", "nv", "ut"),
                "ktwo", Set.of("wa", "id", "mt"),
                "kthree", Set.of("or", "nv", "ca"),
                "kfour", Set.of("nv", "ut"),
                "kfive", Set.of("ca", "zzzzz"));
        Set<String> finalStations = ZhadniiAlgorithm.process(setNeeded, stations);
        Assertions.assertEquals(1, finalStations.size());
        Assertions.assertTrue(finalStations.contains("kfive"));
    }
}
