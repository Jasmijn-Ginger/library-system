package com.library;

import com.data.ItemDAO;

public class ItemRepository {
    private ItemDAO itemDAO;

    ItemRepository(ItemDAO itemDAO){
        this.itemDAO = itemDAO;
    }


    public LibraryItem[] getAllItems(){
        return itemDAO.getAllItems();
    }

    //Bij nummer 10: nog een class aanmaken in testmap met meer data
    //Dan nummer 11 testen

}
