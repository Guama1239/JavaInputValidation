/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* #2 Operations
* HW 05 06 due 10/09/2019
* File name: Operations.java
************/

//import java.util.Scanner;

public class Operations
{
	public static void main(String[] args)
	{
		int c = 3729, d = 22, e = 34, f = 67;
		System.out.println(e + " * " + f + " is " + multiply(e, f));
		System.out.println(c + " / " + d + " is " + divide(c, d));
	}
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int subtract(int a, int b)
	{
		return add(a, -1 * b);
	}
   
   public static int multiply(int a, int b)
   {
      int accumulator = 0;
      for (int i = 1; i <= b; i++){
         accumulator = add(accumulator, a);
      }
      return accumulator;
   }
   
   public static int divide(int a, int b)
   {
      int sub = a;
      int i = 0;
      while (sub <= b) {
         i++;
         sub = subtract(sub, b);
      }
      return i;
   }

}