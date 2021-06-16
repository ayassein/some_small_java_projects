import java.util.Scanner;
package scan;

public class Ra {
	

	
		public static void main(String args[]){
			int n;
			int a[]=new int[7];
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter 7 number");
			for(int i=0;i<7;i++){
				a[i]=sc.nextInt();
				int temp =0;
				for( i=0;i<7;i++){
					for(int j=1;j<n-i;i++){
						if(a[i-1]>a[i]){
							temp=a[i-1];
							a[i-1]=a[i];
							a[i]=temp;
						}
					}
				}
				for(i=0;i<7;i++){
					System.out.println(a[i]);
				}
			}
		}

	

}
