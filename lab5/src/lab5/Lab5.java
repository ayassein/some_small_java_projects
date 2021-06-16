package lab5;
import java.util.Scanner;
public class Lab5 {
	public static void main(String args[]){
		String Amr ;
		int num;
		char M;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		Amr=sc.nextLine();
		System.out.println("Enter num");
		num=sc.nextInt();
		System.out.println("Enter char");
		M=sc.next().charAt(3);
		sc.close();
		System.out.println("The Name is "+Amr+"\n"+"The Number is "+num+"\n"+"the char is "+M);

}}
