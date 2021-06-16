package mid1;

public class Q1 {
	public int a,b;
	public void method1(int x,int y){
		a=x;
		b=y;
		
	}
	public void method2(int y,int x){
		a=b+x;
		b=a+y;
	}
	public static void main(String args[]){
		Q1 obj1 =new Q1();
		obj1.method1(10, 20);
		obj1.method2(30,40);
			System.out.println("A:"+obj1.a);
			System.out.println("B:"+obj1.b);
		
	}

}
