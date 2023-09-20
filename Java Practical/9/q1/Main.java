class A extends Thread  {
  public void run() {
    for(int i = 0; i<10; i++) {
      System.out.println(i+": thread A is running");
    }
  }
}
class B extends Thread  {
  public void run() {
    for(int i = 0; i<10; i++) {
      System.out.println(i+": thread B is running");
    }
  }
}
class C extends Thread  {
  public void run() {
    for(int i = 0; i<10; i++) {
      System.out.println(i+": thread C is running");
    }
  }
}

class Main {
  public static void main(String args[]) {
    A a = new A();
    B b = new B();
    C c = new C();

    a.start();
    b.start();
    c.start();
  }
 }
