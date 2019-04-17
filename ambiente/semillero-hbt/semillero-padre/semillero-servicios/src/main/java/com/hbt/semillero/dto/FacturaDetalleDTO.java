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
	private Long facturaId;
	
	//Identificador único del plato
	private Long platoId;
	
	//Identificador único de la bebida	
	private Long bebidaId;
	
	//Precio unitario
	private BigDecimal precioUnitario;
	
	//Cantidad
	private BigDecimal cantidad;
		
	/**
	 * Método que obtiene el valor de la propiedad cantidad
	 * @return the cantidad
	 */
	public BigDecimal getCantidad() {
		return cantidad;
	}

	/**Método que asigna el valor de la propiedad cantidad
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

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
	 * Método que obtiene el valor de la propiedad precioUnitario
	 * @return the precioUnitario
	 */
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * Método que asigna el valor de la propiedad precioUnitario
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

		
}
