package com.ejercicio05;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final Faker faker;

    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            personas.add(findOne());
        }
        return personas;
    }

    @Override
    public Persona findOne() {
        return new Persona(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.idNumber().valid(),
                faker.timeAndDate().birthday(18, 80)
        );
    }
}