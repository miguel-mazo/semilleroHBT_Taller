package com.hbt.semillero.servicios.ejb;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.entidades.Plato;
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

		Date fecha;
		
		try {
			fecha = new SimpleDateFormat("yyyy-MM-dd").parse(facturaDetalle.getFechaCompra());
						
			if (fecha.compareTo(new Date()) > 0) {
				return "No se puede crear un pedido a una fecha mayor a la del sistema";
			}
		} catch (ParseException e) {
			return "No se pudo crear la factura";
		}
		

		if (facturaDetalle.getDetalles().isEmpty()) {
			return "El pedido no tiene productos";
		}

		List<FacturaDetalle> facturasDetalles = new ArrayList<FacturaDetalle>();

		BigDecimal total = BigDecimal.ZERO;
		BigDecimal aumento = new BigDecimal(1000);
		
		for (FacturaDetalleDTO detalleDTO : facturaDetalle.getDetalles()) {
			FacturaDetalle detalle = new FacturaDetalle();
			Bebida bebida = consultarBebida(detalleDTO.getBebidaId());
			detalle.setBebidaId(bebida);
			detalle.setCantidad(detalleDTO.getCantidad());
			detalle.setDetalleId(detalleDTO.getDetalleId());
			Plato plato = consultarPlato(detalleDTO.getPlatoId());
			detalle.setPlatoId(plato);
			detalle.setPrecioUnitario(detalleDTO.getPrecioUnitario());

			total = total.add(detalleDTO.getPrecioUnitario());

			facturasDetalles.add(detalle);
		}
		
		if (facturaDetalle.getTipoPedido() == 0) {
			
			// Valor adicional de 1000 si el pedido es para llevar
			total = total.add(aumento);
		}

		Factura factura = new Factura();
		Cliente cliente = consultarCliente(facturaDetalle.getIdCliente());
		factura.setFechaPedido(fecha);
		factura.setTipoPedido(facturaDetalle.getTipoPedido());
		factura.setMetodoPago(facturaDetalle.getMetodoPago());
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
	public Factura consultarFactura(Long facturaId) {
		List<Factura> factura = em
				.createQuery("Select v from Factura v WHERE v.facturaId = :facturaId ")
				.setParameter("facturaId", facturaId).getResultList();
		
		if(factura.isEmpty()) {
			return null;
		}
		
		return factura.get(0);
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<FacturaDetalle> consultarFacturaDetalles(Long facturaId) {
		List<FacturaDetalle> facturaDetalle = em
				.createQuery("Select v from FacturaDetalle v WHERE v.facturaId.facturaId = :facturaId ")
				.setParameter("facturaId", facturaId).getResultList();
		return facturaDetalle;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarFactura(Long facturaId) {
		List<FacturaDetalle> facturaDetalles = consultarFacturaDetalles(facturaId);
		Factura factura = consultarFactura(facturaId);
		
		for (FacturaDetalle facturaDetalle : facturaDetalles) {
			em.remove(facturaDetalle);
		}
		em.remove(factura);
		
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Cliente consultarCliente(Long clienteId) {
		List<Cliente> cliente = em
				.createQuery("Select v from Cliente v WHERE v.clienteId = :clienteId ")
				.setParameter("clienteId", clienteId).getResultList();
		
		if(cliente.isEmpty()) {
			return null;
		}
		
		return cliente.get(0);
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Bebida consultarBebida(Long bebidaId) {
		List<Bebida> bebida = em
				.createQuery("Select v from Bebida v WHERE v.bebidaId = :bebidaId ")
				.setParameter("bebidaId", bebidaId).getResultList();
		
		if(bebida.isEmpty()) {
			return null;
		}
		
		return bebida.get(0);
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Bebida> consultarBebidas() {
		List<Bebida> bebida = em
				.createQuery("Select v from Bebida v ").getResultList();
		
		if(bebida.isEmpty()) {
			return null;
		}
		
		return bebida;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Plato> consultarPlatos() {
		List<Plato> plato = em
				.createQuery("Select v from Plato v ").getResultList();
		
		if(plato.isEmpty()) {
			return null;
		}
		
		return plato;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Plato consultarPlato(Long platoId) {
		List<Plato> plato = em
				.createQuery("Select v from Plato v WHERE v.platoId = :platoId ")
				.setParameter("platoId", platoId).getResultList();
		
		if(plato.isEmpty()) {
			return null;
		}
		
		return plato.get(0);
	}

	@Override
	public FacturaDetalleIngresoDTO consultarFacturaDetalle(Long facturaId) {
		
		FacturaDetalleIngresoDTO facturaDetalleDTO = new FacturaDetalleIngresoDTO();
				
		Factura factura = consultarFactura(facturaId);
		
		List<FacturaDetalle> facturaDetalles = consultarFacturaDetalles(facturaId);
		List<FacturaDetalleDTO> detallesDTO = new ArrayList<FacturaDetalleDTO>();
		
		for (FacturaDetalle detalle : facturaDetalles) {
			FacturaDetalleDTO detalleDTO = new FacturaDetalleDTO();
			detalleDTO.setBebidaId(detalle.getBebidaId().getBebidaId());
			detalleDTO.setCantidad(detalle.getCantidad());
			detalleDTO.setDetalleId(detalle.getDetalleId());
			detalleDTO.setPlatoId(detalle.getPlatoId().getPlatoId());
			detalleDTO.setPrecioUnitario(detalle.getPrecioUnitario());

			detallesDTO.add(detalleDTO);
		}
		
		facturaDetalleDTO.setDetalles(detallesDTO);
		facturaDetalleDTO.setFechaCompra(factura.getFechaPedido().toString());
		facturaDetalleDTO.setMetodoPago(factura.getMetodoPago());
		facturaDetalleDTO.setIdCliente(factura.getClienteId().getClienteId());
		facturaDetalleDTO.setTipoPedido(factura.getTipoPedido());
		
		return facturaDetalleDTO;
		
		
	}

}
