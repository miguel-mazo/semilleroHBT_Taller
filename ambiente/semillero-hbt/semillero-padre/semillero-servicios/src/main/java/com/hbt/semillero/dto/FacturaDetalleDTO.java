package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.Plato;
/**
 * Objeto de transferencia que mapea los atributos de la entidad FacturaDetalle
 * @author Miguel
 *
 */
public class FacturaDetalleDTO implements Serializable {
	
	//Identificador único de la factura detalle
	private String detalleId;
	
	//Identificador único de la factura
	private Factura facturaId;
	
	//Identificador único del plato
	private Plato platoId;
	
	//Identificador único de la bebida	
	private Bebida bebidaId;
	
	//Precio unitario
	private BigDecimal precioUnitario;

	/**
	 * Método que obtiene el valor de la propiedad detalleId
	 * @return
	 */
	public String getDetalleId() {
		return detalleId;
	}

	/**
	 * Método que asigna el valor de la propiedad detalleId
	 * @param detalleId
	 */
	public void setDetalleId(String detalleId) {
		this.detalleId = detalleId;
	}

	/**
	 * Método que obtiene el valor de la propiedad facturaId
	 * @return
	 */
	public Factura getFacturaId() {
		return facturaId;
	}

	/**
	 * Método que asigna el valor de la propiedad facturaId
	 * @param facturaId
	 */
	public void setFacturaId(Factura facturaId) {
		this.facturaId = facturaId;
	}

	/**
	 * Método que obtiene el valor de la propiedad platoId
	 * @return
	 */
	public Plato getPlatoId() {
		return platoId;
	}

	/**
	 * Método que asigna el valor de la propiedad platoId
	 * @param platoId
	 */
	public void setPlatoId(Plato platoId) {
		this.platoId = platoId;
	}
	
	/**
	 * Método que obtiene el valor de la propiedad bebidaId
	 * @return
	 */
	public Bebida getBebidaId() {
		return bebidaId;
	}

	/**
	 * Método que asigna el valor de la propiedad bebidaId
	 * @param bebidaId
	 */
	public void setBebidaId(Bebida bebidaId) {
		this.bebidaId = bebidaId;
	}

	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the precioUnitario
	 */
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

		
}
