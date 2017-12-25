//Jimmy Tran
//AP Comp Sci
//1st Period

public class Point
{
  private double x;
  private double y;
  
  //Sets default points.
  public Point ()
  {
    x = 1;
    y = 1;
  }
    
  //Calculates the Manhattan Distance.
  public double manhattanDistance(Point input)
  {
    return Math.abs(input.x-x) + Math.abs(input.y-y);
  }
  
  public boolean isVertical(Point input)
  {
    if(x == input.x)
    {
      return true;
    }
    
    else
    {
      return false;
    }
  }
  
  public boolean isHorizontal(Point input)
  {
    if(y == input.y)
    {
      return true;
    }
    
    else
    {
      return false;
    }
  }
  
  public double slope(Point input)
  {
    return (input.y-y)/(input.x-x);
  }
  
  public double distance(Point input)
  {
    return Math.sqrt((Math.pow((input.x-x),2) + Math.pow((input.y-y),2)));
  }
  
  public String toString(Point input)
  {
    return ("The points are " + "(" + x + "," + y + ")" + "and (" + input.x + "," + input.y + ").");
  }
}