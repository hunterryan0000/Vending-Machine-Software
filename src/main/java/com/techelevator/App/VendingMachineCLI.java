package com.techelevator.App;

import java.io.File;
import java.util.Scanner;

public class VendingMachineCLI implements displayItems{
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

		// ToDo - Add Code here to show menu, etc.

		while (continueRunning) {
			displayMainMenu();
			System.out.println("Make a Selection:");
			String userSelection = userInput.nextLine().toString().strip();

			if (userSelection.equals("1")){
				displayItems.values();
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
