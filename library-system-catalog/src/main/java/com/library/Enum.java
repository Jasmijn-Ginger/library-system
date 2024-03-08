package com.library;

public class Enum {
    enum Status {
        //Enum waardes die de constructor aanroepen
        AVAILABLE("Beschikbaar"),
        UNAVAILABLE("Uitgeleend");

        //label van de Enum waarde
        public final String label;

        //Constructor alleen voor gebruik binnen de Status Enum
        private Status(String label){
            this.label = label;
        }
    }
}
