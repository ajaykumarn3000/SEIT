class X implements Runnable
{
 public void run()
{
 for (int i=1;i<=10;i++)
	{System.out.println("\t ThreadX "+ i);}
	System.out.println("End of thread X");
}

}

class Y implements Runnable
{
 public void run()
{
 for (int i=1;i<=10;i++)
	{System.out.println("\t ThreadY "+ i);}
	System.out.println("End of thread Y");
}

}

class TestRunnable
{
public static void main(String a[])
	{ X o1= new X();

	Thread tx =new Thread(o1);
	tx.start();

	Y o2= new Y();
	Thread tx1 =new Thread(o2);
	tx1.start();

	System.out.println("End of main");
	}
}