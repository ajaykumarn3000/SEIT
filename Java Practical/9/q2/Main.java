class odd extends Thread {
  public void run() {
    for (int i = 1; i < 5; i += 2) {
      System.out.println("odd: " + i);
    }
  }
}

class even extends Thread {
  public void run() {
    for (int i = 0; i < 5; i += 2) {
      System.out.println("even: " + i);
    }
  }
}

class Main {
  public static void main(String args[]) {
    odd a = new odd();
    even b = new even();

    a.start();
    b.start();
  }
}
