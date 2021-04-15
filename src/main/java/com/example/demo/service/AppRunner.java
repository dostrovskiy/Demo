package com.example.demo.service;

import com.example.demo.calculators.Calcable;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {
    private final List<Calcable> list;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("");
        list.forEach(System.out::println);
        System.out.println("");
        list.forEach(Calcable::calculate);
    }
}
