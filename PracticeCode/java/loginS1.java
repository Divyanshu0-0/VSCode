
import javax.swing.*;
import java.awt.event.*;
class loginS1 extends JFrame
{
JLabel l1,l2;
JTextField l3;
JTextField t1,t2;
JButton b1,b2;

    loginS1 (String s1)
    {
        super(s1);
        setComponents();
    }
    loginS1()
    {
    }
/**
 * 
 */
void setComponents()
{
    l1=new JLabel("Username");
    l2=new JLabel("Password");
    l3=new JTextField();
   
    t1=new JTextField();
    t2=new JTextField();

    b1=new JButton("Login");
    b2=new JButton("Cancel");

    setLayout(null);
    add(l1);
    add(l2);
    add(l3);
    add(t1);    
    add(t2);
    add(b1);
    add(b2);

    l1.setBounds(100,100,100,30);
    l2.setBounds(100,150,100,30);       
    l3.setBounds(200,100,100,30);
    t1.setBounds(200,150,100,30);
    t2.setBounds(200,200,100,30);
    b1.setBounds(100,250,100,30);
    b2.setBounds(200,250,100,30);

    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Add your login logic here
            JOptionPane.showMessageDialog(null, "Login button clicked!");
        }
    });
}
public static void main(String []args) {
    loginS1 l1=new loginS1("Welcome to login page");
    l1.setVisible(true);
    l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l1.setSize(777,777);
    l1.setComponents();
}
}
/*import java.awt.*;
import javax.swing.*;
class loginS1 extends JFrame
{
loginS1 (String s1)
{
super(s1);
}
loginS1()
{
}
    public void static main (String []args)
{
    loginS1 l1=new loginS1("welcome");
    l1.setVisible(true);
    l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l1.setSize(800,800);
}
} */