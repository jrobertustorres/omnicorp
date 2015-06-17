package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.Cargo;
import br.com.omnicontrol.rest.CargoResource;

@Stateless
public class CargoResourceImpl implements CargoResource{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Cargo> getCargos() {
		List<Cargo> cargos = entityManager.createQuery("from cargo order by id", Cargo.class).getResultList();
		
		return cargos;
	}

	@Override
	public void removeCargo(Long cargoId) {
		final Cargo cargo = entityManager.find(Cargo.class, cargoId);
		if (null == cargo) {
			throw new NoResultException("No note with id " + cargoId + " found");
		}
		entityManager.remove(cargo);
		
	}

	@Override
	public Cargo saveCargo(Cargo cargo) {
		if (cargo.getIdCargo() == null) {
			entityManager.persist(cargo);
		} else {
			entityManager.merge(cargo);
		}
		return cargo;
	}

	@Override
	public Cargo getCargo(Long cargoId) {
		return entityManager.find(Cargo.class, cargoId);
	}

}
