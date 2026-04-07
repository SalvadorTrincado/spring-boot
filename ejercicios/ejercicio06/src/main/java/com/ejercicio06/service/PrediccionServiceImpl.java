package com.ejercicio06.service;

import com.ejercicio06.PrediccionDia;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrediccionServiceImpl implements PrediccionService {

    private final Faker faker;

    public PrediccionServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public List<PrediccionDia> findAll() {
        List<PrediccionDia> prediccion = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            prediccion.add(new PrediccionDia(
                    LocalDate.now().plusDays(i),
                    faker.number().numberBetween(0, 100),
                    faker.number().numberBetween(0, 10),
                    faker.number().numberBetween(10, 20),
                    faker.number().numberBetween(0, 5)
            ));
        }
        return prediccion;
    }
}