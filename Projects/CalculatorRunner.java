import java.util.Scanner;

public class CalculatorRunner
{  
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int x, y;
    
    System.out.println ("Enter x integer.");
    x = keyboard.nextInt();
    
    System.out.println ("Enter y integer.");
    y = keyboard.nextInt();
    
    Calculator myCal = new Calculator (x, y);
    System.out.println (myCal);
  }
}