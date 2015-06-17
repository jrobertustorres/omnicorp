package br.com.omnicontrol.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.omnicontrol.entity.TipoOperacao;

@Path("/tipooperacao")
public interface TipoOperacaoResource {

	@POST
	@Path("/")
	TipoOperacao saveTipoOperacao(TipoOperacao tipoOperacao);

	@GET
	@Path("/")
	List<TipoOperacao> getTipoOperacoes();

	@DELETE
	@Path("/{id}")
	void removeTipoOperacao(@PathParam("id") Long tipoOperacaoId);

	@GET
	@Path("/{id}")
	TipoOperacao getTipoOperacao(@PathParam("id") Long tipoOperacaoId);
}
