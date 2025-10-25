package Threading;

public class ThreadPriorityExample extends Thread   
{   
public void run()  
{  
System.out.println("Inside the run() method");  
}  
public static void main(String argvs[])  
{  
ThreadPriorityExample th1 = new ThreadPriorityExample();  
ThreadPriorityExample th2 = new ThreadPriorityExample();  
ThreadPriorityExample th3 = new ThreadPriorityExample();  
