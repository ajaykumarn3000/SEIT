class Welcome extends Thread {
  private String msg;

  Welcome(String msg) {
    this.msg = msg;
  }

  public void run() {
    System.out.println(msg);
  }
}
class Main {
  public static void main(String[] args) {
    Welcome t1 = new Welcome("Welcome to SFIT");
    Welcome t2 = new Welcome("Welcome to IT");

    t1.start();
    t2.start();
  }
}
