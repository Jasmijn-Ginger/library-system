package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class WeeklyMagazineTest {

    @Test
    void getOverviewItemText() {
        WeeklyMagazine donaldDuck = new WeeklyMagazine(50, "Walt Disney", "8644236422", "4+", "Donald Duck", LocalDateTime.of(2024, 2, 2, 0, 0), "Disney", "Comic");
        Assertions.assertEquals("8644236422 - Donald Duck - 50 - Beschikbaar", donaldDuck.getOverviewItemText());
    }
}