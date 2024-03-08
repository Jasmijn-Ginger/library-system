package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getOverviewItemText() {
        Book boek1 = new Book("To Kill a Mockingbird", "Little, Brown and", LocalDateTime.of(1935, 12, 31, 0, 0), "Roman", "12", "136975642", "Harold Bloom", "Harper Lee");
        Assertions.assertEquals("136975642 - To Kill a Mockingbird - Harper Lee - 1935-12-31T00:00 - Beschikbaar", boek1.getOverviewItemText());

    }
}