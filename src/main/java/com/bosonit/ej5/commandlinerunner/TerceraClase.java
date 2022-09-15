package com.bosonit.ej5.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TerceraClase {

    public void mostrarMensaje3(String message){
        System.out.println(message);
    }
}