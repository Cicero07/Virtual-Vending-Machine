package com.techelevator;

public class Candy extends Items {

    public Candy(String itemNumber, String itemName, double itemPrice, String itemType, int inventory) {
        super(itemNumber, itemName, itemPrice, itemType, inventory);
    }

    public String getSound() {
        return "Yummy Yummy, So Sweet!";
    }
}
