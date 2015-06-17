package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.TipoOperacao;
import br.com.omnicontrol.rest.TipoOperacaoResource;

@Stateless
public class TipoOperacaoResourceImpl implements TipoOperacaoResource{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public TipoOperacao saveTipoOperacao(TipoOperacao tipoOperacao) {
		if (tipoOperacao.getIdTipoOperacao() == null) {
			entityManager.persist(tipoOperacao);
		} else {
			entityManager.merge(tipoOperacao);
		}
		return tipoOperacao;
	}

	@Override
	public List<TipoOperacao> getTipoOperacoes() {
		return entityManager.createQuery("FROM tipooperacao ORDER BY id", TipoOperacao.class).getResultList();
	}

	@Override
	public void removeTipoOperacao(Long tipoOperacaoId) {
		final TipoOperacao tipoOperacao = entityManager.find(TipoOperacao.class, tipoOperacaoId);
		if (null == tipoOperacao) {
			throw new NoResultException("Nenhum Tipo de Operação com id " + tipoOperacaoId + " encontrado!");
		}
		entityManager.remove(tipoOperacao);
	}

	@Override
	public TipoOperacao getTipoOperacao(Long tipoOperacaoId) {
		return entityManager.find(TipoOperacao.class, tipoOperacaoId);
	}
}
