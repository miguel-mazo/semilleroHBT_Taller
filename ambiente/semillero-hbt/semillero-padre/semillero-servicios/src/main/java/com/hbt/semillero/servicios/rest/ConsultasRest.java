package com.hbt.semillero.servicios.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.FacturaDetalleIngresoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal;

/**
 * Componente que expone servicios rest.
 * 
 * @author Miguel
 *
 */

@Path("/ConsultasRest")
public class ConsultasRest {

	@EJB
	private IConsultasEJBLocal consultaEJB;

	@POST
	@Path("/crearFactura")
	@Produces(MediaType.APPLICATION_JSON)
	public String crearFactura(FacturaDetalleIngresoDTO facturaDetalle) {
		return consultaEJB.crearFactura(facturaDetalle);
	}

	@GET
	@Path("/consultarFactura")
	@Produces(MediaType.APPLICATION_JSON)
	public FacturaDetalleIngresoDTO consultarFactura(@QueryParam("facturaId") Long facturaId) {
		return consultaEJB.consultarFacturaDetalle(facturaId);
	}

	@POST
	@Path("/eliminarFactura")
	public void eliminarFactura(@QueryParam("facturaId") Long facturaId) {
		consultaEJB.eliminarFactura(facturaId);
	}
	
	@GET
	@Path("/consultarBebidas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bebida> consultarBebidas(){
		return consultaEJB.consultarBebidas();
	}
	
	@GET
	@Path("/consultarPlatos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Plato> consultarPlatos(){
		return consultaEJB.consultarPlatos();
	}
	
	
}
