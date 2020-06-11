package com.Antony.holamundo.holamundo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Antony.holamundo.Model.Persona;


@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model model) {
		Persona person = new Persona();
		person.setNombre("Antony");
		person.setApellido("Fuentes");
		person.setTelefono("7812-9878");
		person.setEmail("Antony@gmail.com");
		
		Persona person2 = new Persona();
		person2.setNombre("Enmanuel");
		person2.setApellido("Villacorta");
		person2.setTelefono("9899-7678");
		person2.setEmail("Antony@gmail.com");
		
		List personas = Arrays.asList(person,person2);
		
		
		String mensaje = "Hola desde el controlador Antony";
		model.addAttribute("saludo",mensaje);
		//model.addAttribute("persona",person); 
		model.addAttribute("personas",personas); 
		
		return "index";
	}
	
}
