package com.studence.studence_data_utils.sets;

import java.util.Set;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class ExtendedSets {

    // Create a thread-safe concurrent Set using standard Java
    public static <V> Set<V> newConcurrentSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap<>());
    }

    // Debug print for concurrent set
    public static <V> void debugConcurrentSet(Set<V> set, String prefix) {
        set.stream()
           .map(element -> prefix + element)
           .forEach(System.out::println);
    }

    public static <V> void debugConcurrentSet(Set<V> set) {
        debugConcurrentSet(set, "");
    }
}
