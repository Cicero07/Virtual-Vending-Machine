package com.techelevator;

public class Gum extends Items {


    public Gum(String itemNumber, String itemName, double itemPrice, String itemType, int inventory) {
        super(itemNumber, itemName, itemPrice, itemType, inventory);
    }




    public String getSound() {
        return "Chew Chew, Yum!";
    }
}
