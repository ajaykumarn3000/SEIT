class A extends Thread {
  public void run() {
    System.out.println("Current Thread ID: "+ this.getId());
  }
}
class Main {
  public static void main(String[] args) {
    A a = new A();
    a.start();
  } 
}