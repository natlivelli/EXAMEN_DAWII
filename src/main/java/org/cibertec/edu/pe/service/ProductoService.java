package org.cibertec.edu.pe.service;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Listar() {
		return (List<Producto>)data.findAll();
		
	}
	


}
