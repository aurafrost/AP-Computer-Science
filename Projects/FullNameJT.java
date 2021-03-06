//Jimmy Tran
//AP Comp Sci
//1st Period
//Shows your name and three variations of said name.

import java.util.Scanner;


public class FullNameJT
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("What is your first name? :: ");
    String firstName = keyboard.next();
    
    System.out.print("What is your last name? :: ");
    String lastName = keyboard.next();   
    
    
    //Displays one's full name.
    System.out.println("Your full name is " + firstName + " " + lastName + ".");
    
    //Extension 1: Displays one's pirate name by adding boots to the end of the first name.
    System.out.println("Your full pirate name is " + firstName + "boots" + " " + lastName + ".");
    
    //Extension 2: Displays one's wrestling name by adding crusher between in the first name.
    System.out.println("Your full wrestling name is " + firstName.substring(0,3) + "crusher" + firstName.substring(4,5) + " " + lastName + ".");
    
    //Extension 3: A joke.
    System.out.println("Your full name is not " + firstName + " " + lastName + ".");
    System.out.println("You are a liar. You are actually a robot pirate. Your real name is " + firstName + " \"Bootsteel\" " + lastName + ".");
    
    System.out.print(firstName.substring(4,5));
    System.out.print(firstName.substring(3,4));
    System.out.print(firstName.substring(2,3));
    System.out.print(firstName.substring(1,2));
    System.out.print(firstName.substring(0,1));
  }
}  