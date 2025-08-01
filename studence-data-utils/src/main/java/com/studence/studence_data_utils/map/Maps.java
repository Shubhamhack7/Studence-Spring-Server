package com.studence.studence_data_utils.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    // Creates a new empty HashMap
    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<>();
    }

    // Creates a new empty LinkedHashMap
    public static <K, V> Map<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    // Returns a simple debug list using Stream API
    public static <K, V> List<String> getSimpleFormatForDebugging(Map<K, V> map) {
        return map.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.toList());
    }
}

