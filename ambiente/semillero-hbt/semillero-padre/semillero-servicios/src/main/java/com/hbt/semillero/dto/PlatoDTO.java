package com.hbt.semillero.dto;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Plato
 * @author Miguel
 *
 */
public class PlatoDTO implements Serializable {

	//Identificador único del plato
	private Long platoId;
	
	//Nombre del plato
	private String platoNombre;
	
	//Precio del plato
	private int precio;
	
	//Descripción del plato
	private String platoDescripcion;

	/**
	 * Método que obtiene el valor de la propiedad platoId
	 * @return
	 */
	public Long getPlatoId() {
		return platoId;
	}

	/**
	 * Método que asigna el valor de la propiedad platoId
	 * @param platoId
	 */
	public void setPlatoId(Long platoId) {
		this.platoId = platoId;
	}

	/**
	 * Método que obtiene el valor de la propiedad platoNombre
	 * @return
	 */
	public String getPlatoNombre() {
		return platoNombre;
	}

	/**
	 * Método que asigna el valor de la propiedad platoNombre
	 * @param platoNombre
	 */
	public void setPlatoNombre(String platoNombre) {
		this.platoNombre = platoNombre;
	}

	/**
	 * Método que obtiene el valor de la propiedad precio
	 * @return
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Método que asigna el valor de la propiedad precio
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Método que obtiene el valor de la propiedad platoDescripcion
	 * @return
	 */
	public String getPlatoDescripcion() {
		return platoDescripcion;
	}

	/**
	 * Método que asigna el valor de la propiedad platoDescripcion
	 * @param platoDescripcion
	 */
	public void setPlatoDescripcion(String platoDescripcion) {
		this.platoDescripcion = platoDescripcion;
	}		
}
