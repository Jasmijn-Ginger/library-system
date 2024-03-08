package com.library;

import java.time.LocalDateTime;

public abstract class Magazine extends LibraryItem{
    private final String copyEditor;
    private final String isnn;

    protected Magazine(String copyEditor,
                    String isnn,
                    String ageRating,
                    String title,
                    LocalDateTime publicationDate,
                    String publisher,
                    String genre) {
        super(ageRating, title, publicationDate, publisher, genre);
        this.copyEditor = copyEditor;
        this.isnn = isnn;
    }

    public String getCopyEditor() {
        return copyEditor;
    }

    public String getIsnn() {
        return isnn;
    }

    //returnt magazine details
    public String getOverviewItemText(int number){
        return getIsnn() + " - " + getTitle() +" - " +  number +" - " +  getStatus();
    }
}
