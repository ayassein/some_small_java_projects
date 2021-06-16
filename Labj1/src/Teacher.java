
public class Teacher extends Person {
	public double salary;
	Teacher(String n,int a,double s){
		super(n,a);
		salary=s;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void print(){
		System.out.println("Name is "+ getName());
		System.out.println("Age is "+ getAge());
		System.out.println("Salary is "+ getSalary());
	}

}
