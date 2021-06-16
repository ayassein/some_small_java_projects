

class Teacher extends Person{
	private float salary;
	public Teacher(String n,int a,float salary){
		super(n,a);
		this.salary=salary;
	}
	public float getSalary(){
		return salary;
	}
	public void setSalary(float salary){
		this.salary=salary;
	}
	public void print(){
		System.out.println("Name is: "+getName());
		System.out.println("Age is: "+getAge());
		System.out.println("Teacher sallary is: "+getSalary());
	}
}