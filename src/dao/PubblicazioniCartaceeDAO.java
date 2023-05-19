package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.PubblicazioniCartacee;

public class PubblicazioniCartaceeDAO {

	private final EntityManager em;

	public PubblicazioniCartaceeDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(PubblicazioniCartacee pc) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(pc);
		transaction.commit(); 
	}
}
