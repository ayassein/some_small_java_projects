import java.util.Scanner;
package aa;
public class Aa {
	public static void main(String srgs[]){
		int a[]=new int[10];
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter a number");
		for ( i=0;i<=9;i++)
			a[i]=sc.nextInt();
		System.out.println("the arrey is");
		for ( i=0;i<=9;i++)
		System.out.println(a[i]);
	}
}

}
