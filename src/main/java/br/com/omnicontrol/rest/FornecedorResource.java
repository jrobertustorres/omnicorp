package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.Fornecedor;


@Path("/fornecedor")
public interface FornecedorResource {
	
	@POST
	@Path("/")//anotações JAX-RS
	Fornecedor saveFornecedor(Fornecedor fornecedor);
	
	@GET
	@Path("/")
	List<Fornecedor> getFornecedores();

	@DELETE
	@Path("/{id}")
	void removeFornecedor(@PathParam("id") Long fornecedorId);
	
	@GET
	@Path("/{id}")
	Fornecedor getFornecedor(@PathParam("id") Long fornecedorId);
}
