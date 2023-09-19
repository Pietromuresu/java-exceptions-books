package org.java.library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi aggiungere?");
		int numBooks = sc.nextInt();
		
		sc.nextLine();
		Book[] catalogue = new Book[numBooks];
		
		
		for (int i = 0 ; i < numBooks; i++) {
			// Popolo l'array con il try-catch in modo da scovare l'errore e far riscrivere l'elemento sbagliato 
			
			try {
				
				System.out.print("Titolo libro "+ (i +1) + ": ");
				String title = sc.nextLine();
				
				System.out.print("N° Pagine libro "+ (i +1) + ": ");
				int numPages = Integer.valueOf(sc.nextLine());
				
				
				System.out.print("Autore libro "+ (i +1) + ": ");
				String author = sc.nextLine();
				
				System.out.print("Editore libro "+ (i +1) + ": ");
				String editor = sc.nextLine();
				
				
				catalogue[i] = new Book(title, numPages, author, editor);
				
			}catch (Exception e) {
				
				System.err.println("!ERRORE! -> " + e.getMessage());
				i--;
			}
		}
		
		sc.close();
		
		// Scrivo sul file
		FileWriter writer = null;
		
		
		try {
			writer = new FileWriter("./src/org/java/library/catalogue.txt", true);
			
			for(int i = 0; i <= numBooks -1; i++) {
			
				writer.write(catalogue[i].getTitle() + "\n");	
			}
			
		}catch(IOException e) {
			
			System.err.println("!ERRORE! -> " + e.getMessage());
		}finally {
			
			if(writer != null)
				writer.close();
		}
		
		
		// Leggo il file
		File catFile = new File("./src/org/java/library/catalogue.txt");
		Scanner reader = null;
		try {
			reader = new Scanner(catFile);
			// leggo tutto il file e stampo il titolo del libro corrente
			while(reader.hasNextLine()) {

					String line = reader.nextLine();
					System.out.println(line);
				}
		}catch(IOException e) {
			
			System.err.println("!ERRORE! -> " + e.getMessage());
		}finally {
		
			if(reader != null)
				reader.close();
		}
		
		
	}
}
