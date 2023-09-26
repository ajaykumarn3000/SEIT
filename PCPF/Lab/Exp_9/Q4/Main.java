class Multi extends Thread {
  public void run() {
    System.out.print("Thread id: ");
    System.out.println(Thread.currentThread().getId());
  }
}

class Main {
  public static void main(String[] args) {
    Multi t1 = new Multi();
    Multi t2 = new Multi();
    Multi t3 = new Multi();
    Multi t4 = new Multi();
    Multi t5 = new Multi();

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

  }
}