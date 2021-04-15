package com.example.demo.service;

import com.example.demo.calculators.Calcable;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {
    private final Map<String, Calcable> calcKeeper;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("");
        calcKeeper.keySet().forEach(System.out::println);
        System.out.println("");
        calcKeeper.values().forEach(Calcable::calculate);
    }
}
