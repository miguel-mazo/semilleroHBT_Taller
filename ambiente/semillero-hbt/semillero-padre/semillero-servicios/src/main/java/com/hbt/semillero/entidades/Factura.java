package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
	
	@Column(name = "FECHA_PEDIDO")
	private Date fechaPedido;
	
	@Column(name = "TIPO_PEDIDO")
	private int tipoPedido;
	
	@Column(name = "METODO_PAGO")
	private int metodoPago;
			
	/**
	 * Métodos de acceso y modificadores de atributos
	 * @return
	 */
	
	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getTipoPedido() {
		return tipoPedido;
	}

	public void setTipoPedido(int tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	public int getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(int metodoPago) {
		this.metodoPago = metodoPago;
	}

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

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	
	public BigDecimal getTotal() {
		return total;
	}
	
	public void setTotal(BigDecimal total) {
		this.total = total;
	}


}
