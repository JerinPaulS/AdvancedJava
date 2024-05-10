package org.example.generics;

import java.text.MessageFormat;

public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public Pair<T> swap() {
        return new Pair<>(second, first);
    }

    /** Generic method */
    /** Modified the input variable (Mutable) */
    public static <T> void swap(Pair<T> pair) {
        T temp = pair.first;
        pair.first = pair.second;
        pair.second = temp;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Pair'{'first={0}, second={1}'}'", first, second);
    }
}
