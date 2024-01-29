package com.techelevator;

public class Drink extends Items {


    public Drink(String itemNumber, String itemName, double itemPrice, String itemType, int inventory) {
        super(itemNumber, itemName, itemPrice, itemType, inventory);
    }

    public String getSound() {
        return "Glug Glug, Yum!";
    }
}
