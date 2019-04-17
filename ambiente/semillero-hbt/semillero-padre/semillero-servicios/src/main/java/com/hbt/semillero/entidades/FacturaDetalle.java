package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidad Factura detalle
 * @author Miguel
 *
 */
@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DETALLE_ID")
	private String detalleId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FACTURA_ID")
	private Factura facturaId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLATO_ID")
	private Plato platoId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BEBIDA_ID")
	private Bebida bebidaId;
	
	@Column(name = "PRECIO_UNITARIO")
	private BigDecimal precioUnitario;
	
	@Column(name = "CANTIDAD")
	private BigDecimal cantidad;

	/**
	 * Métodos de acceso y modificadores de atributos
	 * @return
	 */
	
	public String getDetalleId() {
		return detalleId;
	}

	public void setDetalleId(String detalleId) {
		this.detalleId = detalleId;
	}

	public Factura getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Factura facturaId) {
		this.facturaId = facturaId;
	}

	public Plato getPlatoId() {
		return platoId;
	}

	public void setPlatoId(Plato platoId) {
		this.platoId = platoId;
	}

	public Bebida getBebidaId() {
		return bebidaId;
	}

	public void setBebidaId(Bebida bebidaId) {
		this.bebidaId = bebidaId;
	}
	
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
		
}
