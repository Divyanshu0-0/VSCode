import javax.swing.*;
import java.awt.*;
class login
{
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Login Form");
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);

        JButton b1 = new JButton("Click Here");
        b1.setBounds(100, 100, 200, 50);
        b1.setCursor(c1);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 200, 200, 50);
        f1.setBounds(0, 0, 400, 400);
        f1.setLayout(null);
        f1.add(b1);
        f1.add(t1);
    }
}
