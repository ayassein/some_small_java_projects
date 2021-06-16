import java.util.Scanner; 
class Ar {
	public static void main( String args []) 
	{ 
	 Scanner x = new Scanner(System.in); 
	 int a [ ] = new int[10]; 
	 System.out.println("enter 10 numbers"); 
	 for(int i=0; i<10 ;i++) 
	 a[i] =  x.nextInt(); 
	 x.close();
	  System.out.println("the even numbers ="); 
	 for(int i=0; i<10;i++) 
	 { 
	 if(a[i]%2==0) 
	 System.out.println(a[i]);   
	}}}