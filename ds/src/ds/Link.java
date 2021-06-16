package ds;
import java.util.Scanner;
public class Link {
	private Node head;
	private Node last;
	private int size;
	public Link(){
		this.head=null;
		this.last=null;
		this.size=0;
	}
 class Node{
	private long id;
	private String name;
	private Node next;
	public Node(){
		this.id=0;
		this.name="";
		this.next=null;
	}
	public Node(long id, String name, Node next){
		this.id=id;
		this.name=name;
		this.next=next;  
		}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}  
 }// end of class Node
 
 public void addFirst(long iD, String name){
	 Node n = new Node(iD, name,head);// create a node in Memory
	 head=n; 
	 size++;
 }
 public void print(){
	 Node ptr=head;
	 while(ptr!= null){
		 System.out.println("Id="+ptr.getId()+"\tname="+ptr.getName());
		 ptr=ptr.getNext();
	 }
 }
 
 public boolean search(int id){
	 Node ptr=head;
	 while(ptr!= null){
		if(id==ptr.getId())
			return true;
		 ptr=ptr.getNext();
	 }
	 return false;
 }
 public boolean search(String name){
	 Node ptr=head;
	 while(ptr!= null){
		//if()
		//	return true;
		 ptr=ptr.getNext();
	 }
	 return false;
 }
 
 public void addLast(Node newnode)
 {
		if(head==null)
		{
			head=newnode;
			last=newnode;
		}
		else
		{
			last.next=newnode;
			last=newnode;
		}
	size++;
	}
 public void addMiddle(Node newnode,int p)

 {
	 
		Node t,n;
		if(head==null)
		{
			head=newnode;
			last=newnode;
		}
		else if(p==1)
		{
			newnode.next=head;
			head=newnode;
		}
		else if(p>size)
		{
			last.next=newnode;
			last=newnode;
		}
		else
		{
			n=head;
			t=head;
			while(n!=null && p>1)
			{
				t=n;
				n=n.next;
				p--;
			}
			newnode.next=t.next;
			t.next=newnode;
		}
		size++;
	}
 public Node deleteFirst(){
	
	 return null; 
 }
 public Node deleteLast(){
		
	 return null; 
 }
 public Node deleteMiddle(){
		
	 return null; 
 }
 public static void main(String[] args) {        
	Link l1= new Link();
	int select=1;long ID;String name;
	Scanner scan = new Scanner(System.in);
	for(;;){
		System.out.println("1_add first 2_add mid 3_add last 4_delet first 5_delet mid 6_delet last  8_print 9_end");
		select=scan.nextInt();
		switch(select){
		case 1: 
			System.out.println("Enter a student ID:");
			ID=scan.nextLong();
			System.out.println("Enter a student name:");
			name=scan.next();
			l1.addFirst(ID,name);
			break;
		case 2:
			System.out.println("Enter a student ID:");
			ID=scan.nextLong();
			System.out.println("Enter a student name:");
			name=scan.next();
			l1.addFirst(ID,name);
			break;
		case 8: l1.print();break;
		case 9:System.exit(0);
		}
	}
	
	}
 
 }//end of class Link