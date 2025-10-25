package Threading;

class GFG implements Runnable 
{
    public void run()
    {
        try 
        {
            Thread.sleep(102);
        }
        catch (InterruptedException i1) 
        {
            i1.printStackTrace();
        }
        System.out.println(
            "The state for t1 after it invoked join method() on thread t2"
            + " " + ThreadState.t1.getState());
        try 
        {
            Thread.sleep(202);
        }
        catch (InterruptedException i2) 
        {
            i2.printStackTrace();
        }
    }
    
public class ThreadState implements Runnable 
{
    public static Thread t1;
    public static ThreadState o1;

    public static void main(String args[])
    {
        o1 = new ThreadState();
        t1 = new Thread(o1);
        System.out.println("post-spanning, state of t1 is"
                           + " " + t1.getState());
        // lets invoke start() method on t1
        t1.start();
        // Now,Thread t1 is moved to runnable state
        System.out.println(
            "post invoking of start() method, state of t1 is"
            + " " + t1.getState());
    }
