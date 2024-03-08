package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ComputerGameTest {

    @Test
    void getOverviewItemText() {
        ComputerGame sonic = new ComputerGame("hedgehoglovers", "46359876632", 4, "4", "Sonic", LocalDateTime.of(1935, 12, 31, 0, 0), "A publisher", "adventure" );
        Assertions.assertEquals("46359876632 - Sonic - hedgehoglovers - 1935-12-31T00:00 - Beschikbaar", sonic.getOverviewItemText());
    }
}