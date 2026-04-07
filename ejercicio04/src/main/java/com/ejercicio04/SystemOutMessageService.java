package com.ejercicio04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SystemOutMessageService implements MessageService {

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}