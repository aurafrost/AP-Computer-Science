//scanner int example

import java.util.Scanner;


public class ScannerInts
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter an short number(-33768 to 32767) :: ");
    int shorty = keyboard.nextInt();
    System.out.println(shorty);
    
    System.out.print("Enter an int number(-2billion to 2billion) :: ");
    int inty = keyboard.nextInt();
    System.out.println(inty);
  }
}  