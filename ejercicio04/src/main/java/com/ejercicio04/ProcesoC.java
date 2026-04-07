package com.ejercicio04;

import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoC implements CommandLineRunner {

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoC(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getName());
        messageService.showMessage(faker.gameOfThrones().quote());
    }
}