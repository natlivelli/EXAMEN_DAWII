package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Venta")
public class Venta {
	
	@Id
	private String IdVenta;
	private int IdEstado;
	private Double PrecioEnvio;
	private Double SubTotal;
	
	//Métodos Constructores
	public Venta() {
		
	}

	public Venta(String idVenta, int idEstado, Double precioEnvio, Double subTotal) {
		IdVenta = idVenta;
		IdEstado = idEstado;
		PrecioEnvio = precioEnvio;
		SubTotal = subTotal;
	}
	//Propiedades de Lectura y Escritura

	public String getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}

	public int getIdEstado() {
		return IdEstado;
	}

	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}

	public Double getPrecioEnvio() {
		return PrecioEnvio;
	}

	public void setPrecioEnvio(Double precioEnvio) {
		PrecioEnvio = precioEnvio;
	}

	public Double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(Double subTotal) {
		SubTotal = subTotal;
	}

	

}
