package org.java.library;

public class Book {
	
	private String title;
	private int numPages;
	private String author;
	private String editor; 
	
	 public Book(String title, int numPages, String author,  String editor) throws Exception {
		 setTitle(title);
		 setNumPages(numPages);
		 setAuthor(author);
		 setEditor(editor);
	}
	 
	 
	// Title 
	 public void setTitle(String title) throws Exception {
		 if(title.isBlank() || title == null) 
			 throw new Exception("Il titolo non può essere vuoto");
			 
		
		 this.title = title;	 

	 }
	 
	 public String getTitle() {
		 
		 return title;
	 }

	 
	// Number of pages 
	 public void setNumPages(int numPages) throws Exception {
		 if(numPages <= 0) 
			 throw new Exception("Il libro non può avere 0 pagine o meno");
			 

		 this.numPages = numPages;
		 
	 }
	 
	 public int getNumPages() {
		 
		 return numPages;
	 }
	
	 
	// Author  
	 public void setAuthor(String author) throws Exception {
		 if(author.isBlank()|| author == null) 
			 throw new Exception("E' necessario inserire anche l'autore");
			 
		 this.author = author;
	 }
	 
	 public String getAuthor() {
		 
		 return author;
	 }
	 
		
	// Editor
	 public void setEditor(String editor) throws Exception {
		 if(editor.isBlank()|| editor == null) 
			 throw new Exception("E' necessario inserire anche l'editore");
			 
		this.editor = editor;
		 
	 }
	 
	 public String getEditor() {
		 
		 return editor;
	 }
	
	 
	 @Override
	public String toString() {
		 
		return "Titolo: " + title + " | Autore: " + author + " | N° pagine: " + numPages; 
	}
}
