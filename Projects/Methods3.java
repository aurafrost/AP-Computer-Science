public class Methods3
{
  public void method1()
  {
    System.out.println("method1 called");
  }
  
  public void method2()
  {
    System.out.println("method2 called");
    this.method1();
  }
}
