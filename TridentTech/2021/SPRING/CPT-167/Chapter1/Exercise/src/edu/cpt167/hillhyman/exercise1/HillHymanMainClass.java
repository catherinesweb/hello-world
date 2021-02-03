//AUTHOR: Catherine Hill Hyman
//COURSE: CPT167
//PURPOSE: This program calculates the total cost of items sold with a discount rate!
//STARTDATE: 01/14/2021

package edu.cpt167.hillhyman.exercise1;

import java.util.Scanner;

public class HillHymanMainClass 
{

	public static void main(String[] args) 
	{
		//VARIABLES
		//We need a Scanner people
		Scanner input = new Scanner(System.in);
		
		//Declare and Initialize variables and CONSTANTS
		final double DISCOUNT_RATE = 0.25;
		String userName = "";
		String itemName = "";
		double originalPrice = 0.0;
		int howMany = 0;
		double discountAmount = 0.0;
		double discountPrice = 0.0;
		double totalCost = 0.0;
		
		//Welcome Thing
		System.out.println("Welcome to This Store's Calculator!");
		System.out.println("This program will calculate the total cost of items");
		System.out.println("by entering the price and number of bags, then apply a discount rate!");
		System.out.println("");
		
		//INPUT PART
		
		//Ask for name
		System.out.println("Please enter your first name: ");
		userName = input.nextLine();
		//Line break
		System.out.println("");
		
		//Nice little message to user!
		System.out.println("Hello, " + userName + "!");
		System.out.println("");
		
		//Item name, price, and quantity inputs
		System.out.println("What is the name of the item? ");
		itemName = input.nextLine();
		System.out.print("What is the price of the item? $");
		originalPrice = input.nextDouble();
		System.out.println("How many items are purchased?");
		howMany = input.nextInt();
		
		//PROCESS PART
		
		//Calculate discount for item
		discountAmount = originalPrice * DISCOUNT_RATE;
		//Calculate discount price
		discountPrice = originalPrice - discountAmount;
		//Calculate total cost
		totalCost = howMany * discountPrice;
		
		//OUTPUT PART
		
		//Display receipt and results
		System.out.println("");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("ORDER REPORT");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("User: " + userName);
		System.out.println("Item: " + itemName);
		System.out.println("Original Price: $" + originalPrice);
		System.out.println("Discount: " + (DISCOUNT_RATE*100) + "%");
		System.out.println("Discount Amount: $" + discountAmount);
		System.out.println("Discount Price: $" + discountPrice);
		System.out.println("Quantity: " + howMany);
		System.out.println("Total Cost: $" + totalCost);
		System.out.println("");
		
		//Farewell message
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using this program!");
		System.out.println("Stay safe out there!");

		
		//get that Scanner out of here
		input.close();

	}//END main method
}//END class
