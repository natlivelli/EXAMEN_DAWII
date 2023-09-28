package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoService servicio;
	
	// Método para Listar
	@GetMapping("/listar")	// http://localhost:8080/listar
	public String Listado(Model m) {
		List<Producto> lista = servicio.Listar();
		m.addAttribute("producto", lista);
		return "index";	// index.html
		}
	
	
	
	
	
	

}
