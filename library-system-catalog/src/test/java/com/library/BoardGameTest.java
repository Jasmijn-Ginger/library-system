package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class BoardGameTest {

    @Test
    void getOverviewItemText() {
        BoardGame catan = new BoardGame("Some Designer", "1398452364", 4, "5", "Catan", LocalDateTime.of(1935, 12, 31, 0, 0), "The greatest games", "Strategie");
        Assertions.assertEquals("1398452364 - Catan - Some Designer - 1935-12-31T00:00 - Beschikbaar", catan.getOverviewItemText());

    }
}