package progsett;

import java.time.LocalDate;

public class Rivista extends Elemento {
	// Attributes
	Periodicita periodicita;

	public Rivista(String codIsbn, String titolo, LocalDate pubblicazione, int pagine, Periodicita periodicita) {
		super(codIsbn, titolo, pubblicazione, pagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}
	
	@Override
	public String toString() {
		return "- RIVISTA | titolo: " + this.getTitolo() + " | ISBN: " + this.getCodIsbn() + " | data di pubblicazione: " + this.getPubblicazione() + " | pagine: " + this.getPagine() + " |";

	}
}
