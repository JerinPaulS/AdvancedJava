package org.example.generics;

import static org.example.generics.Pair.swap;

public class PairDemo {

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(3, 4);
        System.out.println(pair);
        pair = pair.swap();
        System.out.println(pair);

        Pair<Integer> pair1 = new Pair<>(5, 12);
        System.out.println(pair1);
        swap(pair1);
        System.out.println(pair1);

        /** Full syntax */
        Pair.<Integer>swap(pair1);
        System.out.println(pair1);

    }

}
