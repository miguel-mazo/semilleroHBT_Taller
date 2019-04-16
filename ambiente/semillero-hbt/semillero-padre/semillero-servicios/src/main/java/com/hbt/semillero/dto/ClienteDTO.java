package com.hbt.semillero.dto;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Cliente
 * @author Miguel
 *
 */
public class ClienteDTO implements Serializable {
	
	//Identificador único del cliente
	private Long clienteId;
	
	//Nombre del cliente
	private String clienteNombre;

	/**
	 * Método que obtiene el valor de la propiedad clienteId
	 * @return
	 */
	public Long getClienteId() {
		return clienteId;
	}

	/**
	 * Método que asigna el valor de la propiedad clienteId;
	 * @param clienteId
	 */
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 * Método que obtiene el valor de la propiedad clienteNombre
	 * @return
	 */
	public String getClienteNombre() {
		return clienteNombre;
	}

	/**
	 * Método que asigna el valor de la propiedad clienteNombre
	 * @param clienteNombre
	 */
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}	
	
}
