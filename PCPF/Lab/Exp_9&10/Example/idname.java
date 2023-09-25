public class idname extends Thread
{
public void run()
{
System.out.println("Running");
}
public static void main(String args[])
{
idname t1=new idname();
System.out.println("The name of t1 is:"+t1.getName());
System.out.println("The id of t1 is:"+t1.getId());
t1.start();
}//close main 
} //close class