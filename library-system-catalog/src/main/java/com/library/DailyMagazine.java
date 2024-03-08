package com.library;

import java.time.LocalDateTime;

public class DailyMagazine extends Magazine {
    private final int number;


    protected DailyMagazine(int number,
                         String copyEditor,
                         String isnn,
                         String ageRating,
                         String title,
                         LocalDateTime publicationDate,
                         String publisher,
                         String genre) {
        super(copyEditor, isnn, ageRating, title, publicationDate, publisher, genre);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    //returns magazine details
    public String getOverviewItemText(){
        return getOverviewItemText(number);
    }
}
