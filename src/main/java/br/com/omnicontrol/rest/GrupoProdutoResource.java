package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.GrupoProduto;

@Path("/grupoproduto")
public interface GrupoProdutoResource {
	
	@POST
	@Path("/")
	GrupoProduto saveGrupoProduto(GrupoProduto grupoProduto);

	@GET
	@Path("/")
	List<GrupoProduto> getGrupoProdutos();

	@DELETE
	@Path("/{id}")
	void removeGrupoProduto(@PathParam("id") Long grupoProdutoId);
	
	@GET
	@Path("/{id}")
	GrupoProduto getGrupoProduto(@PathParam("id") Long grupoProdutoId);

}
