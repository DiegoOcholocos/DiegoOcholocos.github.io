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
	
	@GetMapping({"/regi","/registrar","/registrarUsuario"})
	public String registrar(Model model) {
		return "registrar";
	}
	
	@GetMapping({"/login","/ingresar","/iniciarsesion"})
	public String ingresar(Model model) {
		return "ingresar";
	}
	@GetMapping({"/promo","/promociones","/pr0"})
	public String promociones(Model model) {
		return "promociones";
	}
	@GetMapping({"/carrito","/car","/c1"})
	public String listar(Model model) {
		return "listar";
	}
}

