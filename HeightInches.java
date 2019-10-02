//CS200
//Fall, 2019
//Luis Rosales
//Instructor: Y. Gutstein
//HW #2: Numeric Expression and Input
//Due: September 18th, 2019
//File name: HeightInches.java


import java.util.Scanner;

public class HeightInches {// Starts class HeightInches

	public static void main(String args[]){ // Open method main
      Scanner kbd = new Scanner(System.in);//initializing the scanner
      // variables needed
   	int height, feet, inches;
   
   	System.out.print("Enter your height in inches: ");
   	height = kbd.nextInt();// user input
   
   	feet = height / 12; //division arithmetic operation
   	inches = height % 12;// obtaining the remainder mod operator.
   
   	System.out.println("Your height is " + feet + " feet and " + inches + " inches.");
	}
}