/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: The user of this program can calculate the total cost of sod purchased while considering the tax and discount rates, as well as how many bags of sod were purchased.
 CREATEDATE: 01/21/2021
*/

//Package
package edu.cpt167.hillhyman.exercise2;

//Import scanner
import java.util.Scanner;

//START class
public class HillHymanMainClass 
{

	//START main method
	public static void main(String[] args) 
	{
		
		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Declared and Initialized Variables
		final double DISCOUNT_RATE = 0.25;
		final double TAX_RATE = 0.75;
		String userName = "";
		String itemName = "";
		double originalPrice = 0.0;
		int howMany = 0;
		double discountAmount = 0.0;
		double discountPrice = 0.0;
		double subTotal = 0.0;
		double tax = 0.0;
		double totalCost = 0.0;
		
		//Welcome Message
		System.out.println("Welcome to The Sod Store's Calculator!");
		System.out.println("This program will calculate the total cost of items,");
		System.out.println("and then apply a discount rate as well as the tax rate.");
		
		//INPUT
		
		//username input
		System.out.print("\nPlease enter your first name: ");
		userName = input.next();
		
		System.out.println("input accepted");
		
		//Greeting for user
		System.out.println("Hello, " + userName + "!\n");
		
		//Ask item name
		System.out.print("What is the name of the item to be purchased? ");
		itemName = input.next();
		System.out.println("input accepted");
		
		//Ask item price
		System.out.print("What is the price of the item? $");
		originalPrice = input.nextDouble();
		System.out.println("input accepted");
		
		//Ask number of items
		System.out.print("How many items are to be purchased? ");
		howMany = input.nextInt();
		System.out.println("input accepted");
		
		//PROCESS
		
		//Calculate discount for item
		discountAmount = originalPrice * DISCOUNT_RATE;
		//Calculate discount price
		discountPrice = originalPrice - discountAmount;
		//Calculate cost before tax
		subTotal = howMany * discountPrice;
		//Calculate tax
		tax = subTotal * TAX_RATE;
		//Calculate total cost including tax
		totalCost = subTotal + tax;
		
		//OUTPUT PART
		
		//Display receipt and results
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("ORDER REPORT");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.printf("\n%-18s%-20s\n", "User", userName);
		System.out.printf("%-18s%-20s\n", "Item Name", itemName);
		System.out.printf("%-18s%-4s%7.2f\n", "Original Price", "$", originalPrice);
		System.out.printf("%-18s%10.1f%1s\n", "Discount", (DISCOUNT_RATE*100), " %");
		System.out.printf("%-18s%-4s%7.2f\n", "Discount Amount", "$", discountAmount);
		System.out.printf("%-18s%-4s%7.2f\n", "Discount Price", "$", discountPrice);
		System.out.printf("%-18s%11d\n", "Quantity", howMany);
		System.out.printf("%-18s%-4s%7.2f\n", "Subtotal", "$", subTotal);
		System.out.printf("%-18s%-4s%7.2f\n", "Tax", "$", tax);
		System.out.printf("%-18s%-4s%7.2f\n", "Total Cost", "$", totalCost);
		
		//Farewell message
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using this program!");
		System.out.println("Good bye!");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		//END Scanner
		input.close();

	}//END main method
}//END class
