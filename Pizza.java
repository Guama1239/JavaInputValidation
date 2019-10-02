//CS200
//Fall, 2019
//Luis Rosales
//Instructor: Y. Gutstein
//HW #1: Numeric Expression and Input
//Due: September 18th, 2019
//File name: Pizza.java

public class Pizza{ // Starts class Pizza
   public static void main(String args[]){ // open method main
      //all variables needed
      int sizePizzaS = 7, sizePizzaL = 14, numOfPizzaS = 2, numOfPizzaL =1, friends = 5;
      
      double sqInchesPizzaS, sqInchesOf2PizzaS, sqInchesOfPizzaL, 
			 sqInchesOfPizzaMas, radOfPizzaS, radOfPizzaL, pizza4Me;
	
		
		radOfPizzaS = (double)sizePizzaS / 2;//you can take the radius which is half of the diameter
		sqInchesPizzaS = Math.PI * Math.pow(radOfPizzaS, 2.0);//Square the radius and multiply it by PI area of a circle = PI(r^2)
		sqInchesOf2PizzaS = sqInchesPizzaS * 2;
		
		radOfPizzaL = (double)sizePizzaL / 2;//diameter of the pizza divided by 2
		sqInchesOfPizzaL = Math.PI * Math.pow(radOfPizzaL, 2.0);//area = PI(r^2)
		
		System.out.println("Let's get TACOS!!!!...mmmmm. NO");
		System.out.println("TACOS are complicated!! let's get Pizza instead!! ");
		System.out.println("If I order 2 small 7 inch pizzas, I will get :" + sqInchesOf2PizzaS + " square inches of pizza");
      
      
		System.out.println("and I will get " + sqInchesOfPizzaL  
                        + " square inches of pizza when I order " 
								+ numOfPizzaL + " - " + sizePizzaL 
                        + " inch pizza.");
		
		numOfPizzaS = 1;//second part of the problem
		sqInchesOfPizzaMas = sqInchesOfPizzaL - sqInchesPizzaS;;//subtract 7-inch from 14-inch
		System.out.println("I will get " + sqInchesOfPizzaMas  
                        + " square inches more pizza when I order " 
								+ numOfPizzaL + " - " + sizePizzaL 
                        + " inch pizza");
		System.out.println("than I would get from ordering " 
                        + numOfPizzaS + " - " + sizePizzaS  
								+ " inch pizza.");
								
		pizza4Me = sqInchesOfPizzaL / ++friends;;//divide 14-inch pizza by 6 friends eating the pizza
		
		System.out.println("If I order " + numOfPizzaL+ " - " + sizePizzaL 
								+ " inch pizza and share it with " + (friends) + " friends,");
		System.out.println("I will get " + pizza4Me + " square inches to eat by myself.");
		System.out.println("SEE Pizza is not COMPLICATED!!!" + "Let's order PIZZA!.... Where are you going???");
   } // ends method main
} // ends class Pizza