// Create a thread t1 by implementing runnable interface to display “Hello world” message

class Msg implements Runnable {
  public void run() {
    System.out.println("Hello World");
  }
}

class Main {
  public static void main(String[] args) {
    Msg msg = new Msg();
    Thread t1 = new Thread(msg);
    t1.start();
  }
}