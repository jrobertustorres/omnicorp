package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.Empresa;
import br.com.omnicontrol.rest.EmpresaResource;

@Stateless
public class EmpresaResourceImpl implements EmpresaResource{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Empresa saveEmpresa(Empresa empresa) {
		if (empresa.getIdEmpresa() == null) {
			entityManager.persist(empresa);
		} else {
			entityManager.merge(empresa);
		}
		return empresa;
	}

	@Override
	public List<Empresa> getEmpresa() {
		return entityManager.createQuery("FROM empresa ORDER BY id", Empresa.class).getResultList();
	}

	@Override
	public void removeEmpresa(Long empresaId) {
		final Empresa empresa = entityManager.find(Empresa.class, empresaId);
		if (null == empresa) {
			throw new NoResultException("Nenhuma Empresa com id " + empresaId + " encontrada.");
		}
		entityManager.remove(empresa);
	}
	
	@Override
	public Empresa getEmpresa(Long empresaId) {
		return entityManager.find(Empresa.class, empresaId);
	}
}
