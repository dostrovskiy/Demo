package com.example.demo.service;

import com.example.demo.calculators.Calcable;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {
    private final Map<String, Calcable> calcList;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("");
        calcList.keySet().forEach(System.out::println);
        System.out.println("");
        calcList.values().forEach(Calcable::calculate);

    }
}
