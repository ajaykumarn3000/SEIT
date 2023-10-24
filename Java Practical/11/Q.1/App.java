import java.awt.*;
import java.awt.event.*;

class App extends Frame implements ActionListener, MouseListener {
  TextField txtField;
  Button btn;

  App() {
    txtField = new TextField();
    txtField.setBounds(60, 50, 170, 20);

    btn = new Button("Click Me!");
    btn.setBounds(100, 120, 80, 30);
    btn.addActionListener(this);
    btn.addMouseListener(this);

    add(btn);
    add(txtField);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    txtField.setText("Welcome");
  }

  public void mouseEntered(MouseEvent e) {
    btn.setBackground(Color.GREEN);
  }

  public void mouseExited(MouseEvent e) {
    btn.setBackground(Color.WHITE);
  }

  public void mousePressed(MouseEvent e) {
    txtField.setText("mouse pressed");
  }

  public void mouseReleased(MouseEvent e) {
    txtField.setText("mouse released");
  }

  public void mouseClicked(MouseEvent e) {
  }

  public static void main(String args[]) {
    new App();
  }
}