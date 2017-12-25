public class Triangle
{
  private int sidea, sideb, sidec;
  
  public Triangle(int a, int b, int c)
  {
    sidea=a;
    sideb=b;
    sidec=c;
  }
  
  public void setSides(int a, int b, int c)
  {
    sidea=a;
    sideb=b;
    sidec=c;
  }
  
  public String toString()
  {
    return(sidea + " " + sideb + " " + sidec);
  }
}
