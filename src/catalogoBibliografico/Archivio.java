package catalogoBibliografico;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import entities.Libro;
import entities.Rivista;
import entities.Periodicità;
import entities.Utente;
import entities.Prestito;
import utils.JPAUtil;
import dao.UtenteDAO;
import dao.PrestitoDAO;
import dao.PubblicazioniCartaceeDAO;

public class Archivio {
	

	private static EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Archivio.class);


	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		PubblicazioniCartaceeDAO pcd = new PubblicazioniCartaceeDAO(em);
		UtenteDAO ud = new UtenteDAO(em);
		PrestitoDAO pd = new PrestitoDAO(em);
		
		//********** CREAZIONE LIBRI **********
		
		Libro libro1 = new Libro("Il Vangelo secondo la Scienza", 2019, 248, "Piergiorgio Odifreddi", "Scienza");
		Libro libro2 = new Libro("Il genio non esiste (e a volte è un idiota)", 2020, 300, "Barbascura X", "Scienza");
		Libro libro3 = new Libro("Le otto montagne", 2018, 200, "Paolo Cognetti", "Fiction");
		Libro libro4 = new Libro("Fa bene o fa male? Manuale di autodifesa alimentare", 2023, 328, "Dario Bressanini", "Scienza");
		Libro libro5 = new Libro("Donne che pensano troppo", 2023, 318, "Susan Nolen-Hoeksema", "Psicologia");
		
		//********** CREAZIONE RIVISTE **********
		
		Rivista rivista1 = new Rivista("Focus", 1992, 150, Periodicità.MENSILE);
		Rivista rivista2 = new Rivista("Vogue", 1892, 250, Periodicità.MENSILE);
		Rivista rivista3 = new Rivista("TIME", 1923, 100, Periodicità.SETTIMANALE);
		Rivista rivista4 = new Rivista("Journal of Molecular Biology", 1959, 250, Periodicità.SEMESTRALE);
		Rivista rivista5 = new Rivista("Journal of Applied Physics ", 1931, 900, Periodicità.SEMESTRALE);
		
		
		//********** CREAZIONE UTENTI **********
		
		Utente utente1 = new Utente("Luke", "Skywalker", LocalDate.of(1989, 6, 06));
		Utente utente2 = new Utente("Leia", "Skywalker", LocalDate.of(1989, 6, 06));
		Utente utente3 = new Utente("Han", "Solo", LocalDate.of(1985, 12, 27));
		
		//********** CREAZIONE PRESTITI **********
		
		Prestito prestito1 = new Prestito(utente1, rivista2, LocalDate.now(), LocalDate.now(), LocalDate.of(2023, 06, 01));
		Prestito prestito2 = new Prestito(utente1, libro2, LocalDate.of(2023, 03, 01), LocalDate.of(2023, 03, 01), LocalDate.of(2023, 03, 27));
		Prestito prestito3 = new Prestito(utente3, libro5, LocalDate.of(2023, 01, 07), LocalDate.of(2023, 01, 07), LocalDate.of(2023, 02, 12));
		
		
		// ********** SALVATAGGIO A DATABASE **********
		
//		pcd.save(libro1);
//		pcd.save(libro2);
//		pcd.save(libro3);
//		pcd.save(libro4);
//		pcd.save(libro5);
//		
//		pcd.save(rivista1);
//		pcd.save(rivista2);
//		pcd.save(rivista3);
//		pcd.save(rivista4);
//		pcd.save(rivista5);
		
//		ud.save(utente1);
//		ud.save(utente2);
//		ud.save(utente3);
//		
//		pd.save(prestito1);
//		pd.save(prestito2);
//		pd.save(prestito3);
		
		// ********** ELIMINAZIONA DA DATABASE PER ISBN **********
		
//		pcd.removeFromISBN(4);
		
		// ********** RICERCA PER ISBN **********
		
		
		
		// ********** RICERCA PER AUTORE **********
		
		// ********** RICERCA PER ANNO PUBBLICAZIONE **********
		
		// ********** RICERCA PER TITOLO **********
		
		// ********** Ricerca degli elementi attualmente in prestito dato un numero di tessera utente **********
		
		// ********** Ricerca di tutti i prestiti scaduti e non ancora restituiti **********
		
		em.close();
		emf.close();
	}
}