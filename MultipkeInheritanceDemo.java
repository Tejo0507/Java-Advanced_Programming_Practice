package Interface;
interface InterfaceA
{
    int val=100;
    void methodA();
}

interface InterfaceB
{
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB
{
    public void methodA()
    {
        System.out.println("Method A from Interface A "+val);
    }
    public void methodB()
    {
        System.out.println("Method B from Interface B");
    }
}

public class MultipleInheritanceDemo
{
    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
