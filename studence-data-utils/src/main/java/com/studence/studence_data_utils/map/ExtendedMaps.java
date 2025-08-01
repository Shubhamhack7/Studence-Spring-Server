package com.studence.studence_data_utils.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ExtendedMaps extends Maps {

    // Create a thread-safe concurrent map using standard Java
    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap() {
        return new ConcurrentHashMap<>();
    }
}
