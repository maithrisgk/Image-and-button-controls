import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class fruitsframe extends JFrame implements ActionListener
{
JButton b1;
JButton b2,b3,b4;
JLabel l;
ImageIcon im;
JTextField jtf;
//String sun;
fruitsframe()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
im=new ImageIcon("apple.jpg");
b1=new JButton("apple",im);
b1.addActionListener(this);
im= new ImageIcon("orange.jpg");
b2=new JButton("orange",im);
b2.addActionListener(this);
b3=new JButton("ok");

											
b3.addActionListener(this);
b4=new JButton("CANCEL");
b4.addActionListener(this);
l=new JLabel("NAME");
jtf=new JTextField(20);
c.add(l);
c.add(jtf);
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
}
public void actionPerformed(ActionEvent ae)
{
int sun=1;
//String act=ae.getSource();
System.out.println(ae.getSource());
if(ae.getSource()==b1)
{
sun=1;
}
if(ae.getSource()==b2)
{
sun=2;
												
}
if(ae.getSource()==b3)
{
String s= jtf.getText();
choice cf=new choice(sun,s);
cf.setVisible(true);
cf.setSize(200,200);
}
}
public static void main(String args[])
{
fruitsframe ff=new fruitsframe();
ff.setBounds(1,1,300,300);
ff.setSize(500,500);
ff.setVisible(true);
}
}


