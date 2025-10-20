package JavaFrames;
import java.awt.event.*;    
import java.awt.*;    
import javax.swing.*;  

public class ColorChoose extends JFrame implements ActionListener {    
JButton b;    
Container c;    
ColorChoose(){    
    c=getContentPane();    
    c.setLayout(new FlowLayout());         
    b=new JButton("color");    
    b.addActionListener(this);         
    c.add(b);    
}    
