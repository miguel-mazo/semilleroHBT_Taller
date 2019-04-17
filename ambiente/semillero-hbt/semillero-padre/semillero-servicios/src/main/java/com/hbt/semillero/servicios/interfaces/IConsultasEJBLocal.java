package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.FacturaDetalleIngresoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.entidades.Plato;

/**
 * Expone los métodos del EJB ConsultasEJB
 * @author Miguel
 *
 */
@Local
public interface IConsultasEJBLocal {

	/**
	 * Crea una factura detalles
	 * @param facturaDetalle
	 * @return
	 */
	public String crearFactura(FacturaDetalleIngresoDTO facturaDetalle);

	/**
	 * Consulta la factura correspondiente al id
	 * @param facturaDetalle
	 * @return
	 */	
	public Factura consultarFactura(Long facturaId);

	/**
	 * Eliminar la factura indicada por facturaId
	 * @param facturaId
	 */
	public void eliminarFactura(Long facturaId);
		
	/**
	 * Consulta un cliente por medio de su id
	 * @param clienteId
	 * @return
	 */
	public Cliente consultarCliente(Long clienteId);
	
	/**
	 * Consulta una bebida por medio de su id
	 * @param bebidaId
	 * @return
	 */
	public Bebida consultarBebida(Long bebidaId);
	
	/**
	 * Consulta un plato por medio de su id
	 * @param platoId
	 * @return
	 */
	public Plato consultarPlato(Long platoId);
	
	/**
	 * Consulta una factura detalle por medio del id de la factura
	 * @param facturaId
	 * @return
	 */
	public List<FacturaDetalle> consultarFacturaDetalles(Long facturaId);
	
	/**
	 * Consulta una factura con detalles
	 * @param facturaId
	 * @return
	 */
	public FacturaDetalleIngresoDTO consultarFacturaDetalle(Long facturaId);

	/**
	 * Consulta las bebidas
	 * @return
	 */
	public List<Bebida> consultarBebidas();

	/**
	 * Consulta los de platos
	 * @return
	 */
	public List<Plato> consultarPlatos();
	

}
