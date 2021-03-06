//Jimmy Tran
//AP Comp Sci
//1st Period
//October 2012

import java.util.Scanner;

public class QuadraticEquationRunner
{
  public static void main(String[]args)
  {
    //Sets the keyboard as the input device.
    Scanner keyboard = new Scanner(System.in);
    double a, b, c, calc;
    
    //Asks for "a" in the Quadratic Formula.
    System.out.println("What is the coefficient of x^2?");
    a = keyboard.nextDouble();
    
    //Asks for "b" in the Quadratic Formula.
    System.out.println("What is the coefficient of x?");
    b = keyboard.nextDouble();
    
    //Asks for "c" in the Quadratic Formula.
    System.out.println("What is the number without a variable?");
    c = keyboard.nextDouble();
    
    //Creates a Quadratic Equation with given a, b, and c.
    QuadraticEquation QuadTest = new QuadraticEquation (a,b,c);
    
    //Prints out the toString of the QuadraticEquation class.
    System.out.println(QuadTest);
    
    //Returns the discriminate.
    System.out.println("Your discriminate is " + QuadTest.discriminate() + ".");
    
    //Returns number of solutions.
    if (QuadTest.dis > 0)
    {
      System.out.println ("You have two solutions.");
      System.out.println("Your solution through addition is " + QuadTest.getSolution1() + ".");
      System.out.println("Your solution through subtraction is " + QuadTest.getSolution2() + ".");
    }
    else
    {
      if (QuadTest.dis == 0)
      {
         System.out.println ("You have one solution.");
         if (QuadTest.getSolution1() == QuadTest.getSolution2())
         {
           System.out.println("Your solution is " + QuadTest.getSolution1() + ".");
         }
      }
      else
      { System.out.println ("You have no solution."); }
    }
    
    //Returns axis of symmetry.
    System.out.println("Your axis of symmetry is " + QuadTest.axisOfSymmetry() + ".");
  }
}