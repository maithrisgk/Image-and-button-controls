import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class choice extends JFrame
{
choice(int s,String n)
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
JLabel l=new JLabel("NAME");
JLabel l1=new JLabel(n);
JLabel l2=new JLabel("CHOICE");
String ch="";
if (s==1)
 ch = "Apple";
else
  ch = "Orange";
JLabel l3=new JLabel(ch);
c.add(l);
c.add(l1);
c.add(l2);
c.add(l3);} }
