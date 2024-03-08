package com.library;

import java.time.LocalDateTime;

public class WeeklyMagazine extends Magazine {
    private final int weekNumber;

    public WeeklyMagazine(int weekNumber,
                          String copyEditor,
                          String isnn,
                          String ageRating,
                          String title,
                          LocalDateTime publicationDate,
                          String publisher,
                          String genre) {
        super(copyEditor, isnn, ageRating, title, publicationDate, publisher, genre);
        this.weekNumber = weekNumber;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    //returnt magazine details
    public String getOverviewItemText(){
        return getOverviewItemText(weekNumber);
    }
}
