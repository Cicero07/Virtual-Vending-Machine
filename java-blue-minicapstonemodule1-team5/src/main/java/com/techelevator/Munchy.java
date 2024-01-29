package com.techelevator;

public class Munchy extends Items {


    public Munchy(String itemNumber, String itemName, double itemPrice, String itemType, int inventory) {
        super(itemNumber, itemName, itemPrice, itemType, inventory);
    }

    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
