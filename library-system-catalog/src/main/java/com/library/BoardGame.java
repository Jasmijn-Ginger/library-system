package com.library;

import java.time.LocalDateTime;

public class BoardGame extends Game {

    private final String designer;
    public BoardGame(String designer,
                     String ean,
                     int amountOfPlayers,
                     String ageRating,
                     String title,
                     LocalDateTime publicationDate,
                     String publisher,
                     String genre
    ) {
        super(ean, amountOfPlayers, ageRating, title, publicationDate, publisher, genre);
        this.designer = designer;
    }

    public String getDesigner() {
        return designer;
    }

    //Returns items as specified in Game: ean, title, designer, year of publication, status.
    public String getOverviewItemText(){
        return getOverviewItemText(getDesigner());
    }
}
