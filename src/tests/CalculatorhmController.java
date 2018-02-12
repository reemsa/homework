package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalculatorhmController {
	public CalculatorhmModal m;
	public CalculatorhmViwe v;
public CalculatorhmController(CalculatorhmModal m,CalculatorhmViwe v){
	this.m=m;
	this.v=v;
	this.v.addactionlistener(new addlistener());
	this.v.subactionlistener(new sublistener());
	this.v.divactionlistener(new divlistener());
	this.v.mulactionlistener(new mullistener());
	this.v.modactionlistener(new modlistener());
	this.v.squactionlistener(new squlistener());
	}
class addlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=0;
		try {
			firstnum=v.getfirstnum();
			secondnum=v.getsecondnum();
			m.add(firstnum, secondnum);
			v.setresult(m.getresult());
		}
		catch(Exception e) {
			System.out.println("you have to enter two integer values");
			 //JOptionPane.showMessageDialog(null, "you have to enter two integer values");
		}
	}
	
}
class sublistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=0;
		try {
			firstnum=v.getfirstnum();
			secondnum=v.getsecondnum();
			m.sub(firstnum, secondnum);
			v.setresult(m.getresult());
		}
		catch(Exception e) {
			System.out.println("you have to enter two integer values");
			// JOptionPane.showMessageDialog(null, "you have to enter two integer values");
		}
	}
	
}
class divlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=0;
		try {
			firstnum=v.getfirstnum();
			secondnum=v.getsecondnum();
			m.div(firstnum, secondnum);
			v.setresult(m.getresult());
		}
		catch(Exception e) {
			System.out.println("you have to enter two integer values");
			// JOptionPane.showMessageDialog(null, "you have to enter two integer values");
		}
	}
	
}
class mullistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=0;
		try {
			firstnum=v.getfirstnum();
			secondnum=v.getsecondnum();
			m.mul(firstnum, secondnum);
			v.setresult(m.getresult());
		}
		catch(Exception e) {
			System.out.println("you have to enter two integer values");
			// JOptionPane.showMessageDialog(null, "you have to enter two integer values");
		}
	}
	
}
class modlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=0;
		try {
			firstnum=v.getfirstnum();
			secondnum=v.getsecondnum();
			m.mod(firstnum, secondnum);
			v.setresult(m.getresult());
		}
		catch(Exception e) {
			System.out.println("you have to enter two integer values");
			// JOptionPane.showMessageDialog(null, "you have to enter two integer values");
		}
	}
	
}
class squlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int firstnum=0;
		try {
			firstnum=v.getfirstnum();
			m.squer(firstnum);
			v.setresult(m.getresult());
		}
		catch(Exception e) {
			System.out.println("you have to enter two integer values");
			// JOptionPane.showMessageDialog(null, "you have to enter two integer values");
		}
	}
	
}
}
