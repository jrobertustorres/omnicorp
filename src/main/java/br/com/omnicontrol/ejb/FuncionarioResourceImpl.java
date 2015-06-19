package br.com.omnicontrol.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.omnicontrol.entity.Funcionario;
import br.com.omnicontrol.rest.FuncionarioResource;

@Stateless
public class FuncionarioResourceImpl implements FuncionarioResource{
	
	@PersistenceContext // estamos dizendo para ele ser injetado pelo servidor de aplicação.
	EntityManager entityManager;

	@Override
	public Funcionario saveFuncionario(Funcionario funcionario) {

		if (funcionario.getIdFuncionario() == null) {
			entityManager.persist(funcionario);
		} else {
			entityManager.merge(funcionario);
		}
		return funcionario;
	}

	@Override
	public List<Funcionario> getFuncionarios() {
		return entityManager.createQuery("FROM funcionario ORDER BY id", Funcionario.class).getResultList();
	}

	@Override
	public void removeFuncionario(Long funcionarioId) {
		final Funcionario func = entityManager.find(Funcionario.class, funcionarioId);
		if (null == func) {
			throw new NoResultException("Nenhum funcionario com id " + funcionarioId + " encontrado.");
		}
		entityManager.remove(func);
	}

	@Override
	public Funcionario getFuncionario(Long funcionarioId) {
		return entityManager.find(Funcionario.class, funcionarioId);
	}
	
//	public boolean login(String email, String senha) {
//        List resultList = null;
//        try{
////            em = getEntityManager();
//            Query q = entityManager.createQuery("select p from Funcionario f where f.email = :email and f.senha = :senha")
//                    .setParameter("email", email)
//                    .setParameter("senha", senha);
//            resultList = q.getResultList();
//            return !resultList.isEmpty();
//        } finally {
//        	entityManager.close();
//        }
//    }

}
