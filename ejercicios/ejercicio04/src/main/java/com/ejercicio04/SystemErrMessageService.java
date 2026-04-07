package com.ejercicio04;

import org.springframework.stereotype.Component;

@Component
public class SystemErrMessageService implements MessageService {

    @Override
    public void showMessage(String message) {
        System.err.println(message);
    }
}