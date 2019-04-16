package com.hbt.semillero.servicios.interfaces;

import javax.ejb.Local;

import com.hbt.semillero.dto.FacturaDetalleIngresoDTO;

/**
 * Expone los métodos del EJB ConsultasEJB
 * @author Miguel
 *
 */
@Local
public interface IConsultasEJBLocal {

	/**
	 * Crea una factura
	 * @param facturaDetalle
	 * @return
	 */
	public String crearFactura(FacturaDetalleIngresoDTO facturaDetalle);

	/**
	 * Consulta la factura correspondiente
	 * @param facturaDetalle
	 * @return
	 */	
	public void consultarFactura();

	/**
	 * Eliminar una factura
	 */
	public void eliminarFactura();
	
	

}
