package com.example.demo.config;


import com.example.demo.calculators.Calcable;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CalcConfig {
    private final List<Calcable> list;

    @Bean
    public Map<String, Calcable> calcKeeper(){
       return list.stream().collect(Collectors.toMap(Calcable::toString, calc -> calc));
    }

}
