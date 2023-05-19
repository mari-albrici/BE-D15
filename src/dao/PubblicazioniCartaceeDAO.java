package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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
	
	public void removeFromISBN(long ISBN) {
		PubblicazioniCartacee foundPubblicazione = em.find(PubblicazioniCartacee.class, ISBN);
		if(foundPubblicazione != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.remove(foundPubblicazione);
			transaction.commit();
			System.out.println("Pubblicazione" + ISBN + "eliminata da database");
		}else {
			System.out.println("Could not delete a non-existent pubblicazione");
		}
	}
	
	public PubblicazioniCartacee searchByISBN(long ISBN){
		TypedQuery<PubblicazioniCartacee> query = em.createNamedQuery("searchByISBN", PubblicazioniCartacee.class);
		return query.getSingleResult();
	}
	
	public PubblicazioniCartacee searchByYear(int annoPubblicazione) {
		TypedQuery<PubblicazioniCartacee> query = em.createNamedQuery("searchByYear", PubblicazioniCartacee.class);
		return query.getSingleResult();
	}
	
	public PubblicazioniCartacee searchByTitle(String titolo) {
		TypedQuery<PubblicazioniCartacee> query = em.createNamedQuery("searchByTitle", PubblicazioniCartacee.class);
		return query.getSingleResult();
	}
}
