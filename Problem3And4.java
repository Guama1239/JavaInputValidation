/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 3 and 4 value of independent expressions
* WS4 due 09/25/2019
* File name: Problem3And4.java
************/



public class Problem3And4//class name, file name
{// public is visibility modifiers // static non visibility // void retun type// main: method name // (String[] args) parameters: type: String type: args
   public static void main (String [] args){
      int a = 2, b = 7, m = 6, n =3, o = 14;
      double d = 2.0;
      String c = "Fall";
      // Problem 3
      System.out.println(" Problem 3 Solution ");
      System.out.print(" a + b - m + n = "); 
      System.out.println(  a + b - m + n );
      System.out.print(" n - a + '' + (o -b) = ");
      System.out.println(n - a + "" + (o -b));
      System.out.print(" c + d + (b - m ) + ( o - b ) = ");
      System.out.println(c + d + (b - m ) + ( o - b ));
      System.out.print(" a * b % a + m / n = ");
      System.out.println(a * b % a + m / n);
      System.out.print(" b / a + c + m % n = ");
      System.out.println(b / a + c + m % n);
      // Problem 4
      int u = 2, v = 3, w = 5, x = 7, y = 11;
      String s = "String"; 
      System.out.println(" Problem 4 Solution ");
      System.out.print(" u + v * w + x = ");
      System.out.println(u + v * w + x);
      System.out.print(" u + y % v * w + x = ");
      System.out.println(u + y % v * w + x);
      System.out.print(" u / v * w = ");
      System.out.println(u / v * w);
      System.out.print(" v + s + x / v = ");
      System.out.println(v + s + x / v);      
      // worksheet 09/25/2019 got it shine
      double x1 = 1, x2 = 4, y1 = 2, y2 = 6, num1, num2, square;
      num1 = ((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))); 
      num2 = Math.sqrt(num1);
      System.out.println("Total before square root is " + num1 + "distance is " + num2);
      // worksheet 09/25/2019 problem 2 split the input
      String  word1 = "Goodbye", word2 = "Hello World";
      System.out.println("The length of " + "\"Goodbye\"" + " is " + word1.length());
      System.out.println("The first letter is " + word1.charAt(0));
      System.out.println("The middle letter is " + word1.charAt(word1.length()/2));
      System.out.println("The last letter is " + word1.charAt(word1.length()-1));
   }
}