package progsett;

import java.time.LocalDate;

public abstract class Elemento {
	// Attributes
	private String titolo;
	private LocalDate pubblicazione;
	private int pagine;
	private String codIsbn;

	public Elemento(String codIsbn, String titolo, LocalDate pubblicazione, int pagine) {
		this.codIsbn = codIsbn;
		this.titolo = titolo;
		this.pubblicazione = pubblicazione;
		this.pagine = pagine;
	}

	public String getCodIsbn() {
		return codIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public LocalDate getPubblicazione() {
		return pubblicazione;
	}

	public int getPagine() {
		return pagine;
	}
}
