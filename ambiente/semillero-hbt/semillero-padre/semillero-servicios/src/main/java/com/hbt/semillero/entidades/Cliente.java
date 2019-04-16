package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad Cliente
 * @author Miguel
 *
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "CLIENTE_ID")
	private Long clienteId;
	
	@Column(name = "CLIENTE_NOMBRE")
	private String clienteNombre;

	/**
	 * Métodos de acceso y modificadores de atributos
	 * @return
	 */
	
	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getClienteNombre() {
		return clienteNombre;
	}

	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}	
	
}
