package com.example.demo.calculators;

public interface Calcable {
    default void calculate(){
        System.out.println("default calculate");
    };
}
