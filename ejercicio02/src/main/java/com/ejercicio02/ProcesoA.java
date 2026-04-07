package com.ejercicio02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoA implements CommandLineRunner{

    private final MessageService messageService;

    public ProcesoA(
            @Qualifier("systemErrMessageService")MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception{
        messageService.showMessage(this.getClass().getName());
    }
}