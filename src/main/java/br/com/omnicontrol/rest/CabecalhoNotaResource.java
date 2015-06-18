package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.CabecalhoNota;

@Path("/cabecalhonota")
public interface CabecalhoNotaResource {

	@GET
	@Path("/")
	List<CabecalhoNota> getCabecalhoNotas();

	@DELETE
	@Path("/{id}")
	void removeCabecalhoNota(@PathParam("id") Long cabecalhoNotaId);

	@POST
	@Path("/")
	CabecalhoNota saveCabecalhoNota(CabecalhoNota cabecalhoNota);
	
	@GET
	@Path("/{id}")
	CabecalhoNota getCabecalhoNota(@PathParam("id") Long cabecalhoNotaId);
}
