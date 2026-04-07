package com.ejercicio06.service;

import com.ejercicio06.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> find(int count);

    Persona findOne();

}