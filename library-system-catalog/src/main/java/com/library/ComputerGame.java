package com.library;

import java.time.LocalDateTime;

public class ComputerGame extends Game {
    private final String studio;
    protected ComputerGame(String studio,
                           String ean,
                           int amountOfPlayers,
                           String ageRating,
                           String title,
                           LocalDateTime publicationDate,
                           String publisher,
                           String genre) {
        super(ean, amountOfPlayers, ageRating, title, publicationDate, publisher, genre);
        this.studio = studio;
    }

    //returns items as specified in Game: ean, title, studio, year of publication, status.
    public String getOverviewItemText(){
        return getOverviewItemText(studio);
    }
}
