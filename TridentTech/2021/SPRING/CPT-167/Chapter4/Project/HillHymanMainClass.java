/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: Users can book a vacation using this program by choosing their desired destination, method of transport, and any additional upgrades. This program will also calculate the total cost of the vacation for the user.
 CREATEDATE: 02/08/2021
*/

//Package
package edu.cpt167.hillhyman.project4;

//Import Scanner
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
		
		
		//CONSTANTS
		final String DESTINATION_NAME_A = "Rome, Italy";
		final String DESTINATION_NAME_B = "London, England";
		final String DESTINATION_NAME_C = "Key West, Florida";
		final String DESTINATION_NAME_Q = "Quit";
		final double DESTINATION_PRICE_A = 1500.00;
		final double DESTINATION_PRICE_B = 750.00;
		final double DESTINATION_PRICE_C = 500.00;
		final String TRANSPORTATION_NAME_A = "Airplane";
		final String TRANSPORTATION_NAME_B = "Ship";
		final double TRANSPORTATION_PRICE_A = 500.00;
		final double TRANSPORTATION_PRICE_B = 250.00;
		final String UPGRADE_NAME_A = "First-class transportation";
		final String UPGRADE_NAME_B = "First-class lodging";
		final String UPGRADE_NAME_C = "Guided tours";
		final String UPGRADE_NAME_D = "All upgraded services";
		final String UPGRADE_NAME_E = "No upgraded services";
		final double UPGRADE_PRICE_A = 75.00;
		final double UPGRADE_PRICE_B = 125.00;
		final double UPGRADE_PRICE_C = 50.00;
		final double UPGRADE_PRICE_D = 200.00;
		final double UPGRADE_PRICE_E = 0.00;
		
		//VARIABLES
		String userName = "";
		char destinationSelection = ' ';
		char transportationSelection = ' ';
		char upgradeSelection = ' ';
		String destinationName = "";
		String transportationName = "";
		String upgradeName = "";
		double lodgingCost = 0.0;
		double transportationCost = 0.0;
		double upgradeCost = 0.0;
		double tripCost = 0.0;
		
		
		//DISPLAY Welcome Banner
		System.out.println("Welcome to the Travel Planning App!");
		System.out.println("Choose your destination, mode of transport, and upgrades");
		System.out.println("to calculate the total cost of your trip!");
		
		//INPUT SECTION
		
		//User name input
		System.out.print("\nWhat is your name? ");
		userName = input.next();
		
		//User greeting
		System.out.println("\nHello, " + userName + "!");
		System.out.println("Let's get started!");
		
		//PRIME READ for Destination
		//MENU for Destination selection
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("DESTINATION MENU");
		System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[A]", DESTINATION_NAME_A, "$", DESTINATION_PRICE_A, "/5 day stay");
		System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[B]", DESTINATION_NAME_B, "$", DESTINATION_PRICE_B, "/5 day stay");
		System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[C]", DESTINATION_NAME_C, "$", DESTINATION_PRICE_C, "/5 day stay");
		System.out.printf("%-5s%-20s\n", "[Q]", DESTINATION_NAME_Q);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Destination selection input
		System.out.print("Enter your selection here: ");
		//Prime Read for selection
		destinationSelection = input.next().toUpperCase().charAt(0);
		
		//START While Validation Loop to test for invalid destination char input
		while (destinationSelection != 'A' && destinationSelection != 'B' && destinationSelection != 'C' && destinationSelection != 'Q')
		{
			//Message for invalid input from user
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("The selection made is invalid. Please try again.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			//Menu for Destination selection again
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("DESTINATION MENU");
			System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[A]", DESTINATION_NAME_A, "$", DESTINATION_PRICE_A, "/5 day stay");
			System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[B]", DESTINATION_NAME_B, "$", DESTINATION_PRICE_B, "/5 day stay");
			System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[C]", DESTINATION_NAME_C, "$", DESTINATION_PRICE_C, "/5 day stay");
			System.out.printf("%-5s%-20s\n", "[Q]", DESTINATION_NAME_Q);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Destination selection input
			System.out.print("Enter your selection here: ");
			//UPDATE Read for selection 
			destinationSelection = input.next().toUpperCase().charAt(0);
		}//END Validation Loop
		//END Prime Read
		
		
		//START Run While Loop while Destination selection is not "Q"
		while (destinationSelection != 'Q')
		{
			//PRIME READ for Transportation
			//MENU for Transportation selection
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("TRANSPORTATION MENU");
			System.out.printf("%-5s%-10s%-3s%-8.2f%4s\n", "[A]", TRANSPORTATION_NAME_A, "$", TRANSPORTATION_PRICE_A, "/seat");
			System.out.printf("%-5s%-10s%-3s%-8.2f%4s\n", "[B]", TRANSPORTATION_NAME_B, "$", TRANSPORTATION_PRICE_B, "/seat");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Transportation selection input
			System.out.print("Enter your selection here: ");
			//Prime Read for selection
			transportationSelection = input.next().toUpperCase().charAt(0);
			
			//START While Validation Loop to test for invalid transportation char input
			while (transportationSelection != 'A' && transportationSelection != 'B')
			{
				//Message for invalid input from user
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("The selection made is invalid. Please try again.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				//MENU for Transportation selection again
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("TRANSPORTATION MENU");
				System.out.printf("%-5s%-10s%-3s%-8.2f%4s\n", "[A]", TRANSPORTATION_NAME_A, "$", TRANSPORTATION_PRICE_A, "/seat");
				System.out.printf("%-5s%-10s%-3s%-8.2f%4s\n", "[B]", TRANSPORTATION_NAME_B, "$", TRANSPORTATION_PRICE_B, "/seat");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				//Transportation selection input
				System.out.print("Enter your selection here: ");
				//UPDATE Read for selection
				transportationSelection = input.next().toUpperCase().charAt(0);
			}//END Validation Loop
			//END Prime Read for Transportation
		
			//PRIME READ for Upgrade
			//MENU for Upgrade selection
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("UPGRADE MENU");
			System.out.printf("%-5s%-29s%1s%8.2f\n", "[A]", UPGRADE_NAME_A, "$", UPGRADE_PRICE_A);
			System.out.printf("%-5s%-29s%1s%8.2f\n", "[B]", UPGRADE_NAME_B, "$", UPGRADE_PRICE_B);
			System.out.printf("%-5s%-29s%1s%8.2f\n", "[C]", UPGRADE_NAME_C, "$", UPGRADE_PRICE_C);
			System.out.printf("%-5s%-29s%1s%8.2f\n", "[D]", UPGRADE_NAME_D, "$", UPGRADE_PRICE_D);
			System.out.printf("%-5s%-29s%1s%8.2f\n", "[E]", UPGRADE_NAME_E, "$", UPGRADE_PRICE_E);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Upgrade selection input
			System.out.print("Enter your selection here: ");
			//Prime Read for selection
			upgradeSelection = input.next().toUpperCase().charAt(0);	
			
			//START While Validation Loop to test for invalid upgrade char input with validation test conditions
			while (upgradeSelection != 'A' && upgradeSelection != 'B' && upgradeSelection != 'C' && upgradeSelection != 'D' && upgradeSelection != 'E')
			{
				//Message for invalid input from user
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("The selection made is invalid. Please try again.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				//MENU for Upgrade selection again
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("UPGRADE MENU");
				System.out.printf("%-5s%-29s%1s%8.2f\n", "[A]", UPGRADE_NAME_A, "$", UPGRADE_PRICE_A);
				System.out.printf("%-5s%-29s%1s%8.2f\n", "[B]", UPGRADE_NAME_B, "$", UPGRADE_PRICE_B);
				System.out.printf("%-5s%-29s%1s%8.2f\n", "[C]", UPGRADE_NAME_C, "$", UPGRADE_PRICE_C);
				System.out.printf("%-5s%-29s%1s%8.2f\n", "[D]", UPGRADE_NAME_D, "$", UPGRADE_PRICE_D);
				System.out.printf("%-5s%-29s%1s%8.2f\n", "[E]", UPGRADE_NAME_E, "$", UPGRADE_PRICE_E);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				//Upgrade selection input
				System.out.print("Enter your selection here: ");
				//UPDATE Read for selection
				upgradeSelection = input.next().toUpperCase().charAt(0);
			}//END Validation Loop
			//END Prime Read for Upgrade
			

			//PROCESS SECTION with selection structures and equations
			
			
			//START if selector to test Destination selection
			if (destinationSelection == 'A')
			{
				//assign variables based on user Destination selection
				destinationName = DESTINATION_NAME_A;
				lodgingCost = DESTINATION_PRICE_A;
			}//END if
			//START else if selector and test condition
			else if (destinationSelection == 'B')
			{
				//assign variables based on user Destination selection
				destinationName = DESTINATION_NAME_B;
				lodgingCost = DESTINATION_PRICE_B;
			}//END else if
			//START else selector for Destination selection
			else
			{
				//assign variables based on user Destination selection
				destinationName = DESTINATION_NAME_C;
				lodgingCost = DESTINATION_PRICE_C;
			}//END else statement
			
			
			//START if selector to test Transportation selection
			if (transportationSelection == 'A')
			{
				//assign variables based on user Transportation selection
				transportationName = TRANSPORTATION_NAME_A;
				transportationCost = TRANSPORTATION_PRICE_A;
			}//END if
			//START else selector for destination rate
			else
			{
				//assign variables based on user Transportation selection
				transportationName = TRANSPORTATION_NAME_B;
				transportationCost = TRANSPORTATION_PRICE_B;
			}//END else statement
			
			
			//START if selector to test Upgrade selection
			if (upgradeSelection == 'A')
			{
				//assign variables based on user Upgrade selection
				upgradeName = UPGRADE_NAME_A;
				upgradeCost = UPGRADE_PRICE_A;
			}//END if
			//START else if selector and test condition
			else if (upgradeSelection == 'B')
			{
				//assign variables based on user Upgrade selection
				upgradeName = UPGRADE_NAME_B;
				upgradeCost = UPGRADE_PRICE_B;
			}//END else if
			//START else if selector and test condition
			else if (upgradeSelection == 'C')
			{
				//assign variables based on user Upgrade selection
				upgradeName = UPGRADE_NAME_C;
				upgradeCost = UPGRADE_PRICE_C;
			}//END else if
			//START else if selector and test condition
			else if (upgradeSelection == 'D')
			{
				//assign variables based on user Upgrade selection
				upgradeName = UPGRADE_NAME_D;
				upgradeCost = UPGRADE_PRICE_D;
			}//END else if
			//START else selector for Upgrade selection
			else
			{
				//assign variables based on user Upgrade selection
				upgradeName = UPGRADE_NAME_E;
				upgradeCost = UPGRADE_PRICE_E;
			}//END else statement


			//Calculate total cost of trip
			tripCost= lodgingCost + transportationCost + upgradeCost;
		
			
			//OUTPUT SECTION
			
			
			//Results Receipt
			System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
			System.out.print("Trip Report");
			System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
			
			System.out.printf("%-25s%-30s\n\n", "Traveler Name", userName);
			
			System.out.printf("%-25s%-30s\n", "Destination Name", destinationName);
			System.out.printf("%-25s%1s%10.2f\n\n", "Lodging Price", "$", lodgingCost);
			
			System.out.printf("%-25s%-30s\n", "Transportation Type", transportationName);
			System.out.printf("%-25s%1s%10.2f\n\n", "Transportation Price", "$", transportationCost);
			
			System.out.printf("%-25s%-30s\n", "Upgrade Selection", upgradeName);
			System.out.printf("%-25s%1s%10.2f\n\n", "Upgrade Price", "$", upgradeCost);
			
			System.out.printf("%-25s%1s%10.2f\n", "Total Trip Cost", "$", tripCost);
			
			System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
			
			
			
			//MODIFY LCV (Update Read)
			//MENU for Destination selection
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("DESTINATION MENU");
			System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[A]", DESTINATION_NAME_A, "$", DESTINATION_PRICE_A, "/5 day stay");
			System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[B]", DESTINATION_NAME_B, "$", DESTINATION_PRICE_B, "/5 day stay");
			System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[C]", DESTINATION_NAME_C, "$", DESTINATION_PRICE_C, "/5 day stay");
			System.out.printf("%-5s%-20s\n", "[Q]", DESTINATION_NAME_Q);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Destination selection input
			System.out.print("Enter your selection here: ");
			//Prime Read for selection
			destinationSelection = input.next().toUpperCase().charAt(0);
			
			//START While Validation Loop to test for invalid Destination char input
			while (destinationSelection != 'A' && destinationSelection != 'B' && destinationSelection != 'C' && destinationSelection != 'Q')
			{
				//Message for invalid input from user
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("The selection made is invalid. Please try again.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				//Menu for Destination selection again
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("DESTINATION MENU");
				System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[A]", DESTINATION_NAME_A, "$", DESTINATION_PRICE_A, "/5 day stay");
				System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[B]", DESTINATION_NAME_B, "$", DESTINATION_PRICE_B, "/5 day stay");
				System.out.printf("%-5s%-20s%-1s%8.2f%13s\n", "[C]", DESTINATION_NAME_C, "$", DESTINATION_PRICE_C, "/5 day stay");
				System.out.printf("%-5s%-20s\n", "[Q]", DESTINATION_NAME_Q);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				//Destination selection input
				System.out.print("Enter your selection here: ");
				//UPDATE Read for selection 
				destinationSelection = input.next().toUpperCase().charAt(0);
			}//END Validation Loop
			//END Prime Read
			
		}//END Run While Loop to close program
		
		//Farewell message
		System.out.println("\n~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println("Thank you for using the Travel Planning App!");
		System.out.println("Enjoy your trip and stay safe out there!");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		
		//Close Scanner
		input.close();		
		
	}//END Main Method

}//END Class
