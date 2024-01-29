
package com.techelevator;
/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemInfo {


    // Test Class

  //  private List<Items> inventoryList = new ArrayList<>();

/*
    public void loadInventory() {

        // read through main.csv
        // and load its contents into inventory list

        // 0      1        2      3     4
        //A1,  U-Chews,  1.65,   Gum,   5

        //if element 3 is Drink, make a drink Object: Items drink = new Drink();
        // add this object to your main List

        // Add each element to the list

        //else if elment 3 is Gum, then make a Gum Object: ...
/*
        String csvFile = "main.csv";
        String csvSplitByComma = ",";
        try (Scanner scanner = new Scanner(new File(csvFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split the line using commas
                String[] itemData = line.split(csvSplitByComma);
                String id = itemData[0].trim();
                String name = itemData[1].trim();
                double price = Double.parseDouble(itemData[2].trim());
                String type = itemData[3].trim();
                int quantity = Integer.parseInt(itemData[4].trim());

                if (itemData[3].equals("Gum")) {
                    Items gum = new Gum(id, name, price, type, quantity);
                    inventoryList.add(gum);
                } else if (itemData[3].equals("Drink")) {
                    Items drink = new Drink(id, name, price, type, quantity);
                    inventoryList.add(drink);
                } else if (itemData[3].equals("Candy")) {
                    Items candy = new Candy(id, name, price, type, quantity);
                    inventoryList.add(candy);
                } else if (itemData[3].equals("Munchy")) {
                    Items munchy = new Munchy(id, name, price, type, quantity);
                    inventoryList.add(munchy);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
*/










    //TODO: don't make this a main
   // public static void main(String[] args){


                //  String csvFile = "main.csv";
                //String csvSplitByComma = ",";

                // TODO: has to be a list of <Items>
                //  List<String> itemList = new ArrayList<>();


      /*  try (Scanner scanner = new Scanner(new File(csvFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split the line using commas
                String[] itemData = line.split(csvSplitByComma);

                // 0      1        2      3     4
                //A1,  U-Chews,  1.65,   Gum,   5

                //if element 3 is Drink, make a drink Object: Items drink = new Drink();
                // add this object to your main List

                // Add each element to the list

                //else if elment 3 is Gum, then make a Gum Object: ...

                for (String element : itemData) {
                    itemList.add(element);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Make a selection: ");
        String selection = scannerInput.nextLine();

        // Access items in the list using a loop
        try {
            for (int i = 0; i < itemList.size(); i++) {
                int index = itemList.indexOf(selection);
                if (itemList.contains(selection)){
                    String value = itemList.get(index + 2);
                    System.out.println(value);
                    break;
                }
            }
        } catch(IndexOutOfBoundsException e){

        }
    }


    }



List<Items> items = returnInventory();

            try {
                for (Items item : items) {
                    if (item.getItemNumber().equals(itemSelection)) {
                        // Check if the item is in stock
                        if (item.getInventory() > 0) {
                            double itemCost = item.getItemPrice();
                            double currentBalance = bankAccount.getCurrentBalance();

                            if (itemCost <= currentBalance) {
                                // Process the purchase
                                double change = currentBalance - itemCost;
                                System.out.println("Purchase successful!");
                                System.out.println("New Current Balance: $" + change);

                                // Update the inventory and break
                                item.decreaseInventory();
                                break;
                            } else {
                                System.out.println("Not enough funds to purchase.");
                            }
                        } else {
                            System.out.println("Item out of stock.");
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }




        */








