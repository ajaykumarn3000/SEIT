public class JavaGetPriorityExp extends Thread  
{    
    public void run()  
    {    
        System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        // creating two threads  
        JavaGetPriorityExp t1 = new JavaGetPriorityExp();    
        JavaGetPriorityExp t2 = new JavaGetPriorityExp();    
        // print the default priority value of thread  
        System.out.println("t1 thread priority : " + t1.getPriority());   
        System.out.println("t2 thread priority : " + t2.getPriority());  
        // this will call the run() method  
        t1.start();    
        t2.start();  
    }    
}