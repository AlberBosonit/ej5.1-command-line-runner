package com.bosonit.ej5.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	ClaseSecundaria claseSecundaria;

	@Autowired
	TerceraClase terceraClase;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ClaseInicial claseInicial=new ClaseInicial();
		claseInicial.mostrarMensaje1();


	}


	@Override
	public void run(String... args) throws Exception {
		claseSecundaria.mostrarMensaje2();
		terceraClase.mostrarMensaje3(args[0]);
	}
}