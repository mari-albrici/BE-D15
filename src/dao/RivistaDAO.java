package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Rivista;


public class RivistaDAO {
	
	private final EntityManager em;

	public RivistaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(Rivista r) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(r);
		transaction.commit(); 
	}
}
