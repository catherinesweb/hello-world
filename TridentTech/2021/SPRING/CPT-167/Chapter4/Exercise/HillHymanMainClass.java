/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: This program allows users to select a product before calculating the total cost of the transaction, including any discounts and taxes.
 CREATEDATE: 02/04/2021
*/

//Package
package edu.cpt167.hillhyman.exercise4;

//Import Scanner
import java.util.Scanner;

//START Class
public class HillHymanMainClass {
	
	//START Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//CONSTANTS
		final double TAX_RATE = 0.075;
		final String DISCOUNT_NAME_MEMBER = "Member";
		final String DISCOUNT_NAME_SENIOR = "Senior";
		final String DISCOUNT_NAME_NONE = "No Discount";
		final double DISCOUNT_RATE_MEMBER = 0.15;
		final double DISCOUNT_RATE_SENIOR = 0.25;
		final double DISCOUNT_RATE_NONE = 0.0;
		final String DISCOUNT_NAME_QUIT = "Quit";
		final String ITEM_NAME_PREMIUM = "Platinum Game";
		final String ITEM_NAME_SPECIAL = "Gold Game";
		final String ITEM_NAME_BASIC = "Base Game";
		final double ITEM_PRICE_PREMIUM = 55.95;
		final double ITEM_PRICE_SPECIAL = 24.95;
		final double ITEM_PRICE_BASIC = 15.95;
		
		//VARIABLES
		String userName = "";
		char rateSelection = ' ';
		char itemSelection = ' ';
		int howMany = 0;
		double discountRate = 0.0;
		String itemName = "";
		double itemPrice = 0.0;
		double discountAmount = 0.0;
		double discountPrice = 0.0;
		double subTotal = 0.0;
		double tax = 0.0;
		double totalCost = 0.0;
		
		//DISPLAY Welcome Banner
		System.out.println("Welcome to the Video Game Store Register!");
		System.out.println("This program calculates the total cost of a transaction");
		System.out.println("before applying taxes and any discounts.");
		
		//INPUT SECTION
		
		//User name input
		System.out.print("\nWhat is your name? ");
		userName = input.next();
		
		//User greeting
		System.out.println("\nHello, " + userName + "!");
		System.out.println("Let's get started!");
		
		//PRIME READ for discount
		//MENU for discount selection
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("DISCOUNT MENU");
		System.out.printf("%-8s%-12s%5.1f%-1s\n", "[A] for ", DISCOUNT_NAME_MEMBER, (DISCOUNT_RATE_MEMBER*100), "%");
		System.out.printf("%-8s%-12s%5.1f%-1s\n", "[B] for ", DISCOUNT_NAME_SENIOR, (DISCOUNT_RATE_SENIOR*100), "%");
		System.out.printf("%-8s%-12s%5.1f%-1s\n", "[C] for ", DISCOUNT_NAME_NONE, (DISCOUNT_RATE_NONE*100), "%");
		System.out.printf("%-8s%-12s\n", "[Q] for ", DISCOUNT_NAME_QUIT);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//discount selection input
		System.out.print("Enter your selection here: ");
		//Prime Read for selection
		rateSelection = input.next().toUpperCase().charAt(0);
		
