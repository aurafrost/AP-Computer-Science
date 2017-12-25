//Jimmy Tran
//AP Comp Sci
//1st Period
//October 2012

public class QuadraticEquation
{
  private double a;
  private double b;
  private double c;
  public double dis;
  
  public QuadraticEquation (double coA, double coB, double coC)
  {
    a = coA;
    b = coB;
    c = coC;
  }
  
  //Solves for the first solution of the Quadratic Equation through addition, if possible. If not, returns NaN.
  public double getSolution1 ()
  {
    return ((-1.0 * b) + (Math.sqrt((Math.pow(b,2) - 4 * a * c)))) / (2 * a);
  }
  
  //Solves for the second solution of the Quadratic Equation through subtraction, if possible. If not, returns NaN.
  public double getSolution2 ()
  {
    return ((-1.0 * b) - (Math.sqrt((Math.pow(b,2) - 4 * a * c)))) / (2 * a);
  }
  
  //Computes the discriminate of the Quadratic Equation.
  public double discriminate ()
  {
    dis = Math.pow(b,2) - (4 * a * c);
    return dis;
  }
  
  //Computes the axis of symmetry of the Quadratic Equation.
  public double axisOfSymmetry ()
  {
    return (-1.0 * b) / (2 * a);
  }
  
  //Returns the Quadratic Equation in the format ax^2 + bx + c.
  public String toString()
  {
    return ("The Quadratic Formula is: " + a + "x^2 + " + b + "x + " + c); 
  }
}