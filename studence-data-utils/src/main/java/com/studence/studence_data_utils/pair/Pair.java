package com.studence.studence_data_utils.pair;

import java.util.Objects;

public class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }

    @Override
    public boolean equals(Object obj) {
        return switch (obj) {
            case Pair<?, ?> other -> 
                Objects.equals(first, other.first) && Objects.equals(second, other.second);
            default -> false;
        };
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
