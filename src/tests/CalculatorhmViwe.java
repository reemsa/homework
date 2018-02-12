package tests;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class CalculatorhmViwe  {
private	JButton b1=new JButton("+");
private	JButton b2=new JButton("-");
private	JButton b3=new JButton("/");
private	JButton b4=new JButton("*");
private	JButton b5=new JButton("%");
private JButton b6=new JButton("sq root");
private	JButton b=new JButton("=");
private	JTextField t1 = new JTextField();
private	JTextField t2 = new JTextField();
private	JTextField re = new JTextField();
	//Constructor
public	CalculatorhmViwe(){
	b.setEnabled(false);
	re.setEnabled(false);
	JFrame frame = new JFrame();
	frame.setSize(400, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
GridLayout experimentLayout = new GridLayout(5,2);
        frame.setLayout(experimentLayout);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b);
        frame.add(re);
        frame.setVisible(true);
        
	 }
public void setresult(int x) {
	re.setText(Integer.toString(x));
}
public int getfirstnum() {
	return Integer.parseInt(t1.getText());
	
}
public int getsecondnum() {
	return Integer.parseInt(t2.getText());
	
}
public int getresultnum() {
	return Integer.parseInt(re.getText());
	
}
public void addactionlistener(ActionListener t) {
	b1.addActionListener(t);
}
public void subactionlistener(ActionListener t) {
	b2.addActionListener(t);
}
public void divactionlistener(ActionListener t) {
	b3.addActionListener(t);
}
public void mulactionlistener(ActionListener t) {
	b4.addActionListener(t);
}
public void modactionlistener(ActionListener t) {
	b5.addActionListener(t);
}
public void squactionlistener(ActionListener t) {
	b6.addActionListener(t);
}
}
