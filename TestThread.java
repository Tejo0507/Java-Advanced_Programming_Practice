package Threading;
class ThreadDemo extends Thread 
{
   ThreadDemo( ) 
   {
   }
   public void run() 
   {
      System.out.println("Thread Name: " + Thread.currentThread().getName() 
         + ", Thread Priority: " +Thread.currentThread().getPriority());
      for(int i = 4; i > 0; i--) 
      {
         System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i); 
      }
      try {
         Thread.sleep(5000);
      
}

