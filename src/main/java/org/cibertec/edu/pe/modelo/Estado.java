package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estado")
public class Estado {
	
	@Id
	private int IdEstado;
	private String DescripEstado;
	
	//Métodos Constructores
	
	public Estado() {
		
	}

	public Estado(int idEstado, String descripEstado) {
		IdEstado = idEstado;
		DescripEstado = descripEstado;
	}
	
	//Propiedades de Lectura y Escritura

	public int getIdEstado() {
		return IdEstado;
	}

	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}

	public String getDescripEstado() {
		return DescripEstado;
	}

	public void setDescripEstado(String descripEstado) {
		DescripEstado = descripEstado;
	}
			

}
