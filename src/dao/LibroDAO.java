package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Libro;
import entities.Rivista;


public class LibroDAO {

	private final EntityManager em;

	public LibroDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(Libro l) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(l);
		transaction.commit(); 
	}
}
