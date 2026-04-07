package com.ejercicio05;

import java.util.List;

public interface PersonaService {

    List<Persona> find(int count);

    Persona findOne();

}