package com.data;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ItemArrayDAOTest {

    @Test
    void getAllItems() {
        ItemArrayDAO itemArrayDAO = new ItemArrayDAO();
        System.out.println(Arrays.toString(itemArrayDAO.getAllItems()));
    }
}