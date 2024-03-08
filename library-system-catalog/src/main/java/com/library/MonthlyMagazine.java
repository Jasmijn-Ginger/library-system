package com.library;

import java.time.LocalDateTime;

public class MonthlyMagazine extends Magazine {
    private final int monthNumber;
    private final String appearance;
    public MonthlyMagazine(int monthNumber,
                           String appearance,
                           String copyEditor,
                           String isnn,
                           String ageRating,
                           String title,
                           LocalDateTime publicationDate,
                           String publisher,
                           String genre) {
        super(copyEditor, isnn, ageRating, title, publicationDate, publisher, genre);
        this.monthNumber = monthNumber;
        this.appearance = appearance;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getAppearance() {
        return appearance;
    }

    //returnt magazine details
    public String getOverviewItemText(){
        return getOverviewItemText(monthNumber);
    }
}
