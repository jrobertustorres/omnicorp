package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.Empresa;

@Path("/empresa")
public interface EmpresaResource {

	@POST
	@Path("/")
	Empresa saveEmpresa(Empresa empresa);
	
	@GET
	@Path("/")
	List<Empresa> getEmpresa();
	
	@DELETE
	@Path("/{id}")
	void removeEmpresa(@PathParam("id") Long empresaId);
	
	@GET
	@Path("/{id}")
	Empresa getEmpresa(@PathParam("id") Long empresaId);
	
//	@GET
//	@Path("/get-options")
//	List<Empresa> getOptions();
}
