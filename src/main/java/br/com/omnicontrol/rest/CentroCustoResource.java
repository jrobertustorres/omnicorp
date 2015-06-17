package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.CentroCusto;

@Path("/centrocusto")
public interface CentroCustoResource {
	
	@POST
	@Path("/")
	CentroCusto saveCentroCusto(CentroCusto centroCusto);

	@GET
	@Path("/")
	List<CentroCusto> getCentrosCusto();

	@DELETE
	@Path("/{id}")
	void removeCentroCusto(@PathParam("id") Long centroCustoId);
	
	@GET
	@Path("/{id}")
	CentroCusto getCentroCusto(@PathParam("id") Long centroCustoId);

}
