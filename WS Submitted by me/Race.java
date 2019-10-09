//CS200
//Spring 2019
//Luis Rosales
//Instructor: Y. Gutstein 
//HW #5: IfElse race
//Due: Week 5 Booleans and IfElse
//File name: Race.java

import java.util.Scanner;

public class Race
{
	public static void main(String[] args)	{
   
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the first runner's name: ");
		String name1 = keyboard.nextLine();
		System.out.print("Enter the first runner's time in minutes: ");
		double time1 = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.print("Enter the second runner's name: ");
		String name2 = keyboard.nextLine();
		System.out.print("Enter the second runner's time in minutes: ");
		double time2 = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.print("Enter the third runner's name: ");
		String name3 = keyboard.nextLine();
		System.out.print("Enter the third runner's time in minutes: ");
		double time3 = keyboard.nextDouble();
		System.out.println();
		double bigT1, smallT2, smallT3;
		String bigN1, smallN2, smallN3;

		double firstTime, secondTime, thirdTime;
		String firstName, secondName, thirdName;
		
		if(time1 > time2){
			bigT1 = time1;
			bigN1 = name1;
			smallT2 = time2;
			smallN2 = name2;
		}
		else{
			bigT1 = time2;
			bigN1 = name2;
			smallT2 = time1;
			smallN2 = name1;
		}

		if(bigT1 > time3){
			thirdTime = bigT1;
			thirdName = bigN1;
			smallT3 = time3;
			smallN3 = name3;
		}
		else{
			thirdTime = time3;
			thirdName = name3;

			smallT3 = bigT1;
			smallN3 = bigN1;
		}

		if(smallT2 > smallT3){
			firstTime = smallT3;
			firstName = smallN3;
			secondTime = smallT2;
			secondName = smallN2;
		}
		else{
			firstTime = smallT3;
			firstName = smallN3;
			secondTime = smallT3;
			secondName = smallN3;
		}

		System.out.println("Results:");
		System.out.println("First place: " + firstName + " - " + firstTime + " minutes");
		System.out.println("Second place: " + secondName + " - " + secondTime + " minutes");
		System.out.println("Third place: " + thirdName + " - " + thirdTime + " minutes");
      
      
	}
}
