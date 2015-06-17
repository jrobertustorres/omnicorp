package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.Cargo;

@Path("/cargo")
public interface CargoResource {

	@GET
	@Path("/")
	List<Cargo> getCargos();

	@DELETE
	@Path("/{id}")
	void removeCargo(@PathParam("id") Long cargoId);

	@POST
	@Path("/")
	Cargo saveCargo(Cargo cargo);
	
	@GET
	@Path("/{id}")
	Cargo getCargo(@PathParam("id") Long cargoId);
}
