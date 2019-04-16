package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad Bebida
 * @author Miguel
 *
 */
@Entity
@Table(name = "BEBIDA")
public class Bebida implements Serializable {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "BEBIDA_ID")
	private Long bebidaId;
	
	@Column(name = "BEBIDA_NOMBRE")
	private String bebidaNombre;
	
	@Column(name = "PRECIO")
	private int precio;

	/**
	 * Métodos de acceso y modificadores de atributos
	 * @return
	 */
	
	public Long getBebidaId() {
		return bebidaId;
	}

	public void setBebidaId(Long bebidaId) {
		this.bebidaId = bebidaId;
	}

	public String getBebidaNombre() {
		return bebidaNombre;
	}

	public void setBebidaNombre(String bebidaNombre) {
		this.bebidaNombre = bebidaNombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
