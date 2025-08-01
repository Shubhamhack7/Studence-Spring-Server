package com.studence.studence_data_utils.sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {

    // Create an empty mutable HashSet
    public static <V> Set<V> newHashSet() {
        return new HashSet<>();
    }

    // Create a mutable HashSet from varargs
    @SafeVarargs
    public static <V> Set<V> newHashSet(V... initializers) {
        return new HashSet<>(Arrays.asList(initializers));
    }

    // Create a mutable HashSet from a collection
    public static <V> Set<V> newHashSet(Collection<V> collection) {
        return new HashSet<>(collection);
    }

    // Create an empty mutable TreeSet (sorted)
    public static <V> SortedSet<V> newTreeSet() {
        return new TreeSet<>();
    }

    // Create a mutable TreeSet with a custom comparator
    public static <V> SortedSet<V> newTreeSet(Comparator<? super V> comparator) {
        return new TreeSet<>(comparator);
    }

    // Create an empty mutable LinkedHashSet
    public static <V> LinkedHashSet<V> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    // Debug print the set with optional prefix
    public static <V> void debugSet(Set<V> set, String prefix) {
        set.stream()
           .map(element -> prefix + element)
           .forEach(System.out::println);
    }

    // Debug print the set without prefix
    public static <V> void debugSet(Set<V> set) {
        debugSet(set, "");
    }
}