package com.cibertec.semana1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Esta anotacion engloba otras anotaciones (3)
public class Semana1Application {

	public static void main(String[] args) { //Nivel de acceso - Metodo o valor es independiente a su instancia - Sin retorno
		SpringApplication.run(Semana1Application.class, args);
	}

}
