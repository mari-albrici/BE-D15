package entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	private PubblicazioniCartacee elementoPrestato;
	
	private LocalDate dataInizioPrestito;
	private LocalDate dataPrevistaFine = dataInizioPrestito.plusDays(30);
	private LocalDate dataEffettivaFine;
	
	public Prestito(Utente utente, PubblicazioniCartacee elementoPrestato, LocalDate dataInizioPrestito, LocalDate dataEffettivaFine) {
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataEffettivaFine = dataEffettivaFine;
	}
	
}
