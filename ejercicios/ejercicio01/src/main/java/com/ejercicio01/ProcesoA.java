package com.ejercicio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoA implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception{
        System.out.println("Ejecutando: " + this.getClass().getName());
    }
}
