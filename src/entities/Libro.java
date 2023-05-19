package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libri")
@Getter
@Setter
@NoArgsConstructor
public class Libro extends PubblicazioniCartacee{
	
	private String autore;
	private String genere;

	public Libro(String titolo, int annoPubblicazione, int pagine, String autore, String genere) {
		super(titolo, annoPubblicazione, pagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	
	@Override
    public String toString() {
        return super.toString() + ", Autore: " + autore + ", Genere: " + genere;
    }
}