		//START While Validation Loop to test for invalid char input
		while (rateSelection != 'A' && rateSelection != 'B' && rateSelection != 'C' && rateSelection != 'Q')//loop test conditions
		{
			//Message for invalid input from user
			System.out.println("\n~~~Invalid selection.~~~\n");
			
			//Menu for discount selection again
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("DISCOUNT MENU");
			System.out.printf("%-8s%-12s%5.1f%-1s\n", "[A] for ", DISCOUNT_NAME_MEMBER, (DISCOUNT_RATE_MEMBER*100), "%");
			System.out.printf("%-8s%-12s%5.1f%-1s\n", "[B] for ", DISCOUNT_NAME_SENIOR, (DISCOUNT_RATE_SENIOR*100), "%");
			System.out.printf("%-8s%-12s%5.1f%-1s\n", "[C] for ", DISCOUNT_NAME_NONE, (DISCOUNT_RATE_NONE*100), "%");
			System.out.printf("%-8s%-12s\n", "[Q] for ", DISCOUNT_NAME_QUIT);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//discount selection input
			System.out.print("Enter your selection here: ");
			//UPDATE Read for selection 
			rateSelection = input.next().toUpperCase().charAt(0);
		}//END Validation Loop
		//END Prime Read
		
		
		//START Run While Loop while selection is not "Q"
		while (rateSelection != 'Q')//run loop test condition
		{
			
			//PRIME READ for item
			//MENU for item selection
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("ITEM MENU");
			System.out.printf("%-8s%-20s%-2s%5.2f\n", "[A] for ", ITEM_NAME_PREMIUM, "$", ITEM_PRICE_PREMIUM);
			System.out.printf("%-8s%-20s%-2s%5.2f\n", "[B] for ", ITEM_NAME_SPECIAL, "$", ITEM_PRICE_SPECIAL);
			System.out.printf("%-8s%-20s%-2s%5.2f\n", "[C] for ", ITEM_NAME_BASIC, "$", ITEM_PRICE_BASIC);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//item selection input
			System.out.print("Enter your selection here: ");
			//Prime Read for selection
			itemSelection = input.next().toUpperCase().charAt(0);
			
			//START While Validation Loop to test for invalid char input
			while (itemSelection != 'A' && itemSelection != 'B' && itemSelection != 'C')//validation loop test conditions
			{
				//Message for invalid input from user
				System.out.println("\n~~~Invalid selection.~~~\n");
				
				//MENU for item selection again
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("ITEM MENU");
				System.out.printf("%-8s%-20s%-2s%5.2f\n", "[A] for ", ITEM_NAME_PREMIUM, "$", ITEM_PRICE_PREMIUM);
				System.out.printf("%-8s%-20s%-2s%5.2f\n", "[B] for ", ITEM_NAME_SPECIAL, "$", ITEM_PRICE_SPECIAL);
				System.out.printf("%-8s%-20s%-2s%5.2f\n", "[C] for ", ITEM_NAME_BASIC, "$", ITEM_PRICE_BASIC);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				//item selection input
				System.out.print("Enter your selection here: ");
				//UPDATE Read for selection
				itemSelection = input.next().toUpperCase().charAt(0);
			}//END Validation Loop
			//END Prime Read for item
			
			//INPUT for Item Quantity 
			System.out.println("\nHow many items are to be purchased? ");
			howMany = input.nextInt();
			
			//PROCESS SECTION
			
			//START if selector for discount rate
			if (rateSelection == 'A')//discount rate test condition
			{
				//assign variable based on user discount selection
				discountRate = DISCOUNT_RATE_MEMBER;
			}//END if
			else if (rateSelection == 'B')//START else if selector and test condition
			{
				//assign variable based on user discount selection
				discountRate = DISCOUNT_RATE_SENIOR;
			}//END else if
			else//START else selector for discount rate
			{
				//assign variable based on user discount selection
				discountRate = DISCOUNT_RATE_NONE;
			}//END else statement
			
			
			
			//START if selector for item names & prices
			if (itemSelection == 'A')//item name & price test condition
			{
				//assign variables based on user item selection
				itemName = ITEM_NAME_PREMIUM;
				itemPrice = ITEM_PRICE_PREMIUM;
			}//END if
			else if (itemSelection == 'B')//START else if selector for item names & prices and test condition
			{
				//assign variables based on user item selection
				itemName = ITEM_NAME_SPECIAL;
				itemPrice = ITEM_PRICE_SPECIAL;
			}//END else if
			else//START else selector for item
			{
				//assign variables based on user discount selection
				itemName = ITEM_NAME_BASIC;
				itemPrice = ITEM_PRICE_BASIC;
			}//END else statement
			
			
			//Calculations
			discountAmount = itemPrice * discountRate;
			discountPrice = itemPrice - discountAmount;
			subTotal = howMany * discountPrice;
			tax = subTotal * TAX_RATE;
			totalCost = subTotal + tax;
		
			//OUTPUT SECTION
			
			//Results Receipt
			System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
			System.out.print("ORDER REPORT");
			System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
			
			System.out.printf("%-20s%-20s\n", "User", userName);
			System.out.printf("%-20s%-20s\n", "Item Name", itemName);
			
			System.out.printf("%-20s%1s%8.2f\n", "Original Price", "$", itemPrice);
			
			System.out.printf("%-20s%8.1f%1s\n", "Discount", (discountRate*100), "%");
			System.out.printf("%-20s%1s%8.2f\n", "Discount Amount", "$", discountAmount);
			System.out.printf("%-20s%1s%8.2f\n", "Discounted Price", "$", discountPrice);
			
			System.out.printf("%-20s%9d\n", "Quantity", howMany);
			
			System.out.printf("%-20s%1s%8.2f\n", "Subtotal", "$", subTotal);
			System.out.printf("%-20s%1s%8.2f\n", "Tax", "$", tax);
			
			System.out.printf("%-20s%1s%8.2f\n", "Total Cost", "$", totalCost);
			System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
			
			
			//MODIFY LCV (Update Read)
			//MENU for discount selection
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("DISCOUNT MENU");
			System.out.printf("%-8s%-12s%5.1f%-1s\n", "[A] for ", DISCOUNT_NAME_MEMBER, (DISCOUNT_RATE_MEMBER*100), "%");
			System.out.printf("%-8s%-12s%5.1f%-1s\n", "[B] for ", DISCOUNT_NAME_SENIOR, (DISCOUNT_RATE_SENIOR*100), "%");
			System.out.printf("%-8s%-12s%5.1f%-1s\n", "[C] for ", DISCOUNT_NAME_NONE, (DISCOUNT_RATE_NONE*100), "%");
			System.out.printf("%-8s%-12s\n", "[Q] for ", DISCOUNT_NAME_QUIT);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//discount selection input
			System.out.print("Enter your selection here: ");
			//Prime Read for selection
			rateSelection = input.next().toUpperCase().charAt(0);
			
			//START While Validation Loop to test for invalid char input
			while (rateSelection != 'A' && rateSelection != 'B' && rateSelection != 'C' && rateSelection != 'Q')//loop test conditions
			{
				//Message for invalid input from user
				System.out.println("\n~~~Invalid selection.~~~\n");
				
				//Menu for discount selection again
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("DISCOUNT MENU");
				System.out.printf("%-8s%-12s%5.1f%-1s\n", "[A] for ", DISCOUNT_NAME_MEMBER, (DISCOUNT_RATE_MEMBER*100), "%");
				System.out.printf("%-8s%-12s%5.1f%-1s\n", "[B] for ", DISCOUNT_NAME_SENIOR, (DISCOUNT_RATE_SENIOR*100), "%");
				System.out.printf("%-8s%-12s%5.1f%-1s\n", "[C] for ", DISCOUNT_NAME_NONE, (DISCOUNT_RATE_NONE*100), "%");
				System.out.printf("%-8s%-12s\n", "[Q] for ", DISCOUNT_NAME_QUIT);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				//discount selection input
				System.out.print("Enter your selection here: ");
				//UPDATE Read for selection 
				rateSelection = input.next().toUpperCase().charAt(0);
			}//END Validation Loop
			//END Prime Read
			
		}//END Run While Loop to close program

		
		
		//Farewell message
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using the Video Game Store Register!");
		System.out.println("Have fun playing your new game !");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		//Close Scanner
		input.close();
		
	}//END Main Method
}//END Class
