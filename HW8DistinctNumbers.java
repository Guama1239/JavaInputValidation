/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW 8 Arrays Problem 3 due 11/06/2019
* File name: HW8DistinctNumbers.java
************/

import java.util.Scanner;

public class HW8DistinctNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];
		System.out.print("Enter 10 numbers: ");
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = input.nextInt();
		}
		
		int[] uniqueNums = new int[array.length];
		uniqueNums[0] = array[0];
		int count = 1;
		
		for (int index = 1; index < array.length; index++) {
			
			boolean isDistinct = true;
			int num = 0;	
			while (num < count && isDistinct) 
			{
				if (uniqueNums[num] == array[index]) 
				{
					isDistinct = false;
				}
				num++;
			}
			
			if (isDistinct) 
			{
				uniqueNums[count] = array[index];
				count++;
			}	
		}
		
		System.out.println("The number of distinct numbers is: " + count);
		System.out.print("The distinct numbers are: ");
		for (int index = 0; index < count; index++) 
		{
			System.out.print(uniqueNums[index] + " ");
		}
		System.out.println();
		
	}
}