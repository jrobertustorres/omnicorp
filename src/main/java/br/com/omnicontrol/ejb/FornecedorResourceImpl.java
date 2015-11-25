package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.omnicontrol.entity.Fornecedor;
import br.com.omnicontrol.rest.FornecedorResource;

@Stateless
public class FornecedorResourceImpl implements FornecedorResource{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		
		if (fornecedor.getIdFornecedor() == null) {
			entityManager.persist(fornecedor);
		} else {
			entityManager.merge(fornecedor);
		}
		return fornecedor;
	}

	@Override
	public List<Fornecedor> getFornecedores() {
		return entityManager.createQuery("FROM fornecedor ORDER BY id", Fornecedor.class).getResultList();
	}

	@Override
	public void removeFornecedor(Long fornecedorId) {
		final Fornecedor fornecedor = entityManager.find(Fornecedor.class, fornecedorId);
		if (null == fornecedor) {
			throw new NoResultException("Nenhum Fornecedor com id " + fornecedorId + " encontrado.");
		}
		entityManager.remove(fornecedor);
		
	}

	@Override
	public Fornecedor getFornecedor(Long fornecedorId) {
		return entityManager.find(Fornecedor.class, fornecedorId);
	}

}
