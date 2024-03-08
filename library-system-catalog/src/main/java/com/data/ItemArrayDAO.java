package com.data;

import com.library.*;

import java.time.LocalDateTime;

public class ItemArrayDAO extends ItemDAO {

    private final LibraryItem[] allItems = {
            //3 borspellen
            new BoardGame("Some Designer", "1398452364", 4, "5", "Catan", LocalDateTime.of(1935, 12, 31, 0, 0), "The greatest games", "Strategie"),
            new BoardGame("House of Board", "1235895462", 2, "7", "Huppelwuk", LocalDateTime.of(2024, 2, 2, 0, 0), "The greatest games", "Geluk"),
            new BoardGame("House of cards", "4569875321", 2, "12", "Yatzee", LocalDateTime.of(1990, 2, 2, 0, 0), "999spellen", "Geluk"),
            //3 weekly magazines
            new WeeklyMagazine(50, "Walt Disney", "8644236422", "4+", "Donald Duck", LocalDateTime.of(2024, 2, 2, 0, 0), "Disney", "Comic"),
            new WeeklyMagazine(50, "Walt Disney", "8644236422", "4+", "Donald Duck", LocalDateTime.of(2024, 2, 2, 0, 0), "Disney", "Comic"),
            new WeeklyMagazine(50, "Walt Disney", "8644236422", "4+", "Donald Duck", LocalDateTime.of(2024, 2, 2, 0, 0), "Disney", "Comic")
    };


    public LibraryItem[] getAllItems() {
        return allItems.clone();
    }
}
