package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class PubblicazioniCartacee {

	@Id
	@GeneratedValue
	protected long ISBN;
	
	protected String titolo;
	protected int annoPubblicazione;
	protected int pagine;
	
	
	protected PubblicazioniCartacee(String titolo, int annoPubblicazione, int pagine) {
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.pagine = pagine;
	}
	
	protected String getTitolo() {
		return titolo;
	}
	
	protected int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	protected int getPagine() {
		return pagine;
	}
	
	protected long getISBN() {
		return ISBN;
	}
	
	@Override
    public String toString() {
        return "ISBN: " + ISBN + ", Titolo: " + titolo + ", Anno di pubblicazione: " + annoPubblicazione + ", Pagine: " + pagine;
    }
	
}
