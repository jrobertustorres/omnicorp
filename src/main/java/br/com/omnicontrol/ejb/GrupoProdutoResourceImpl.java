package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.GrupoProduto;
import br.com.omnicontrol.rest.GrupoProdutoResource;

@Stateless
public class GrupoProdutoResourceImpl implements GrupoProdutoResource{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public GrupoProduto saveGrupoProduto(GrupoProduto grupoProduto) {
		if (grupoProduto.getIdGrupoProduto() == null) {
			entityManager.persist(grupoProduto);
		} else {
			entityManager.merge(grupoProduto);
		}
		return grupoProduto;
	}

	@Override
	public List<GrupoProduto> getGrupoProdutos() {
		return entityManager.createQuery("FROM grupoproduto ORDER BY id", GrupoProduto.class).getResultList();
	}

	@Override
	public void removeGrupoProduto(Long grupoProdutoId) {
		final GrupoProduto grupoProduto = entityManager.find(GrupoProduto.class, grupoProdutoId);
		if (null == grupoProduto) {
			throw new NoResultException("Nenhum Grupo de Produto com id " + grupoProdutoId + " encontrado!");
		}
		entityManager.remove(grupoProduto);
	}

	@Override
	public GrupoProduto getGrupoProduto(Long grupoProdutoId) {
		return entityManager.find(GrupoProduto.class, grupoProdutoId);
	}

}
