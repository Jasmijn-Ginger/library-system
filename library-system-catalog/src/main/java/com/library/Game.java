package com.library;

import java.time.LocalDateTime;

public abstract class Game extends LibraryItem {

    private final String ean;
    private final int amountOfPlayers;

    protected Game(String ean,
                   int amountOfPlayers,
                   String ageRating,
                   String title,
                   LocalDateTime publicationDate,
                   String publisher,
                   String genre) {
        super(ageRating, title, publicationDate, publisher, genre);
        this.ean = ean;
        this.amountOfPlayers = amountOfPlayers;
    }


    public String getEan() {
        return ean;
    }

    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }

    //returns game details
    public String getOverviewItemText(String studioOrDesigner){
        return getEan() + " - " + super.getTitle() + " - " + studioOrDesigner +" - " +  super.getPublicationDate() +" - " +  super.getStatus();
    }
}
