package com.studence.studence_data_utils.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

    // Immutable empty list
    private static final List<?> s_emptyList = List.of();

    // Create a new mutable ArrayList from a collection
    public static <V> List<V> newArrayList(Collection<V> collection) {
        return new ArrayList<>(collection);
    }

    // Create a new mutable ArrayList from varargs
    @SafeVarargs
    public static <V> List<V> newArrayList(V... list) {
        return new ArrayList<>(Arrays.asList(list));
    }

    // Create a new empty mutable ArrayList
    public static <V> List<V> newArrayList() {
        return new ArrayList<>();
    }

    // Concatenate two lists using Stream API
    public static <V> List<V> concatenate(List<V> list1, List<V> list2) {
        return Arrays.asList(list1, list2).stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Concatenate two lists using traditional addAll() approach
    public static <V> List<V> concatenateTraditional(List<V> list1, List<V> list2) {
        var combined = new ArrayList<V>(list1.size() + list2.size());
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }

    // Return an immutable empty list (typed)
    @SuppressWarnings("unchecked")
    public static <V> List<V> emptyList() {
        return (List<V>) s_emptyList;
    }

    // Print each element of the list using Stream API with optional prefix
    public static <V> void debugList(List<V> list, String prefix) {
        list.stream()
            .map(element -> prefix + element)
            .forEach(System.out::println);
    }

    // Print list elements with no prefix
    public static <V> void debugList(List<V> list) {
        debugList(list, "");
    }
}
