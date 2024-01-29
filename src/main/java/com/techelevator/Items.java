package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Items {

    private String itemNumber;
    private String itemName;
    private double itemPrice;
    private String itemType;

    private int inventory;

    public Items(String itemNumber, String itemName, double itemPrice, String itemType, int inventory) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
        this.inventory = inventory;
    }



    public String getItemNumber() {
        return itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemType() {
        return itemType;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public abstract String getSound();

    public void decreaseInventory(){
        if (inventory > 0){
            inventory--;
        }

    }


//    public String inventory() {
//
//        String csvFile = "main.csv";
//        String csvSplitByComma = ",";
//
//
//        List<String> itemList = new ArrayList<>();
//
//
//        try (Scanner scanner = new Scanner(new File(csvFile))) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                // Split the line using commas
//                String[] itemData = line.split(csvSplitByComma);
//
//
//                // Add each element to the list
//                for (String element : itemData) {
//                    itemList.add(element);
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        Scanner scannerInput = new Scanner(System.in);
//        System.out.println("Make a selection: ");
//        String selection = scannerInput.nextLine();
//        String value ="";
//         //Access items in the list using a loop
//        try {
//            for (int i = 0; i < itemList.size(); i++) {
//                int index = itemList.indexOf(selection);
//                if (itemList.contains(selection)) {
//                     value = itemList.get(index + 2);
//                    break;
//                } else {
//                    System.out.println("Invalid. Please try again.");
//                }
//            }
//        } catch (IndexOutOfBoundsException e) {
//
//        }
//
//        return value;
//    }


    }
