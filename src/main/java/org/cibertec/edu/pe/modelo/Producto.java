package org.cibertec.edu.pe.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	private String Id;
	private String NomProducto;
	private String DescripProducto;
	private Double precio;
	private String UrlImage;
	
	
	//Métodos Constructores
	public Producto() {
		
	}
	
	public Producto(String id, String nomProducto, String descripProducto, Double precio, String urlImage) {
		Id = id;
		NomProducto = nomProducto;
		DescripProducto = descripProducto;
		this.precio = precio;
		UrlImage = urlImage;
	}
	
	//Propiedades de Lectura y Escritura

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNomProducto() {
		return NomProducto;
	}

	public void setNomProducto(String nomProducto) {
		NomProducto = nomProducto;
	}

	public String getDescripProducto() {
		return DescripProducto;
	}

	public void setDescripProducto(String descripProducto) {
		DescripProducto = descripProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getUrlImage() {
		return UrlImage;
	}

	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}
	
	

}
