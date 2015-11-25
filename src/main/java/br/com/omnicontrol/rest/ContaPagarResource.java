package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.ContaPagar;

@Path("/contapagar")
public interface ContaPagarResource {

	@GET
	@Path("/")
	List<ContaPagar> getContaPagar();

	@DELETE
	@Path("/{id}")
	void removeContaPagar(@PathParam("id") Long contaPagarId);

	@POST
	@Path("/")
	ContaPagar saveContaPagar(ContaPagar contaPagar);
	
	@GET
	@Path("/{id}")
	ContaPagar getContaPagar(@PathParam("id") Long contaPagarId);
}
