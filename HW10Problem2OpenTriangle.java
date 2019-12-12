/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW10 Problem 2 due 11/20/2019
* File name: HW10Problem2.java
************/

import java.util.Scanner;

public class HW10Problem2OpenTriangle {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		System.out.print("Enter a triangle height greater than 1: ");
		input = keyboard.nextInt();
		
		for(int row = 1; row <= input; row++){
			for(int col = 1; col <= row; col++){
				if(col == row)
					System.out.print("*");
				else if(col == 1)
					System.out.print("* ");
				else{
					if(row == input)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
