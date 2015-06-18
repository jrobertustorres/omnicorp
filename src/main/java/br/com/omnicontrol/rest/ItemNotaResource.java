package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.ItemNota;

@Path("/itemnota")
public interface ItemNotaResource {

	@GET
	@Path("/")
	List<ItemNota> getItensNota();

	@DELETE
	@Path("/{id}")
	void removeItemNota(@PathParam("id") Long itemNotaId);

	@POST
	@Path("/")
	ItemNota saveItemNota(ItemNota itemNota);
	
	@GET
	@Path("/{id}")
	ItemNota getItemNota(@PathParam("id") Long itemNotaId);
}
