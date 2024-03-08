package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyMagazineTest {

    @Test
    void getOverviewItemText() {
        MonthlyMagazine quest = new MonthlyMagazine(11, "Waterlife", "Someone", "146875325", "13", "Quest", LocalDateTime.of(2001, 5, 13, 0, 0), "Bookholding", "Science");
        Assertions.assertEquals("146875325 - Quest - 11 - Beschikbaar", quest.getOverviewItemText());
    }
}