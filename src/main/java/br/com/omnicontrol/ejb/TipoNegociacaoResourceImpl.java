package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.TipoNegociacao;
import br.com.omnicontrol.rest.TipoNegociacaoResource;

@Stateless
public class TipoNegociacaoResourceImpl implements TipoNegociacaoResource{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public TipoNegociacao saveTipoNegociacao(TipoNegociacao tipoNegociacao) throws Exception{
		if (tipoNegociacao.getIdTipoNegociacao() == null) {
			entityManager.persist(tipoNegociacao);
		} else {
			entityManager.merge(tipoNegociacao);
		}
		return tipoNegociacao;
	}

	@Override
	public List<TipoNegociacao> getTipoNegociacao() {
		return entityManager.createQuery("FROM tiponegociacao ORDER BY id", TipoNegociacao.class).getResultList();
	}

	@Override
	public void removeTipoNegociacao(Long tipoNegociacaoId) {
		final TipoNegociacao tipoNegociacao = entityManager.find(TipoNegociacao.class, tipoNegociacaoId);
		if (null == tipoNegociacao) {
			throw new NoResultException("Nenhum Tipo de Negociação com id " + tipoNegociacaoId + " encontrado!");
		}
		entityManager.remove(tipoNegociacao);
	}

	@Override
	public TipoNegociacao getTipoNegociacao(Long tipoNegociacaoId) {
		return entityManager.find(TipoNegociacao.class, tipoNegociacaoId);
	}
}
