package lab6;

public class Persone {
	private String name;
	private int Age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return Age;
	}
	public void setName (String name){
		this.name= name;
	}
	public void setAge (int Age){
		this.Age= Age;
	}
	public void print(){
    System.out.println("Name is " +name + "  " +"age is "+Age);
	}
	
	
	
	
}