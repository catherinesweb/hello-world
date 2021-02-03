/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: This program calculates the total cost of a transaction for a user including taxes and any possible discounts available.
 CREATEDATE: 01/28/2021
*/

//Package
package edu.cpt167.hillhyman.exercise3;

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
		
		//Variables
		String userName = "";
		String itemName = "";
		double originalPrice = 0.0;
		int howMany = 0;
		char menuSelection = ' ';
		double discountRate = 0.0;
		double discountAmount = 0.0;
		double discountPrice = 0.0;
		double subTotal = 0.0;
		double tax = 0.0;
		double totalCost = 0.0;
		
		//DISPLAY Welcome Banner
		System.out.println("Welcome to the Store's Receipt Program!");
		System.out.println("This program will calculate the total cost of a transaction");
		System.out.println("and apply taxes along with any discounts.");
		
		//INPUT SECTION
		
		//User name input
		System.out.println("\nWhat is your name?");
		userName = input.nextLine();
		
		//User greeting
		System.out.println("\nHello, " + userName + "!");
		System.out.println("Let's get started!");
		
		//String & double inputs
		System.out.println("\nWhat is the name of the item to be purchased? ");
		itemName = input.nextLine();
		System.out.println("What is the cost of the item? ");
		originalPrice = input.nextDouble();
		System.out.println("How many items will be purchased? ");
		howMany = input.nextInt();
		
		//Menu
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("DISCOUNT MENU");
		System.out.printf("%-8s%-20s%5.1f%-1s\n", "[A] for ", DISCOUNT_NAME_MEMBER, (DISCOUNT_RATE_MEMBER*100), "%");
		System.out.printf("%-8s%-20s%5.1f%-1s\n", "[B] for ", DISCOUNT_NAME_SENIOR, (DISCOUNT_RATE_SENIOR*100), "%");
		System.out.printf("%-8s%-20s%5.1f%-1s\n", "[C] for ", DISCOUNT_NAME_NONE, (DISCOUNT_RATE_NONE*100), "%");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Enter your selection here: ");
		menuSelection = input.next().toUpperCase().charAt(0);
		
		//PROCESS SECTION
		
		//Test for discount rates
		if (menuSelection == 'A')
		{
			discountRate = DISCOUNT_RATE_MEMBER;
		}
		else if (menuSelection == 'B')
		{
			discountRate = DISCOUNT_RATE_SENIOR;
		}
		else
		{
			discountRate = DISCOUNT_RATE_NONE;
		}
		
		
		//Calculations
		discountAmount = originalPrice * discountRate;
		discountPrice = originalPrice - discountAmount;
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
		
		System.out.printf("%-20s%1s%8.2f\n", "Original Price", "$", originalPrice);
		
		System.out.printf("%-20s%8.1f%1s\n", "Discount", (discountRate*100), "%");
		System.out.printf("%-20s%1s%8.2f\n", "Discount Amount", "$", discountAmount);
		System.out.printf("%-20s%1s%8.2f\n", "Discounted Price", "$", discountPrice);
		
		System.out.printf("%-20s%9d\n", "Quantity", howMany);
		
		System.out.printf("%-20s%1s%8.2f\n", "Subtotal", "$", subTotal);
		System.out.printf("%-20s%1s%8.2f\n", "Tax", "$", tax);
		
		System.out.printf("%-20s%1s%8.2f\n", "Total Cost", "$", totalCost);
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		//Farewell message
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using the Store's Receipt Program!");
		System.out.println("Have a nice day!");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		//Close Scanner
		input.close();
		
	}//END Main Method
}//END Class
