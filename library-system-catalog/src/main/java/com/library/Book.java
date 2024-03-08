package com.library;

import java.time.LocalDateTime;

public class Book extends LibraryItem{
    private final String isbn;
    private final String copyEditor;
    private final String author;

    public Book(String title, String publisher, LocalDateTime publicationDate, String genre, String ageRating, String isbn, String copyEditor, String author) {
        super(ageRating, title, publicationDate, publisher, genre);
        this.isbn = isbn;
        this.copyEditor = copyEditor;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCopyEditor() {
        return copyEditor;
    }

    public String getAuthor() {
        return author;
    }

    // Returns qualities of the book
    protected String getOverviewItemText(){
        return getIsbn() +" - " +  getTitle() +" - " +  getAuthor() +" - " +  getPublicationDate() +" - " +  getStatus();
    }
}
