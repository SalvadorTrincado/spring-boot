package com.ejercicio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProcesoC implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ejecutando: " + this.getClass().getName());
    }
}
