// Example 2


package ajaykumar;

import java.awt.*;
public class AJAYKUMAR extends Frame {
  AJAYKUMAR() {
   
     Button btn = new Button("Hello World");
    add(btn);
    setSize(400, 500);
    setTitle("Study Tonight");
    setLayout(new FlowLayout());
    setVisible(true);
  }
  public static void main(String[] args) 
  {
    AJAYKUMAR ta = new AJAYKUMAR();
  }
}
