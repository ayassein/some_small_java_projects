package hw;
import java.util.Scanner;
public class Hw {
	public static void main(String args[]){
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of day:");
		a=scan.nextInt();
		switch(a){
		case 1:System.out.println("Saturday");break;
		case 2:System.out.println("Sunday");break;
	  	case 3:System.out.println("Monday");break;
		case 4:System.out.println("Tuesday");break;
		case 5:System.out.println("Wednesday");break;
		case 6:System.out.println("Thursday");break;
		case 7:System.out.println("friday");break;
		default:System.out.println("you enter a wrong number!");
		}
		scan.close();
	} 

}
