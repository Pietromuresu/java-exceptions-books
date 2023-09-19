package org.java.library;

public class Book {
	
	private String title;
	private int numPages;
	private String author;
	private String editor; 
	
	 public Book(String title, int numPages, String author,  String editor) {
		 setTitle(title);
		 setNumPages(numPages);
		 setAuthor(author);
		 setEditor(editor);
	}
	 
	 
	// Title 
	 public void setTitle(String title) {
		 
		 this.title = title;
	 }
	 
	 public String getTitle() {
		 
		 return title;
	 }

	 
	// Number of pages 
	 public void setNumPages(int numPages) {
		 
		 this.numPages = numPages;
	 }
	 
	 public int getNumPages() {
		 
		 return numPages;
	 }
	
	 
	// Author  
	 public void setAuthor(String author) {
		 
		 this.author = author;
	 }
	 
	 public String getAuthor() {
		 
		 return author;
	 }
	 
		
	// Editor
	 public void setEditor(String editor) {
		 
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
