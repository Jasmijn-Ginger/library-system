package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EnumTest {

    @Test
    void teststatus(){
        Assertions.assertEquals("Beschikbaar", Enum.Status.AVAILABLE.label);
    }

    @Test
    void teststatus2(){
        Assertions.assertEquals("Uitgeleend", Enum.Status.UNAVAILABLE.label);
    }
}