package vector1;

import java.util.Vector;

public class V {

	public static void main(String[] args) {
		Vector v=new Vector(10,5);
		v.add(" Ahmed");
		v.add(true);
		print(v);
		for(int i=0;i<=11;i++)
			v.add(i);
		print(v);
		v.remove(0);
		/*delet posation 0*/
		for(int i=0;i<=11;i++)
			System.out.println(v.get(i));
	}
	public static void print(Vector v){
		/*System.out.println("size is="+v.size());
		System.out.println("capacity="+v.capacity());
		System.out.println("-----------------------");*/
		//System.out.println("My name is"+v.add());

	}

}
