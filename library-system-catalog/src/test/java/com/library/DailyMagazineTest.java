package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DailyMagazineTest {

    @Test
    void getOverviewItemText() {
        DailyMagazine krant = new DailyMagazine(50, "Jan Jansen", "45632156", "15", "NRC", LocalDateTime.of(2024, 01, 31, 0,0), "De bigshot publisher", "krant");
        Assertions.assertEquals("45632156 - NRC - 50 - Beschikbaar", krant.getOverviewItemText());

    }
}