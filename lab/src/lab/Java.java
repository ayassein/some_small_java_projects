package lab;
import java.util.Scanner;

public class Java {
	public static void main (String args []){
		float l,h,m,avr;
		
		Scanner c =new Scanner (System.in);
		
		System.out.println ("Enter Number 1");
		l=c.nextFloat();
		
		System.out.println ("Enter Number 2");
		h=c.nextFloat();
		
		System.out.println ("Enter Number 3");
		m=c.nextFloat ();
		c.close();
		avr=(l+h+m)/3;
		
		System.out.print("Avrage="+ avr);
		
	}
	

}
