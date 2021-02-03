/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: This program calculates the price of sod for the user by calculating area details for their house, pool, and property.
 CREATEDATE: 01/24/2021
*/

//START Package
package edu.cpt167.hillhyman.project2;

//Import the scanner
import java.util.Scanner;

//START Class
public class HillHymanMainClass 
{

	//START Main Method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Constants, Declared, and Initialized Variables
		final double LENGTH_RESTRICTION = 0.50;
		final double WIDTH_RESTRICTION = 0.75;
		final double SOD_PRICE = 1.39;
		String userName = "";
		double propertyLength = 0.0;
		double propertyWidth = 0.0;
		double propertySquareFootage = 0.0;
		double houseLength = 0.0;
		double houseWidth = 0.0;
		double houseSquareFootage = 0.0;
		double poolLength = 0.0;
		double poolWidth = 0.0;
		double poolSquareFootage = 0.0;
		double coveredSquareFootage = 0.0;
		double uncoveredSquareFootage = 0.0;
		double sodCost = 0.0;
		
		//DISPLAY Welcome Banner
		System.out.println("Welcome to the Sod Program!");
		System.out.println("This program will calculate the cost of sod to cover");
		System.out.println("your property by entering details about its size.");

		//INPUT
		
		//User Name Input
		System.out.print("\nPlease enter your first name: ");
		userName = input.next();
				
		//Greeting for user
		System.out.println("Hello, " + userName + "!\n");
				
		//Ask item name
		System.out.print("Please enter the length of your property in feet: ");
		propertyLength = input.nextDouble();
		System.out.print("Now enter the width of your property in feet: ");
		propertyWidth = input.nextDouble();
		
		//Process Section
		
		//Calculate additional property, house, and pool details
		propertySquareFootage = propertyLength * propertyWidth;
		houseLength = propertyLength * LENGTH_RESTRICTION;
		houseWidth = propertyWidth * WIDTH_RESTRICTION;
		houseSquareFootage = houseWidth * houseLength;
		poolLength = houseLength * LENGTH_RESTRICTION;
		poolWidth = houseWidth * WIDTH_RESTRICTION;
		poolSquareFootage = poolWidth * poolLength;
		
		//Calculate covered area and uncovered area
		coveredSquareFootage = houseSquareFootage + poolSquareFootage;
		uncoveredSquareFootage = propertySquareFootage - coveredSquareFootage;
		
		//Calculate sod cost
		sodCost = uncoveredSquareFootage * SOD_PRICE;
		
		//OUTPUT
		
		//Display results for user
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.print(userName + "'s Property Report");
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		System.out.printf("%-30s%7.1f%-8s\n", "Property Length", propertyLength, " ft");
		System.out.printf("%-30s%7.1f%-8s\n", "Property Width", propertyWidth, " ft");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Property Area", propertySquareFootage, " sq.ft.");

		System.out.printf("%-30s%7.1f%-8s\n", "Design Length Restriction", (LENGTH_RESTRICTION * 100), "%");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Design Width Restriction", (WIDTH_RESTRICTION * 100), "%");
		
		System.out.printf("%-30s%7.1f%-8s\n", "House Length", houseLength, " ft");
		System.out.printf("%-30s%7.1f%-8s\n", "House Width", houseWidth, " ft");
		System.out.printf("%-30s%7.1f%-8s\n\n", "House Area", houseSquareFootage, " sq.ft.");
		
		System.out.printf("%-30s%7.1f%-8s\n", "Pool Length", poolLength, " ft");
		System.out.printf("%-30s%7.1f%-8s\n", "Pool Width", poolWidth, " ft");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Pool Area", poolSquareFootage, " sq.ft.");

		System.out.printf("%-30s%7.1f%-8s\n", "Covered Area", coveredSquareFootage, " sq.ft.");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Uncovered Area", uncoveredSquareFootage, " sq.ft.");
		
		System.out.printf("%-29s%-2s%-7.2f", "Sod Cost", "$", sodCost);
		
		
		//Farewell message
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using the Sod program!");
		System.out.println("Have a nice day!");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		
		//Close Scanner
		input.close();
	}//END Main Method
}//END Class
