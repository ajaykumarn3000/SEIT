import java.awt.*;
import java.awt.event.*;
import java.lang.NumberFormatException;

class App extends Frame implements ActionListener {
  Label result;
  TextField txtField1, txtfield2;
  Button btn_add, btn_sub, btn_mul, btn_div;

  App() {
    txtField1 = new TextField();
    txtField1.setBounds(30, 50, 90, 20);

    txtfield2 = new TextField();
    txtfield2.setBounds(170, 50, 90, 20);

    result = new Label("");
    result.setBounds(135, 80, 100, 20);
    add(result);

    btn_add = new Button("+");
    btn_add.setBounds(100, 120, 30, 30);
    btn_add.addActionListener(this);
    add(btn_add);

    btn_sub = new Button("-");
    btn_sub.setBounds(170, 120, 30, 30);
    btn_sub.addActionListener(this);
    add(btn_sub);

    btn_mul = new Button("*");
    btn_mul.setBounds(100, 180, 30, 30);
    btn_mul.addActionListener(this);
    add(btn_mul);

    btn_div = new Button("/");
    btn_div.setBounds(170, 180, 30, 30);
    btn_div.addActionListener(this);
    add(btn_div);

    add(txtField1);
    add(txtfield2);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "+": {
        btn_add.setBackground(Color.GREEN);
        btn_sub.setBackground(Color.WHITE);
        btn_div.setBackground(Color.WHITE);
        btn_mul.setBackground(Color.WHITE);

        try {
          result.setText("" + (Integer.parseInt(txtField1.getText()) + Integer.parseInt(txtfield2.getText())));
        } catch (java.lang.NumberFormatException error) {
        }
        break;
      }
      case "-": {
        btn_add.setBackground(Color.WHITE);
        btn_sub.setBackground(Color.GREEN);
        btn_div.setBackground(Color.WHITE);
        btn_mul.setBackground(Color.WHITE);
        try {
          result.setText("" + (Integer.parseInt(txtField1.getText()) - Integer.parseInt(txtfield2.getText())));
        } catch (java.lang.NumberFormatException error) {
        }
        break;
      }
      case "*": {
        
        btn_add.setBackground(Color.WHITE);
        btn_sub.setBackground(Color.WHITE);
        btn_div.setBackground(Color.WHITE);
        btn_mul.setBackground(Color.GREEN);
        try {
          result.setText("" + (Integer.parseInt(txtField1.getText()) * Integer.parseInt(txtfield2.getText())));
        } catch (java.lang.NumberFormatException error) {
        }
        break;
      }
      case "/": {
        btn_add.setBackground(Color.WHITE);
        btn_sub.setBackground(Color.WHITE);
        btn_div.setBackground(Color.GREEN);
        btn_mul.setBackground(Color.WHITE);
        try {
          result.setText("" + ((Integer.parseInt(txtField1.getText())*1.0) / Integer.parseInt(txtfield2.getText())));
        } catch (java.lang.NumberFormatException error) {
        }
        break;
      }
      default:
        break;
    }
  }

  public static void main(String args[]) {
    new App();
  }
}