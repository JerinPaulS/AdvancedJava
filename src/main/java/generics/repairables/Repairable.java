package org.example.generics.repairables;

public interface Repairable {

    default void fix() {
        System.out.println("Foxing " + this.getClass().getName());
    }

}
