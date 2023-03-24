package com.generation.cohorte23.ioc.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {	
	@RequestMapping("/hola") //aqui en /hola se guarda la clase
 public String hola() {
	 return "Hola mundo desde Spring Boot";
 }
}
