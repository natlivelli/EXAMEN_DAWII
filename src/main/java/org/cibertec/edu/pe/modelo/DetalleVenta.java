package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DetalleVenta")
public class DetalleVenta {
	
	@Id
	private String IdDetalleVenta;
	private String IdVenta;
	private String IdProducto;
	private Double descuento;
	private int cantidadProducto;
	
	//Métodos Constructores
	public DetalleVenta() {
		
	}

	public DetalleVenta(String idDetalleVenta, String idVenta, String idProducto, Double descuento,
			int cantidadProducto) {
		IdDetalleVenta = idDetalleVenta;
		IdVenta = idVenta;
		IdProducto = idProducto;
		this.descuento = descuento;
		this.cantidadProducto = cantidadProducto;
	}
	
	//Propiedades de Lectura y Escritura

	public String getIdDetalleVenta() {
		return IdDetalleVenta;
	}

	public void setIdDetalleVenta(String idDetalleVenta) {
		IdDetalleVenta = idDetalleVenta;
	}

	public String getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}

	public String getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	

}
