package com.bosonit.ej5.commandlinerunner;

import javax.annotation.PostConstruct;

public class ClaseInicial {

    @PostConstruct
    public void mostrarMensaje1() {
        System.out.println("Hola desde la clase inicial.");
    }
}
