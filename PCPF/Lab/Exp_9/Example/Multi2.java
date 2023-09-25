class Multi2 extends Thread {
  public void run() {
    System.out.println("thread is running...");
    System.out.println(Thread.currentThread().getId() + " " + "is running");
  }

  public static void main(String args[]) {
    Multi2 t1 = new Multi2();
    t1.start();
  }
}