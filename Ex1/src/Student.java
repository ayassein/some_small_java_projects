


class Student extends Person{
	private int id;
	public Student(String n,int a, int id){
		super(n,a);
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public void print()
	{
		System.out.println("Name is: "+getName());
		System.out.println("Age is: "+getAge());
		System.out.println("Student id is: "+getId());
}
}

