package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.Funcionario;

@Path("/funcionario")
public interface FuncionarioResource {
	
	@POST
	@Path("/")
	Funcionario saveFuncionario(Funcionario funcionario);
	
	@GET
	@Path("/")
	List<Funcionario> getFuncionarios();

	@DELETE
	@Path("/{id}")
	void removeFuncionario(@PathParam("id") Long funcionarioId);
	
	@GET
	@Path("/{id}")
	Funcionario getFuncionario(@PathParam("id") Long funcionarioId);

	
//	public boolean login(String email, String password);
}
