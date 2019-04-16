package com.hbt.semillero.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FacturaDetalleIngresoDTO implements Serializable{
	
	private List<FacturaDetalleDTO> detalles;
	
	private Long idCliente;
	
	//Fecha del pedido
	private Date fechaCompra;
	
	//Indica el tipo de pedido: 1 para consumir en el sitio o 0 para llevar
	private boolean tipoPedido;
	
	//Indica el tipo de pago: 1 si se paga con efectivo o 0 si se paga con tarjeta
	private boolean metodoPago;
	
	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the metodoPago
	 */
	public boolean isMetodoPago() {
		return metodoPago;
	}

	/**
	 * Método encargado de asignar el valor de un atributo
	 * @param metodoPago the metodoPago to set
	 */
	public void setMetodoPago(boolean metodoPago) {
		this.metodoPago = metodoPago;
	}

	public List<FacturaDetalleDTO> getDetalles() {
		return detalles;
	}

	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the fechaCompra
	 */
	public Date getFechaCompra() {
		return fechaCompra;
	}

	/**
	 * Método encargado de asignar el valor del atributo
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	/**
	 * Método encargado de obtener el valor de un atributo
	 * @return the tipoPedido
	 */
	public boolean isTipoPedido() {
		return tipoPedido;
	}

	/**
	 * Método encargado de asignar el valor del atributo
	 * @param indicadorCompraSitio the tipoPedido to set
	 */
	public void setIndicadorCompraSitio(boolean tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	/**   Método encargado de asignar el valor del atributo
	 * @param detalles the detalles to set
	 */
	public void setDetalles(List<FacturaDetalleDTO> detalles) {
		this.detalles = detalles;
	}

	
	

}
