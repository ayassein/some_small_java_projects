package lab;
import java.util.Scanner;


public class Man {
	public static void main(String []args){
		int a;
		int b;
		int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1");
		a=sc.nextInt();
		
		System.out.println("Enter Number 2");
		b=sc.nextInt();
		sc.close();
		sum=a+b;
		System.out.print("Sum=" + sum );
		

	}

}
