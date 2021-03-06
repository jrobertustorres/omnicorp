package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.Produto;
import br.com.omnicontrol.rest.ProdutoResource;

@Stateless
public class ProdutoResourceImpl implements ProdutoResource {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Produto saveProduto(Produto produto) {
		if (produto.getIdProduto() == null) {
			entityManager.persist(produto);
		} else {
			entityManager.merge(produto);
		}
		return produto;
	}

	@Override
	public List<Produto> getProdutos() {
		return entityManager.createQuery("FROM produto ORDER BY id", Produto.class).getResultList();
	}

	@Override
	public void removeProduto(Long produtoId) {
		final Produto produto = entityManager.find(Produto.class, produtoId);
		if (null == produto) {
			throw new NoResultException("Nenhum produto com id " + produtoId + " encontrado.");
		}
		entityManager.remove(produto);
	}

	@Override
	public Produto getProduto(Long produtoId) {
		return entityManager.find(Produto.class, produtoId);
	}
	
//	public Produto verificaEstoqueMinimo(Produto produto) {
//		Query query = entityManager.createQuery ("Select p.estoqueMinimo from Produto p where p.idProduto = "+produto);
//		Produto prod = (Produto) query.getSingleResult();
//		return prod;
//	}

}
