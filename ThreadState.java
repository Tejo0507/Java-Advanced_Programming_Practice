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
