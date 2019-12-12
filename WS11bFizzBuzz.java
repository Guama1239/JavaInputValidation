//CS 200
//FALL 2019
//LUIS ROSALES
//INSTRUCTOR: Y. GUTSTEIN
//WS 11B
//DUE 12-04-2019
//FILE NAME: WS11bFizzBuzz.java

public class WS11bFizzBuzz
{
	public static void main(String[] args)
	{
		String[] vals = fizzBuzz(1, 6);
		for (int i = 0; i < vals.length; i++)
			System.out.print(vals[i] + " ");
		System.out.println();
		
		String[] vals2 = fizzBuzz(10, 16);
		for (int i = 0; i < vals2.length; i++)
			System.out.print(vals2[i] + " ");
		System.out.println();
	}
	
	public static String[] fizzBuzz(int start, int end)
	{
		String[] array = new String[(end - start)];
		for (int i = start; i < end; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
				array[i - start] = "FizzBuzz";
			else if (i % 3 == 0)
				array[i - start] = "Fizz";
			else if (i % 5 == 0)
				array[i - start] = "Buzz";
			else
				array[i - start] = String.valueOf(i);
		}
		return array;
	}
}