package com.data;

import com.library.Book;
import com.library.LibraryItem;

import java.time.LocalDateTime;

public class class1 extends ItemDAO{

private final LibraryItem[] boeken = {
        new Book("Harry Potter en de steen der wijzen", "EnglishBook & co", LocalDateTime.of(2002, 5 , 6, 0, 0), "Adventure", "10", "549875632", "Rowling", "J.K. Rowling"),
        new Book("Hunger Games", "Books coop", LocalDateTime.of(2009, 3 , 6, 0, 0), "Actie", "10", "658745632", "Jane", "Johannes"),
        new Book("Game of Thrones", "Fanclub of dingees", LocalDateTime.of(1996, 5 , 19, 0, 0), "Adventure", "14", "456987532", "That guy", "That other guy")
};

    @Override
    public LibraryItem[] getAllItems() {
        return boeken;
    }
}
