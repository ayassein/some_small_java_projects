package lab;
import java.util.Scanner;

public class Array {
	public static void main (String []args){
		Scanner c =new Scanner (System.in);
		
		int a[]=new int[2];
		System.out.println("Enter first number");
		a[0]=c.nextInt();
		
		
		System.out.println("Enter second number");
		a[1]=c.nextInt();
		c.close();
		
		System.out.println(a[0]);
		System.out.println(a[1]);

		
		}


}
