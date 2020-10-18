package com.HelloWorld1960.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Anotacion que indica que se trata de una applicacion SpringBoot*/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/* DipatcherServlet se puede ver ejecutando en la consola cuando ejecutamos SpringBoot.
 * DipatcherServlet es un servlet(clase java que esta programada y que escucha
 * las peticiones y lanza una vista en JSP). 
 * El controller es inyectado en el DispatcherServlet para que mapee la url asignada y esto es gracias a la
 * configuracion de SpringBoot.
 */