package com.library;

import java.time.LocalDateTime;

public abstract class LibraryItem extends ItemStatus {
    private final String ageRating;
    private final String title;
    private final LocalDateTime publicationDate;
    private final String publisher;
    private final String genre;



    protected LibraryItem(String ageRating, String title, LocalDateTime publicationDate, String publisher, String genre) {
        this.ageRating = ageRating;
        this.title = title;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        this.genre = genre;
    }



    public String getAgeRating() {
        return ageRating;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }


}
