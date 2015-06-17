package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.CentroCusto;
import br.com.omnicontrol.rest.CentroCustoResource;

@Stateless
public class CentroCustoResourceImpl implements CentroCustoResource{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public CentroCusto saveCentroCusto(CentroCusto centroCusto) {
		if (centroCusto.getIdCentroCusto() == null) {
			entityManager.persist(centroCusto);
		} else {
			entityManager.merge(centroCusto);
		}
		return centroCusto;
	}

	@Override
	public List<CentroCusto> getCentrosCusto() {
		return entityManager.createQuery("FROM centrocusto ORDER BY id", CentroCusto.class).getResultList();
	}

	@Override
	public void removeCentroCusto(Long centroCustoId) {
		final CentroCusto centroCusto = entityManager.find(CentroCusto.class, centroCustoId);
		if (null == centroCusto) {
			throw new NoResultException("No note with id " + centroCustoId + " found");
		}
		entityManager.remove(centroCusto);
	}

	@Override
	public CentroCusto getCentroCusto(Long centroCustoId) {
		return entityManager.find(CentroCusto.class, centroCustoId);
	}

	
}
