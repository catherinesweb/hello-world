/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: This program calculates the price of sod for the user by calculating area details for their house, pool, and property.
 CREATEDATE: 01/24/2021
*/

//START Package
package edu.cpt167.hillhyman.project3;

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
		
		//Constants
		final double LENGTH_RESTRICTION = 0.50;
		final double WIDTH_RESTRICTION = 0.75;
		final String SOD_NAME_A = "South Carolina Rye";
		final String SOD_NAME_B = "Kentucky Bluegrass";
		final double SOD_PRICE_A = 0.57;
		final double SOD_PRICE_B = 1.47;
		final String HEATER_NAME_A = "Unit A3100";
		final String HEATER_NAME_B = "Unit B8000";
		final String HEATER_NAME_C = "Unit C15000";
		final String HEATER_NAME_D = "Unit D25000";
		final String HEATER_NAME_E = "Unit E25000+";
		final double HEATER_CAP_A = 3100.0;
		final double HEATER_CAP_B = 8000.0;
		final double HEATER_CAP_C = 15000.0;
		final double HEATER_CAP_D = 25000.0;
		final double POOL_DEPTH = 6.0;
		
		//Declared & Initialized Variables
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
		char menuSelection = ' ';
		String sodName = "";
		double sodPrice = 0.0;
		double waterVolume = 0.0;
		String heaterName = "";
		
		//DISPLAY Welcome Banner
		
		System.out.println("Welcome to the Property Program!");
		System.out.println("This program will calculate the cost of sod to cover");
		System.out.println("your property and the correct size of your heating unit.");

		//INPUT
		
		//User Name Input
		System.out.print("\nPlease enter your first name: ");
		userName = input.next();
				
		//Greeting for user
		System.out.println("Hello, " + userName + "!\n");
				
		//Prompt user for length of property
		System.out.print("Enter the length of your property in feet: ");
		propertyLength = input.nextDouble();
		
		//Prompt user for width of property
		System.out.print("Enter the width of your property in feet: ");
		propertyWidth = input.nextDouble();
		
		//Friendly message/instructions for user
		System.out.println("\nNow you may choose which type of sod you would like to purchase!");
		
		//Menu for sod names & prices
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("SOD MENU");
		//Selection for Sod A name & price
		System.out.printf("%-8s%-20s%-2s%4.2f%-12s\n", "[A] for ", SOD_NAME_A, "$", SOD_PRICE_A, "/square foot");
		//Selection for Sod B name & price
		System.out.printf("%-8s%-20s%-2s%4.2f%-12s\n", "[B] for ", SOD_NAME_B, "$", SOD_PRICE_B, "/square foot");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Prompt user for selection
		System.out.print("Enter your selection here: ");
		//Convert character to upper case
		menuSelection = input.next().toUpperCase().charAt(0);
		
		//PROCESS
		
		//Calculate property area
		propertySquareFootage = propertyLength * propertyWidth;
		//Calculate house length
		houseLength = propertyLength * LENGTH_RESTRICTION;
		//Calculate house width
		houseWidth = propertyWidth * WIDTH_RESTRICTION;
		//Calculate house area
		houseSquareFootage = houseWidth * houseLength;
		//Calculate pool length
		poolLength = houseLength * LENGTH_RESTRICTION;
		//Calculate pool width
		poolWidth = houseWidth * WIDTH_RESTRICTION;
		//Calculate pool area
		poolSquareFootage = poolWidth * poolLength;
		
		//Calculate covered area and uncovered area
		coveredSquareFootage = houseSquareFootage + poolSquareFootage;
		uncoveredSquareFootage = propertySquareFootage - coveredSquareFootage;
		
		//SELECTION STRUCTURE 1
		
		//START if selection test for sod
		if (menuSelection == 'A')//test condition
		{
			//assign variable based on user selection
			sodName = SOD_NAME_A;
			sodPrice = SOD_PRICE_A;
		}//END if
		else //last option if test condition is not true
		{
			//assign variable based on user selection
			sodName = SOD_NAME_B;
			sodPrice = SOD_PRICE_B;
		}//END else

		//Calculate sod cost
		sodCost = uncoveredSquareFootage * sodPrice;
		//Calculate water volume
		waterVolume = poolSquareFootage * POOL_DEPTH;
		
		//SELECTION STRUCTURE 2
		
		//START if selection test for heating unit capacity
		if (waterVolume <= HEATER_CAP_A) //test condition
		{
			//assign variables for true result
			heaterName = HEATER_NAME_A;
		}//END 1st if selection
		else if (waterVolume <= HEATER_CAP_B) //START 2nd if & test condition
		{
			//assign variable for true result
			heaterName = HEATER_NAME_B;
		}//END else if
		else if (waterVolume <= HEATER_CAP_C) //START 3rd if & test condition
		{
			//assign variable for true result
			heaterName = HEATER_NAME_C;
		}//END else if
		else if (waterVolume <= HEATER_CAP_D) //START 4th if & test condition
		{
			//assign variable for true result
			heaterName = HEATER_NAME_D;
		}//END else if 
		else //START last selection option
		{
			//assign variable for true result
			heaterName = HEATER_NAME_E;
		}//END else
		
		
		//OUTPUT
		
		//Display results for user
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.print(userName + "'s Property Report");
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		System.out.printf("%-30s%7.1f%-8s\n", "Property Length", propertyLength, " ft");
		System.out.printf("%-30s%7.1f%-8s\n", "Property Width", propertyWidth, " ft");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Property Area", propertySquareFootage, " sq.ft.");

		System.out.printf("%-30s%7.1f%-8s\n", "Design Length Restriction", (LENGTH_RESTRICTION * 100), " %");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Design Width Restriction", (WIDTH_RESTRICTION * 100), " %");
		
		System.out.printf("%-30s%7.1f%-8s\n", "House Length", houseLength, " ft");
		System.out.printf("%-30s%7.1f%-8s\n", "House Width", houseWidth, " ft");
		System.out.printf("%-30s%7.1f%-8s\n\n", "House Area", houseSquareFootage, " sq.ft.");
		
		System.out.printf("%-30s%7.1f%-8s\n", "Pool Length", poolLength, " ft");
		System.out.printf("%-30s%7.1f%-8s\n", "Pool Width", poolWidth, " ft");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Pool Area", poolSquareFootage, " sq.ft.");
		
		System.out.printf("%-30s%-7.1f%6s\n", "Pool Volume", waterVolume, "cu.ft.");
		System.out.printf("%-15s%21s\n\n", "Heater Unit", heaterName);

		System.out.printf("%-30s%7.1f%-8s\n", "Covered Area", coveredSquareFootage, " sq.ft.");
		System.out.printf("%-30s%7.1f%-8s\n\n", "Uncovered Area", uncoveredSquareFootage, " sq.ft.");
		
		System.out.printf("%-26s%-25s\n", "Sod Name", sodName);
		System.out.printf("%-26s%-1s%10.2f\n", "Sod Price (per sq.ft.)", "$", sodPrice);
		System.out.printf("%-26s%-1s%10.2f", "Sod Cost", "$", sodCost);
		
		
		//Farewell message
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using the Property Program!");
		System.out.println("Enjoy the rest of your day!");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		

		//Close Scanner
		input.close();
	}//END Main Method
}//END Class
