package com.techelevator.App;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Array;
import java.util.*;

public class VendingMachineCLI{
	private Scanner userInput;
	private VendoMatic600 vendoMatic600;
	boolean continueRunning = true;



	public VendingMachineCLI() {
		this.userInput = new Scanner(System.in);
		vendoMatic600 = new VendoMatic600("M&R Vending Machine");
	}

	public static void main(String[] args) {
		//Created an instance of the class and ran it
		VendingMachineCLI vendingMachineCLI = new VendingMachineCLI();
		vendingMachineCLI.run();
	}

	public void run() {
		displayWelcomeMessage(vendoMatic600);
		// Test the SalesReport & make an order

		Map<String,String>displayItems = new HashMap<>();
		displayItems.put("D1", "Coca-Cola");
		displayItems.put("D2", "Sprite");
		displayItems.put("D3", "Gatorade");
		displayItems.put("D4", "Dr. Pepper");
		displayItems.put("C1", "Skittles");
		displayItems.put("C2", "Snickers");
		displayItems.put("C3", "M&Ms");
		displayItems.put("C4", "Reese's");
		displayItems.put("B1", "Doritos");
		displayItems.put("B2", "Flaming Hot Cheetos");
		displayItems.put("B3", "Baked Sour-Cream & Onions");
		displayItems.put("B4", "Ghost Pepper Chips");
		displayItems.put("A1", "Big Red");
		displayItems.put("A2", "Spearmint");
		displayItems.put("A3", "Peppermint");
		displayItems.put("A4", "Hubba Bubba");


		while (continueRunning) {
			displayMainMenu();
			System.out.println("Make a Selection:");
			String userSelection = userInput.nextLine().toString().strip();

			if (userSelection.equals("1")){
				for (String i : displayItems.keySet()) {
					System.out.println(i + ") " + displayItems.get(i));
				}
				// test to see what this does . . .

			} else if (userSelection.equals("2")) {
				displaySubMenu();
			} else if (userSelection.equals("3")) {
				System.out.println("Goodbye");
				continueRunning = false;
			} else if (userSelection.equalsIgnoreCase("X50")) {
				displaySecretMenu();
			}
			else {
				System.out.println("Invalid option");
			}

		} this.userInput.close();

	}

	public void displayWelcomeMessage(VendoMatic600 vendoMatic600){
		System.out.println("*************************************************************");
		System.out.println("*  Welcome to our vending machine application.");
		System.out.println("*************************************************************");
		System.out.println("");
	}

	public void displayMainMenu() {
		System.out.println();
		System.out.println("Main Menu: ");
		System.out.println("1) Display Items");
		System.out.println("2) Purchase Items");
		System.out.println("3) Exit");
	}

	public void displaySubMenu() {
		System.out.println();
		System.out.println("A) Please Pay");
		System.out.println("B) Select Product");
		System.out.println("C) Exit");
		String userSelection = userInput.nextLine().strip();
		if (userSelection.equalsIgnoreCase("A")){

		} else if (userSelection.equalsIgnoreCase("B")) {

		} else if (userSelection.equalsIgnoreCase("C")){
			continueRunning = false;
		} else {
			System.out.println("Invalid Option");
			displaySubMenu();
		}


	}

	public void displaySecretMenu() {
		System.out.println();
		System.out.println("A) Inventory Report");
		System.out.println("B) Sales Report");
		System.out.println("C) Log Report");
		System.out.println("E) Exit");
		String userSelection = userInput.nextLine().strip();


		if (userSelection.equalsIgnoreCase("A")){
				// call inventory report
		} else if (userSelection.equalsIgnoreCase("B")) {
				// call Sales report
		} else if (userSelection.equalsIgnoreCase("C")){
				// call log report
		} else if (userSelection.equalsIgnoreCase("E")){
			displayMainMenu(); //Fix bug or Change to end app
		} else {
			System.out.println("Invalid Option");
			displaySecretMenu();
		}

	}


}
