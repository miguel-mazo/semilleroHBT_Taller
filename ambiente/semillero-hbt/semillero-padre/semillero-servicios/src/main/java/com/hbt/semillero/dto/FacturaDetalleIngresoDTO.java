package com.hbt.semillero.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FacturaDetalleIngresoDTO implements Serializable{
	
	//Lista de objetos FacturaDetalleDTO
	private List<FacturaDetalleDTO> detalles;
	
	//Identificador único del cliente
	private Long idCliente;
	
	//Fecha del pedido
	private String fechaCompra;
	
	//Indica el tipo de pedido: 1 para consumir en el sitio o 0 para llevar
	private int tipoPedido;
	
	//Indica el tipo de pago: 1 si se paga con efectivo o 0 si se paga con tarjeta
	private int metodoPago;

	/**
	 * Método que obtiene el valor de la propiedad detalles
	 * @return the detalles
	 */
	public List<FacturaDetalleDTO> getDetalles() {
		return detalles;
	}

	/**
	 * Método que asigna el valor de la propiedad detalles
	 * @param detalles the detalles to set
	 */
	public void setDetalles(List<FacturaDetalleDTO> detalles) {
		this.detalles = detalles;
	}

	/**
	 * Método que obtiene el valor de la propiedad idCliente
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}

	/**
	 * Método que asigna el valor de la propiedad idCliente
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * Método que obtiene el valor de la propiedad fechaCompra
	 * @return the fechaCompra
	 */
	public String getFechaCompra() {
		return fechaCompra;
	}

	/**
	 * Método que asigna el valor de la propiedad fechaCompra
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	/**
	 * Método que obtiene el valor de la propiedad tipoPedido
	 * @return the tipoPedido
	 */
	public int getTipoPedido() {
		return tipoPedido;
	}

	/**
	 * Método que asigna el valor de la propiedad tipoPedido
	 * @param tipoPedido the tipoPedido to set
	 */
	public void setTipoPedido(int tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	/**
	 * Método que obtiene el valor de la propiedad metodoPago
	 * @return the metodoPago
	 */
	public int getMetodoPago() {
		return metodoPago;
	}

	/**
	 * Método que obtiene el valor de la propiedad metodoPago
	 * @param metodoPago the metodoPago to set
	 */
	public void setMetodoPago(int metodoPago) {
		this.metodoPago = metodoPago;
	}		

}
