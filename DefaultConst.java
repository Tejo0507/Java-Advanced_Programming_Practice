package Constructor;
public class DefaultConst 
{
    int myInt;
    String myString;
    // Default constructor
    public DefaultConst() 
    {
      myInt = 0;
      myString = "default";
    }
    public void display() 
    {
      System.out.println("myInt = " + myInt);
      System.out.println("myString = " + myString);
    }
    public static void main(String[] args) 
    {
        DefaultConst obj = new DefaultConst();
      obj.display();
    }
}
