package com.hbt.semillero.dto;

import java.io.Serializable;

import com.hbt.semillero.entidades.Cliente;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Factura
 * @author Miguel
 *
 */

public class FacturaDTO implements Serializable {
	
	//Identificador único de la factura
	private Long facturaId;
	
	//Identificador único del cliente
	private ClienteDTO clienteId;

	//iva
	private int iva;
	
	//total
	private int total;

	/**
	 * Método que obtiene el valor de la propiedad facturaId
	 * @return
	 */
	public Long getFacturaId() {
		return facturaId;
	}

	/**
	 * Método que asigna el valor de la propiedad facturaId
	 * @param facturaId
	 */	
	public void setFacturaId(Long facturaId) {
		this.facturaId = facturaId;
	}

	/**
	 * Método que obtiene el valor de la propiedad clienteId
	 * @return
	 */
	public ClienteDTO getClienteId() {
		return clienteId;
	}
	
	/**
	 * Método que asigna el valor de la propiedad clienteId
	 * @param clienteId
	 */
	public void setClienteId(ClienteDTO clienteId) {
		this.clienteId = clienteId;
	}
	
	/**
	 * Método que obtiene el valor de la propiedad iva
	 * @return
	 */
	public int getIva() {
		return iva;
	}

	/**
	 * Método que asigna el valor de la propiedad iva
	 * @param iva
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}

	/**
	 * Método que obtiene el valor de la propiedad total
	 * @return
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Método que asigna el valor de la propiedad total
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}	
}
