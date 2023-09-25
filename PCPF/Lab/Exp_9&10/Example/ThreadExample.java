class A extends Thread
{
 public void run()
 { 
   for(int i=1;i<=5;i++)
	{ System.out.println("\t From thread A :i =" +i); }
	System.out.println("Exit from A");
 }
}

class B extends Thread
{
 public void run()
 { 
   for(int i=1;i<=5;i++)
	{ System.out.println("\t From thread B :i =" +i); }
	System.out.println("Exit from B");
 }
}

class C extends Thread
{
 public void run()
 { 
   for(int i=1;i<=5;i++)
	{ System.out.println("\t From thread C :i =" +i); }
	System.out.println("Exit from C");
 }
}

class ThreadExample
{
	public static void main(String a[])
	{ A obj =new A();

		new A().start();
		new B().start();
		new C().start();
	}
}