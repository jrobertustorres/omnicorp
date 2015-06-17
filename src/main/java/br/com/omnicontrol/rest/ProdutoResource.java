package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.Produto;

@Path("/produto")
public interface ProdutoResource {

	@POST
	@Path("/")
	Produto saveProduto(Produto produto);
	
	@GET
	@Path("/")
	List<Produto> getProdutos();

	@DELETE
	@Path("/{id}")
	void removeProduto(@PathParam("id") Long produtoId);
	
	@GET
	@Path("/{id}")
	Produto getProduto(@PathParam("id") Long produtoId);
}
