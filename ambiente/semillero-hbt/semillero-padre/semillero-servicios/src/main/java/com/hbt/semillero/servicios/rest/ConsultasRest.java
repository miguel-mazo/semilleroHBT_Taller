package com.hbt.semillero.servicios.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.FacturaDetalleIngresoDTO;
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
	public void consultarFactura() {
		consultaEJB.consultarFactura();
	}

	@POST
	@Path("/eliminarFactura")
	public void eliminarFactura() {
	}

}
