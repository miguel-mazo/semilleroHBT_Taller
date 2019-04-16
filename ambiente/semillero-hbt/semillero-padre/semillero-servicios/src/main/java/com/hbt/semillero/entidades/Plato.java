package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad Plato
 * @author Miguel
 *
 */

@Entity
@Table(name = "PLATO")
public class Plato implements Serializable {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "PLATO_ID")
	private Long platoId;
	
	@Column(name = "PLATO_NOMBRE")
	private String platoNombre;
	
	@Column(name = "PRECIO")
	private int precio;
	
	@Column(name = "PLATO_DESCRIPCION")
	private String platoDescripcion;

	/**
	 * Métodos de acceso y modificadores de atributos
	 * @return
	 */
	
	public Long getPlatoId() {
		return platoId;
	}

	public void setPlatoId(Long platoId) {
		this.platoId = platoId;
	}

	public String getPlatoNombre() {
		return platoNombre;
	}

	public void setPlatoNombre(String platoNombre) {
		this.platoNombre = platoNombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getPlatoDescripcion() {
		return platoDescripcion;
	}

	public void setPlatoDescripcion(String platoDescripcion) {
		this.platoDescripcion = platoDescripcion;
	}		

}
