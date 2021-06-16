package queue;
public class CQueue {
	String[] data;
	int size;
	static
	int rear;
	static int front;
	
	
	public CQueue(int n){
		data  = new String[n];
		size=n;
		rear=-1;
		front=-1;
	}
	public static void main(String[] args) {
		CQueue q=new CQueue(3);
		q.enqueue("Ahmed");q.enqueue("Hamza");q.enqueue("Ali");q.enqueue("Ibrahem");
		
		System.out.println("..................");
		
		
			System.out.println("Name Deleted : "+q.dequeue("Ahmed"));
				System.out.println("rear="+rear);
				System.out.println("front="+front);
				System.out.print("*************************");
				q.enqueue("Ahmed");q.enqueue("Ahmed");q.enqueue("Ahmed");q.enqueue("Ahmed");}
	public void enqueue(String d){
		if(full())
			System.out.println("overflow");
		else{
			data[++rear]=d;
			if(rear==size-1)
				rear=-1;
			if (front==-1)
				front=0;
			System.out.println("Name ="+d);
			System.out.println("rear="+rear);
		System.out.println("front="+front);
			}}
	String dequeue(String d){
		
		if(empty())
			System.out.println("underflow");
		else{
			 d=data[front++];
			if(front==size)
				front=0;
			if(front==rear+1){
				rear=-1;
				front=-1;
			}
			return d;
			
		}return d;}
	boolean full(){
		if(front==rear+1)
			return true;
		else{
		return false;
	}}
	boolean empty(){
		if(front==-1)
			return true;
		else{
		return false;
	}}
}
