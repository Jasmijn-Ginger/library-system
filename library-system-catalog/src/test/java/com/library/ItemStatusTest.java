package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ItemStatusTest {

    Book boek1 = new Book("To Kill a Mockingbird", "Little, Brown and", LocalDateTime.of(1935, 12, 31, 0, 0), "Roman", "12", "136975642", "Harold Bloom", "Harper Lee");
    @Test
    void leenItem() {
        boek1.leenItem();
        Assertions.assertEquals(Enum.Status.UNAVAILABLE, boek1.getstatus());
    }

    @Test
    void retourneerItem() {
        boek1.retourneerItem();
        Assertions.assertEquals(Enum.Status.AVAILABLE, boek1.getstatus());
    }

    @Test
    void xgetStatus() {
        Assertions.assertEquals("Beschikbaar", boek1.getStatus());
    }
}