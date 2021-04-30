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
    @Test
    void sumOfTotalAddingMoreItems(){
        List<Item>itemList = new ArrayList<>();
        Cart cart = new Cart(itemList);

        Item item1 = new Item(80.9, "Apple");
        Item item2 = new Item(100, "Orange");

        assertEquals(180.9, cart.getSubTotal(), 180.9);
    }
    @Test
    void sumOfQuantityOfSameItem(){
        List<Item>itemList= new ArrayList<>();
        Cart cart = new Cart(itemList);

        Item item1 = new Item(80.9, "Apple");
        Item item2 = new Item(80.9, "Apple");
        Item item3 = new Item(100, "Orange");
        Item item4 = new Item(100, "Orange");

        assertEquals(561.8, cart.getSubTotal(),561.8);
    }

}
