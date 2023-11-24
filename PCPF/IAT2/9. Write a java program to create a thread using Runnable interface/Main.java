class Five implements Runnable {
  public void run() {
    for (int i = 1, j = 5; i <= 10; i++, j += 5) {
      System.out.println("5 x " + i + " = " + j);
    }
  }
}

class Seven implements Runnable {
  public void run() {
    for (int i = 1, j = 7; i <= 10; i++, j += 7) {
      System.out.println("7 x " + i + " = " + j);
    }
  }
}

class Thirteen implements Runnable {
  public void run() {
    for (int i = 1, j = 13; i <= 10; i++, j += 13) {
      System.out.println("13 x " + i + " = " + j);
    }
  }
}

class Main {
  public static void main(String args[]) {
    Five five = new Five();
    Seven seven = new Seven();
    Thirteen thirteen = new Thirteen();

    Thread t1 = new Thread(five);
    Thread t2 = new Thread(seven);
    Thread t3 = new Thread(thirteen);

    t1.run();
    t2.run();
    t3.run();

  }
}