package com.hbt.semillero.servicios.ejb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.FacturaDetalleIngresoDTO;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal;

/**
 * EJB de consultas
 * 
 * @author Miguel
 *
 */

@Stateless
public class ConsultasEJB implements IConsultasEJBLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public String crearFactura(FacturaDetalleIngresoDTO facturaDetalle) {

		if (facturaDetalle.getFechaCompra().compareTo(new Date()) > 0) {
			return "No se puede crear un pedido a una fecha mayor a la del sistema";
		}

		if (facturaDetalle.getDetalles().isEmpty()) {
			return "El pedido no tiene productos";
		}

		List<FacturaDetalle> facturasDetalles = new ArrayList<FacturaDetalle>();

		BigDecimal total = BigDecimal.ZERO;
		BigDecimal aumento = new BigDecimal(1000);
		for (FacturaDetalleDTO detalleDTO : facturaDetalle.getDetalles()) {
			FacturaDetalle detalle = new FacturaDetalle();
			detalle.setBebidaId(detalleDTO.getBebidaId());
			detalle.setDetalleId(detalleDTO.getDetalleId());
			detalle.setFacturaId(detalleDTO.getFacturaId());
			detalle.setPlatoId(detalleDTO.getPlatoId());
			detalle.setPrecioUnitario(detalleDTO.getPrecioUnitario());

			if (!facturaDetalle.isTipoPedido()) {
				// Valor adicional de 1000 si el pedido es para llevar
				total = total.add(detalleDTO.getPrecioUnitario());
				total = total.add(aumento);

			} else {
				total = total.add(detalleDTO.getPrecioUnitario());
			}

			facturasDetalles.add(detalle);
		}

		Factura factura = new Factura();
		Cliente cliente = new Cliente();
		cliente.setClienteId(facturaDetalle.getIdCliente());
		factura.setClienteId(cliente);
		factura.setIva(total.multiply(new BigDecimal(0.05)));
		factura.setTotal(total);
		em.persist(factura);

		for (FacturaDetalle facturaDetalle2 : facturasDetalles) {
			facturaDetalle2.setFacturaId(factura);
			em.persist(facturaDetalle2);
		}

		return "Factura creada con éxito";
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void consultarFactura() {

	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarFactura() {

	}

}
