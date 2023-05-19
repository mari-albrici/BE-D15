package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "riviste")
@Getter
@Setter
@NoArgsConstructor
public class Rivista extends PubblicazioniCartacee{
	
	private Periodicità periodicità;;
	
	public Rivista(String titolo, int annoPubblicazione, int pagine, Periodicità periodicità) {
		super(titolo, annoPubblicazione, pagine);
		this.periodicità = periodicità;
	}

	public void getInfoRivista() {
		System.out.println(titolo + ", pubblicato nel " + annoPubblicazione + " " + periodicità + ", ha un totale di" + pagine + " pagine (il suo codice ISBN è: " + ISBN + ").");
	}
	
	public Periodicità getPeriodicità() {
		return periodicità;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Periodicità " + periodicità ;
    }
}
