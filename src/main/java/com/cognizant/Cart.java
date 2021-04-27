package com.cognizant;

import java.util.List;

public class Cart {
    private  List<Item> itemList;
    private double subTotal;

    //private Cart(List<Item> itemList);

    public Cart(List<Item> itemList) {
        this.itemList= itemList;
    }

    public Cart() {

    }

    public double getSubTotal() {
        return subTotal;
    }
}
