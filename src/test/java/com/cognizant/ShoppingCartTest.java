package com.cognizant;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @Test
   void emptyCart(){
        Cart cart = new Cart();
        assertEquals(0.0, cart.getSubTotal(),0.0);
    }
    @Test
    void subTotalAddingOneItem(){
        List<Item> itemList= new ArrayList<>();
        Cart cart = new Cart(itemList);

        Item item = new Item(80.9, "Apple");
        assertEquals(80.9, cart.getSubTotal(), 80.9);
    }

}
