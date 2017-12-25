//Jimmy Tran
//AP Comp Sci
//1st Period

//Computes area and perimeter of a rectangle given length and width.
public class Rectangle
{
  private double length;
  private double width;
  
  //Sets default rectangle.
  public Rectangle()
  {
    length = 1;
    width = 1;
  }
  
  //Sets variables for input.
  public Rectangle(double l, double w)
  {
    length = l;
    width = w;
  }
  
  //Sets length as 1.
  public void setLength(double l)
  {
    length = 1;
  }
  
  //Returns the length.
  public double getLength()
  {
    return length;
  }
  
  //Sets width as 1.
  public void setWidth(double w)
  {
    width = 1;
  }
    
  //Returns the width.
  public double getWidth()
  {
    return width;
  }
  
  //Computes and returns the area.
  public double computeArea()
  {
    return length * width;
  }
  
  //Computes and returns the perimeter.
  public double computePerimeter()
  {
    return 2*length + 2*width;
  }
  
  //Returns length and width and calculates and returns area and perimeter.
  public String toString()
  {
    return ("The length of the rectangle is " + length + ", the width is " + width + ", the area is " + length * width + ", and the perimeter is " + (2 * length + 2 * width));
  }
}