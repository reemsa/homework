package tests;

import javax.swing.JOptionPane;

public class CalculatorhmModal {
   private int result;
   public int add(int firstnum,int secnum) {
	   result=firstnum+secnum;
	   return result;
   }
   public int sub(int firstnum,int secnum) {
	   result=firstnum-secnum;
	   return result;
   }
   public int mul(int firstnum,int secnum) {
	   result=firstnum*secnum;
	   return result;
   }
   public int div(int firstnum,int secnum) {
	   if(secnum==0) {
		   System.out.println("you can not div over zero");
		   //JOptionPane.showMessageDialog(null, "you can not div over zero");
		   result=-0;
	   }
	   else { result=firstnum/secnum;}
	   return result;
   }
   public int mod(int firstnum,int secnum) {
	   result=firstnum%secnum;
	   return result;
   }
   public int squer(int num) {
	   if(num<0) {
		   System.out.println("you can not find squre root for negative number");
		   //JOptionPane.showMessageDialog(null, "you can not find squre root for negative number");
		   result=-0;
	   }
	   else { result=(int) Math.sqrt(num);
	   
	   }
	   return result;
   }
   public int getresult() {
	   
	return result;
	   
   }
}
