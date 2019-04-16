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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entidad Factura
 * @author Miguel
 *
 */

@Entity
@Table(name = "FACTURA")
@SequenceGenerator(name = "SEQ", sequenceName = "SEQ_COMUN", initialValue = 0, allocationSize = 1)
public class Factura implements Serializable {
		
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "FACTURA_ID")
	private Long facturaId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente clienteId;
	
	@Column(name = "IVA")
	private BigDecimal iva;
	
	@Column(name = "TOTAL")
	private BigDecimal total;

	/**
	 * Métodos de acceso y modificadores de atributos
	 * @return
	 */
	
	public Long getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Long facturaId) {
		this.facturaId = facturaId;
	}

	public Cliente getClienteId() {
		return clienteId;
	}

	public void setClienteId(Cliente clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the iva
	 */
	public BigDecimal getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}


}
