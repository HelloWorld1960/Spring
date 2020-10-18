package com.HelloWorld1960.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*@Controller: Anotacion que indica que se trata de un controlador de SpringBoot
 *@RequestMapping: EndPoint */
@Controller
@RequestMapping("/hola")
public class ControllerBasic {
	
	/* Sub-ruta que retorna la vista*/
	/* @GetMapping: Es un metodo que mapea en el enrutamiento dentro del EndPoint(@RequestMapping("/hola"))*/
	@GetMapping(path = {"/saludar", "/holamundo"})
	public String saludar() {
		return "index";
	}
}
