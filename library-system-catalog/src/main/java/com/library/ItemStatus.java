package com.library;

public class ItemStatus {

    private Enum.Status status = Enum.Status.AVAILABLE;

    //leent item uit bibliotheek, veranderd status in uitgeleend
    public void leenItem() {
        status = Enum.Status.UNAVAILABLE;
    }

    //retourneert items uit bibliotheek, veranderd status in beschikbaar
    public void retourneerItem() {
        status = Enum.Status.AVAILABLE;
    }

    //vraagt status label op, zoals gepresenteerd aan klant
    public String getStatus() {
        return status.label;
    }

    //vraagt status op voor testen
    public Enum.Status getstatus() {
        return status;
    }
}