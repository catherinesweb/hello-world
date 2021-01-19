/*
 AUTHOR: Catherine Hill Hyman
 COURSE: CPT167
 PURPOSE: The user of this program can calculate the total area of their property, house, and pool as well as covered and uncovered areas in square footage.
 CREATEDATE: 01/16/2021
*/

//Package thing
package edu.cpt167.hillhyman.project1;

//Import the scanner
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
		
		//INPUT Section
		
		//Welcome Message
		System.out.println("Welcome to your property calculator!");
		System.out.println("This program will calculate the total square footage of your property, house, and pool");
		System.out.println("as well as covered and uncovered areas within your property.");
		System.out.println("");
		
		//Ask name to address user throughout program
		System.out.println("Please enter your first name: ");
		userName = input.nextLine();
		System.out.println("");
		
		//Message to user and prompt to enter input information
		System.out.println("Thank you, " + userName + "!");
		System.out.println("");
		System.out.println("You may now enter the following information in feet.");

		//Length and width inputs for property, house, and pool
		System.out.println("Property Length: ");
		propertyLength = input.nextDouble();
		
		System.out.println("Property Width: ");
		propertyWidth = input.nextDouble();		
		
		System.out.println("House Length: ");
		houseLength = input.nextDouble();		
		
		System.out.println("House Width: ");
		houseWidth = input.nextDouble();		
		
		System.out.println("Pool Length: ");
		poolLength = input.nextDouble();		
		
		System.out.println("Pool Width: ");
		poolWidth = input.nextDouble();
		System.out.println("");		
		
		//Process Section
		
		//Calculate property area
		propertySquareFootage = propertyWidth * propertyLength;
		//Calculate house area
		houseSquareFootage = houseWidth * houseLength;
		//Calculate pool area
		poolSquareFootage = poolWidth * poolLength;
		//Calculate covered area
		coveredSquareFootage = houseSquareFootage + poolSquareFootage;
		//Calculate uncovered area
		uncoveredSquareFootage = propertySquareFootage - coveredSquareFootage;

		//OUTPUT Section

		//Receipt details and results of calculations
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		System.out.println(userName + "'s Property Report:");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		System.out.println("Property Length: " + propertyLength + " ft");
		System.out.println("Property Width: " + propertyWidth + " ft");
		System.out.println("Property Area: " + propertySquareFootage + " sq.ft.");
		
		System.out.println("");
		System.out.println("House Length: " + houseLength + " ft");
		System.out.println("House Width: " + houseWidth + " ft");
		System.out.println("House Area: " + houseSquareFootage + " sq.ft.");
		
		System.out.println("");
		System.out.println("Pool Length: " + poolLength + " ft");
		System.out.println("Pool Width: " + poolWidth + " ft");
		System.out.println("Pool Area: " + poolSquareFootage + " sq.ft.");	
		
		System.out.println("");
		System.out.println("Covered Area: " + coveredSquareFootage + " sq.ft.");
		System.out.println("Uncovered Area: " + uncoveredSquareFootage + " sq.ft.");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
		
		//Farewell
		System.out.println("");
		System.out.println("Thank you, " + userName + ", for using the Property Calculator!");
		System.out.println("Have a great day!");
		System.out.println("~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~ ~~~~");
	
		//Close Scanner
		input.close();
	}//END main method
}//END class
