package catalogoBibliografico;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

//import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import entities.Libro;
import entities.Rivista;
import entities.Periodicità;
import utils.JPAUtil;


public class Archivio {
	

	private static EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Archivio.class);


	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
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
		
	}
}