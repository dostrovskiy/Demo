package com.example.demo.calculators;

import org.springframework.stereotype.Component;

@Component(value = "first")
public class CalcFirstImpl implements Calcable{
    @Override
    public void calculate() {
        System.out.println("First calculate");
    }
}
