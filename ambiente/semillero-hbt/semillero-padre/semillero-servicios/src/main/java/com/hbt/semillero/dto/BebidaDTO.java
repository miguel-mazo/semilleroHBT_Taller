package com.hbt.semillero.dto;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Bebida
 * @author Miguel
 *
 */
public class BebidaDTO implements Serializable {
	
	//Identificador único de la bebida
	private Long bebidaId;
	
	//Nombre de la bebida
	private String bebidaNombre;
	
	//Precio de la bebida
	private int precio;

	/**
	 * Método que obtiene el valor de la propiedad bebidaId
	 * @return
	 */
	public Long getBebidaId() {
		return bebidaId;
	}

	/**
	 * Método que asigna el valor de la propiedad bebidaId
	 * @param bebidaId
	 */
	public void setBebidaId(Long bebidaId) {
		this.bebidaId = bebidaId;
	}

	/**
	 * Método que obtiene el valor de la propiedad bebidaNombre
	 * @return
	 */
	public String getBebidaNombre() {
		return bebidaNombre;
	}
	
	/**
	 * Método que asigna el valor de la propiedad bebidaNombre
	 * @param bebidaNombre
	 */
	public void setBebidaNombre(String bebidaNombre) {
		this.bebidaNombre = bebidaNombre;
	}

	/**
	 * Método que obtiene el valor de la propiead precio
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
	
}
