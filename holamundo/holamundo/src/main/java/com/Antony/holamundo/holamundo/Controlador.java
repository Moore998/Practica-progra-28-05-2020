package com.Antony.holamundo.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model model) {
		String mensaje = "Hola desde el controlador";
		model.addAttribute("saludo",mensaje);
		
		
		return "index";
	}
	
}
