package br.com.omnicontrol.ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.CabecalhoNota;
import br.com.omnicontrol.rest.CabecalhoNotaResource;

@Stateless
public class CabecalhoNotaResourceImpl implements CabecalhoNotaResource{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CabecalhoNota> getCabecalhoNotas() {
		List<CabecalhoNota> cabecalhoNota = entityManager.createQuery("from cabecalhonota order by id", CabecalhoNota.class).getResultList();
		
		return cabecalhoNota;
	}

	@Override
	public void removeCabecalhoNota(Long cabecalhoNotaId) {
		final CabecalhoNota cabecalhoNota = entityManager.find(CabecalhoNota.class, cabecalhoNotaId);
		if (null == cabecalhoNotaId) {
			throw new NoResultException("Nenhuma nota com id " + cabecalhoNotaId + " encontrado.");
		}
		entityManager.remove(cabecalhoNota);
	}

	@Override
	public CabecalhoNota saveCabecalhoNota(CabecalhoNota cabecalhoNota) {
		if (cabecalhoNota.getIdCabecalhoNota() == null) {
			cabecalhoNota.setStatus("Aguardando");
			cabecalhoNota.setDataMovimentacao(new Date());  
			entityManager.persist(cabecalhoNota);
		} else {
			entityManager.merge(cabecalhoNota);
		}
		return cabecalhoNota;
	}

	@Override
	public CabecalhoNota getCabecalhoNota(Long cabecalhoNotaId) {
		return entityManager.find(CabecalhoNota.class, cabecalhoNotaId);
	}
}
