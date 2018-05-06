	// ----------------------------------------------
	// Assignment 2
	// Written by: Yanqi Zhang  
	// For COMP 248 Section Q – Fall 2017
	// 13/10/2017
	// ----------------------------------------------
import java.util.Scanner;  
public class A2_Q1_Version2 {
	/* WHAT DOES THIS PROGRAM DO?	
	 * ----------------------------
	 * This program corresponds to the numner input by outputing what day of the week 
     * and whether it is a weekday or weekend. 
	 */
	public static void main(String[] args) {
		
		// Keyboard input variable
		Scanner keyboard = new Scanner(System.in);   
		
		// display a welcome message on the screen
		System.out.println("------------------------------");
		System.out.println("  Welcome to Yanqi's Program");
		System.out.println("------------------------------\n");
		
		// prompt ask the user for input 
		System.out.print("Please enter the day of the week as a number (1-7): ");
		int num = keyboard.nextInt( );
		
		//output by using switch
		switch(num)
		{
			case 1: System.out.print("It's Monday! It's a weekday!");
				break;
			case 2: System.out.print("It's Tuesday! It's a weekday!");
				break;
			case 3: System.out.print("It's Wednesday! It's a weekday!");
				break;
			case 4: System.out.print("It's Thursday! It's a weekday!");
				break;
			case 5: System.out.print("It's Friday! It's a weekday!");
				break;
			case 6: System.out.print("It's Saturday! It's the weekend!");
				break;
			case 7: System.out.print("It's Sunday! It's the weekend!");
				break;
			default: System.out.print("That's not a valid day!");
		}
		
		keyboard.close();         // close the scanner object
		
		// display a closing message
		System.out.println("\n\n--------------------------------------");
		System.out.println("Thank you for using Yanqi's program! ");
	}

}
