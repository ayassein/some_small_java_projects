package lab;
import java.util.Scanner;

public class Lab52 {
	public static void main(String args[]){
		int n;
		
		Scanner m=new Scanner (System.in);
		System.out.println("Enter any number");
		n=m.nextInt();
		m.close();
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}}
		

}
