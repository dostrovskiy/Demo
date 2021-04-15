package com.example.demo.calculators;

import org.springframework.stereotype.Component;

@Component
public class SomeOtherVahImpl implements Calcable{
    @Override
    public void calculate() {
        System.out.println("Vah-vah!! calculate!");
    }
}
