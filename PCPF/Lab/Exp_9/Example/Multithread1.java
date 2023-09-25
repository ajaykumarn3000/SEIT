public class Multithread1 extends Thread {
  public void run() {
  for (int i = 1; i <= 5; i++) {
  System.out.println(" Thread name = "+ Thread.currentThread().getName());
  }
  }
  public static void main(String[] args) {
  Multithread1 t1 = new Multithread1();
  t1.start();
  Multithread1 t2 = new Multithread1();
  t2.start();
  Multithread1 t3 = new Multithread1();
  t3.start();
  }
  }