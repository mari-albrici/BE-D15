package entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prestiti")
@Getter
@Setter
@NoArgsConstructor
public class Prestito {

	@Id
	@GeneratedValue
	private UUID id;
	
	@ManyToOne
	private Utente utente;
	
	@OneToMany
	private PubblicazioniCartacee elemento;
	
	private LocalDate dataInizioPrestito;
	private LocalDate dataPrevistaFine;
	private LocalDate dataEffettivaFine;
	
}
