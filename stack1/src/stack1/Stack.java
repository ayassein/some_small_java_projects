package stack1;

public class Stack {
	private char myarray[];
	private int top;
	public Stack(){
		myarray=new char[5];
		top=-1;
	}
	public static void main(String[]args){
		Stack s=new Stack();
		a={
		
	}
	public void push(char x){
		if(!full())
			 myarray[top++];
			else
				System.out.print("overflow");
		}
	public char pop(){
		char ch='';
	}
		if(!empty())
		return myarray[--top] ;
		else
			System.out.print("underflow");
		}
	boolean full()
	{
		return top==5;
	}
	boolean empty(){
		return top==-1;
	}
	public void print(){
		for(int i=top;i>=0;i--)
			System.out.print(myarray[i]);
	}

}
