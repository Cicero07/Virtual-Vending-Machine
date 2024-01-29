package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * This class is provided to you as a *suggested* class to start
 * your project. Feel free to refactor this code as you see fit.
 */
public class VendingMachineCLI {
	private Logger logger = new Logger();
	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}

	public void run() {
		returnInventory();
		// welcome the user to the vending machine
		System.out.println("Welcome to the Vendo-Matic 800");

		// generate options for the user
		boolean stay = true;
		Scanner mainMenuScanner = new Scanner(System.in);

		while (stay) {
			System.out.println("*** Main Menu ***");
			System.out.println("(1) Display Vending Machine Items");
			System.out.println("(2) Purchase");
			System.out.println("(3) Exit");
			String selection = mainMenuScanner.nextLine();

			if (selection.equals("1")) {
				displayMenu();
			} else if (selection.equals("2")) {
				moneyMenu();
			} else if (selection.equals("3")) {
				System.out.println();
				System.out.println("Thank you for your business!");
				System.out.println("Your change is: $" + bankAccount.getCurrentBalance());
				System.out.println();
				stay = false;
			} else {
				System.out.println("Please enter a valid number.");
			}

		}

		System.out.println("Bye! Leave us a nice Yelp Review.");
	}

	public void displayMenu(){
		System.out.println();
		System.out.println("*** Menu ***");
		File file = new File("main.csv");


		try {
			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] lineArr = line.split("\\,");

				String itemNumber = lineArr[0];
				String itemName = lineArr[1];
				String itemCost = lineArr[2];
				String itemType = lineArr[3];


				System.out.println(itemNumber + " " + itemName + " $" + itemCost + " " + itemType);
			}
		} catch (FileNotFoundException e) {

		}
	}

	private BankAccount bankAccount = new BankAccount(0);

	public void moneyMenu(){

		boolean stay = true;
		Scanner purchaseMenuScanner = new Scanner(System.in);

		while (stay) {
			System.out.println("Available Balance: $" + bankAccount.getCurrentBalance());
			System.out.println("(1) Feed Money");
			System.out.println("(2) Select Product");
			System.out.println("(3) Finish Transaction");
			String selection = purchaseMenuScanner.nextLine();


			if (selection.equals("1")) {
				System.out.println("Please enter amount fed into machine:");
				String feedMoneyAmount = purchaseMenuScanner.nextLine();
			try {
				Double feedMoneyDouble = Double.parseDouble(feedMoneyAmount);
				if (feedMoneyDouble > 0) {
					bankAccount.addMoney(feedMoneyDouble);
				} else {
					moneyMenu();
				}
			} catch (NumberFormatException e){
				System.out.println("Invalid. Please enter a integer.");
			}
			} else if (selection.equals("2")) {
				displayMenu();
				System.out.println();
				System.out.println("Please Enter Slot Number: ");
				String itemSelection = purchaseMenuScanner.nextLine();



				// The rest of this else if will display the cost of selection
				String csvFile = "main.csv";
				String csvSplitByComma = ",";


				List<String> itemList = new ArrayList<>();


				try (Scanner scanner = new Scanner(new File(csvFile))) {
					while (scanner.hasNextLine()) {
						String line = scanner.nextLine();
						// Split the line using commas
						String[] itemData = line.split(csvSplitByComma);


						// Add each element to the list
						for (String element : itemData) {
							itemList.add(element);
						}
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				String value ="";
				String itemName= "";
//				int inventory;

				try {
					for (int i = 0; i < itemList.size(); i++) {
						int index = itemList.indexOf(itemSelection);
						if (itemList.contains(itemSelection)) {
							value = itemList.get(index + 2);
							itemName = itemList.get(index+1);
//							inventory = Integer.parseInt(itemList.get(index + 4));
							Double valueAsDouble = Double.parseDouble(value);
							System.out.println(  itemName + ": $" + value);
							//for (int j = 0; j < totalInventory.size(); j++) {
							//	if (itemSelection.equals(totalInventory.get(0)))
							//	totalInventory..getSound();
							//}
							if (valueAsDouble <= bankAccount.getCurrentBalance()) {



								bankAccount.subtractMoney(valueAsDouble);
								logger.write( itemName + " "  + itemSelection + " " + bankAccount.getCurrentBalance());


								break;
							} else {
								System.out.println("not enough $");
							}
						} else {
							System.out.println("Invalid. Please try again.");
						}
					}
				} catch (IndexOutOfBoundsException e) {

				}


				// Select Product
			} else if (selection.equals("3")) {
				stay = false;
			} else {
				System.out.println("Please enter a valid item number.");
			}


		}


	}

	private List<Items> totalInventory = new ArrayList<>();

	public List<Items> returnInventory(){


		List<Items> items = new ArrayList<>();
		try { File file = new File("main.csv");
		Scanner scanner = new Scanner(file);


		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			String[] lineArr = line.split(",");

			if (lineArr[3].equals("Candy")){
				Candy candyItem = new Candy(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]),lineArr[3], Integer.parseInt(lineArr[4]));
				items.add(candyItem);
			} else if (lineArr[3].equals("Drink")) {
				Items drinkItem = new Drink(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]),lineArr[3], Integer.parseInt(lineArr[4]));
				items.add(drinkItem);
			} else if (lineArr[3].equals("Gum")) {
				Items gumItem = new Gum(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]),lineArr[3], Integer.parseInt(lineArr[4]));
				items.add(gumItem);
			} else if (lineArr[3].equals("Munchy")) {
				Items munchyItem = new Munchy(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]),lineArr[3], Integer.parseInt(lineArr[4]));
				items.add(munchyItem);
			}
			}
		} catch (FileNotFoundException e){
			System.out.println("File Not Found");
		}

		return items;


	}
	}


