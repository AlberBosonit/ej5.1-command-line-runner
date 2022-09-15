package com.bosonit.ej5.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClaseSecundaria {

    public void mostrarMensaje2(){
        System.out.println("Hola desde la clase secundaria");
    }
}
