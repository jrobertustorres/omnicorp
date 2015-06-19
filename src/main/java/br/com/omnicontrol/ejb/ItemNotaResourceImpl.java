package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.omnicontrol.entity.ItemNota;
import br.com.omnicontrol.entity.Produto;
import br.com.omnicontrol.rest.ItemNotaResource;

@Stateless
public class ItemNotaResourceImpl implements ItemNotaResource{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<ItemNota> getItensNota() {
		List<ItemNota> itemNota = entityManager.createQuery("from itemnota order by id", ItemNota.class).getResultList();
		return itemNota;
	}

	@Override
	public void removeItemNota(Long itemNotaId) {
		final ItemNota itemNota = entityManager.find(ItemNota.class, itemNotaId);
		if (null == itemNota) {
			throw new NoResultException("Nenhum item com id " + itemNotaId + " encontrado.");
		}
		entityManager.remove(itemNota);
	}

	@Override
	public ItemNota saveItemNota(ItemNota itemNota) {
//		Produto estoque;
//		ProdutoResourceImpl p = new ProdutoResourceImpl();
//		estoque = p.verificaEstoqueMinimo(itemNota.getProduto());
		if (itemNota.getIdItemNota() == null) {
			entityManager.persist(itemNota);
		} else {
			entityManager.merge(itemNota);
		}
		return itemNota;
	}

	@Override
	public ItemNota getItemNota(Long itemNotaId) {
		return entityManager.find(ItemNota.class, itemNotaId);
	}
}
