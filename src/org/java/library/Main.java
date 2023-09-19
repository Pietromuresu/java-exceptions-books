package org.java.library;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi aggiungere?");
		int numBooks = sc.nextInt();
		
		sc.nextLine();
		Book[] catalogue = new Book[numBooks];
		int index = 0;
		
		
		while (index < numBooks) {
			System.out.print("Inserisci il titolo del libro: ");
			String title = sc.nextLine();
			

			System.out.print("Inserisci il numero di pagine del libro: ");
			double numPagesStr = sc.nextDouble();
			

			System.out.print("Inserisci l'autore del libro: ");
			String author = sc.nextLine();

			
			sc.nextLine();
			System.out.print("Inserisci l'editore del libro: ");
			String editor = sc.nextLine();

			
			int numPages = (int)numPagesStr;
			catalogue[index] = new Book(title, numPages, author, editor);
			
			index++;
		}
		
		for(int i = 0; i < numBooks; i++) {
			System.out.println(catalogue[i]);
		}
		
		sc.close();
	}
}
