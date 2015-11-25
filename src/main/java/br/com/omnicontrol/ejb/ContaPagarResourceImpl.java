package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.ContaPagar;
import br.com.omnicontrol.rest.ContaPagarResource;

@Stateless
public class ContaPagarResourceImpl implements ContaPagarResource{

	@PersistenceContext//funciona como Container que guarda as entidades que estão sendo gerenciadas pelo EntityManager
	private EntityManager entityManager;

	@Override
	public List<ContaPagar> getContaPagar() {
		List<ContaPagar> contasPagar = entityManager.createQuery("from contapagar order by id", ContaPagar.class).getResultList();
		return contasPagar;
	}

	@Override
	public void removeContaPagar(Long contaPagarId) {
		final ContaPagar contaPagar = entityManager.find(ContaPagar.class, contaPagarId);
		if (null == contaPagar) {
			throw new NoResultException("Nenhum cargo com id " + contaPagarId + " encontrado.");
		}
		entityManager.remove(contaPagar);
	}

	@Override
	public ContaPagar saveContaPagar(ContaPagar contaPagar) {
		if (contaPagar.getIdContaPagar() == null) {
			entityManager.persist(contaPagar);
		} else {
			entityManager.merge(contaPagar);
		}
		return contaPagar;
	}

	@Override
	public ContaPagar getContaPagar(Long contaPagarId) {
		return entityManager.find(ContaPagar.class, contaPagarId);
	}

}
