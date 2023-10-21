import java.awt.*;
public class AJAYKUMAR {
  public static void main(String[] args) 
  {
    Frame f1 = new Frame("Study Tonight => Button Demo");
    Label l1 = new Label("Welcome to studytonight,com");
    l1.setBounds(50, 50, 200, 30);
    
    Label l2 = new Label("This tutorial is of Java");
    l2.setBounds(100, 300, 20, 10);
    
    f1.add(l1);
    f1.add(l2);
    
    Button b1 = new Button("Press Here");
    b1.setBounds(80, 200, 80, 50);
    b1.setBackground(Color.cyan);
    b1.setForeground(Color.red);
    f1.add(b1);
    f1.setBackground(Color.yellow);
    f1.setSize(500,500);
    f1.setLayout(null);
    f1.setVisible(true);
  }
}
