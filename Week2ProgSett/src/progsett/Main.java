package progsett;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Archivio a1 = new Archivio();

		ArrayList<Elemento> elements = new ArrayList<Elemento>(
			Arrays.asList(
				new Libro("1234", "Il Conte di Montecristo", LocalDate.of(1984, 5, 3), 100, "Dumas", "Romanzo"),
				new Libro("5689", "Il Codice Da Vinci", LocalDate.of(2008, 4, 9), 300, "Dan Brown", "Giallo"),
				new Libro("2748", "I pilastri della terra", LocalDate.of(2010, 1, 2), 55, "Ken Follet", "Cultura"),
				new Rivista("4709", "Focus", LocalDate.of(2023, 5, 7), 130, Periodicita.SETTIMANALE),
				new Rivista("8976", "Time", LocalDate.of(2020, 8, 6), 10, Periodicita.MENSILE),
				new Rivista("4352", "Coding", LocalDate.of(2022, 5, 3), 450, Periodicita.SEMESTRALE)
			)
		);
					
		//Aggiunta
		
		a1.aggiungiElemento(elements);
		
		a1.aggiungiElemento(new Libro("6758", "Hannibal", LocalDate.of(1997, 4, 3), 100, "Thomas Harris", "Giallo"));
		

		System.out.printf("Stato archivio:%n%n");
		a1.printArchivio();
		
		// Rimozione
		a1.rimuoviIsbn("5432");
		System.out.printf("%nStato Attuale dell' archivio:%n%n");
		a1.printArchivio();
		
		a1.ricercaIsbn("1234");
		a1.ricercaAnno(1984);
		a1.ricercaAutore("Dumas");
		a1.ricerca(Tipologia.TITOLO, "Il Conte di Montecristo");
		
		//Salvataggio su disco
		a1.scriviFile("Archivio.txt", a1);
		
		// Lettura
		System.out.println( "Lettura disco:" );
		try {
			a1.leggiFile("Archivio.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
