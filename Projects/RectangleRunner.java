import java.util.Scanner;

public class RectangleRunner
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    double length, width;
    
    //Asks for length.
    System.out.println("Enter length.");
    length = keyboard.nextDouble();
    
    //Asks for width.
    System.out.println("Enter width.");
    width = keyboard.nextDouble();
    
    //Creates a new rectangle with given length and width.
    Rectangle userRect = new Rectangle (length,width);
    
    //Returns the dimensions of the rectangle.
    System.out.println(userRect);
  }
}