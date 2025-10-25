package Threading;
class NewThread implements Runnable 
{  
    String name;  
    Thread thread;  
    NewThread (String name)
    {  
        this.name = name;   
        thread = new Thread(this, name);  
        System.out.println( "A New thread: " + thread+ "is created\n" );  
        thread.start();  
    }  
