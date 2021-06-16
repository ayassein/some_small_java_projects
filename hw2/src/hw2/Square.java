package hw2;

public class Square {
	int a;
	void setA(int a){
		this.a=a;
	}
	int getA()
	{
		return a;
	}
	Square(){
		this.a=5;
	}
	Square(int l){
		l=a;
	}
	public String toString(){
		return "a="+a;
	}
Boolean equals(Square B){
		return(this.a==B.a);
	}
	void print(){
		System.out.println(toString());
		System.out.println("Area="+getArea());
		System.out.println("Perimiter="+getPerimiter());
		
		}
	
	int getArea(){
		return a*a;
	}
	int getPerimiter(){
		return a*4;
	}

}
