// Example 1

import java.awt.*;
public class TestAWT {
  TestAWT() {
    Frame fm = new Frame();
    Label lb = new Label("welcome to java graphics");
    fm.add(lb);
    fm.setSize(300,300);
    fm.setVisible(true);
  }
  public static void main(String[] args) 
  {
    TestAWT ta = new TestAWT();
  }
}