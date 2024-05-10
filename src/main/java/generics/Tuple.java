package org.example.generics;

import java.text.MessageFormat;

public class Tuple<T, U> {

    /** Type parameters */
    private T first;
    private U second;

    public Tuple(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Tuple'{'first={0}, second={1}'}'", first, second);
    }
}
