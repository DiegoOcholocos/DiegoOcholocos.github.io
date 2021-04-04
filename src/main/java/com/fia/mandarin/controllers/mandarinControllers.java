package com.fia.mandarin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mandarinControllers {
	@GetMapping({"/index","/",""})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping({"/plantilla","/ptl"})
	public String plantilla(Model model) {
		return "plantilla";
	}
	
	@GetMapping({"/registrar","/registrarUsuario"})
	public String registrar(Model model) {
		return "registrar";
	}
	
	@GetMapping({"/ingresar","/iniciarsesion"})
	public String ingresar(Model model) {
		return "ingresar";
	}
}
