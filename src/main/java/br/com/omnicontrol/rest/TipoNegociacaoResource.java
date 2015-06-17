package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.TipoNegociacao;

@Path("/tiponegociacao")
public interface TipoNegociacaoResource {

	@POST
	@Path("/")
	TipoNegociacao saveTipoNegociacao(TipoNegociacao tipoNegociacao) throws Exception;

	@GET
	@Path("/")
	List<TipoNegociacao> getTipoNegociacao();

	@DELETE
	@Path("/{id}")
	void removeTipoNegociacao(@PathParam("id") Long tipoNegociacaoId);

	@GET
	@Path("/{id}")
	TipoNegociacao getTipoNegociacao(@PathParam("id") Long tipoNegociacaoId);
}
