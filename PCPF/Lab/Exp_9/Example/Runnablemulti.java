class Runnablemulti implements Runnable {
  public void run() {
    System.out.println("thread is running...");
  }

  public static void main(String args[]) {
    Runnablemulti m1 = new Runnablemulti();
    Thread t1 = new Thread(m1);
    t1.start();
  }
}