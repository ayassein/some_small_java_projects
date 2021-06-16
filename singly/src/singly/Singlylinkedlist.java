package singly;
class node
{
	int data;
	node next;
	public node(int d)
	{
		data=d;
		next=null;
	}
}

public class Singlylinkedlist {
	node head;
	node tail;
	int size;
public Singlylinkedlist()
{
	head=null;
	tail=null;
	size=0;
}
public void addFirst(node newnode)
{
	if(head==null)
	{
		head=newnode;
		tail=newnode;
	}
	else
	{
		newnode.next=head;
		head=newnode;
	}
	size++;
}
public void addLast(node newnode)
{
	if(head==null)
	{
		head=newnode;
		tail=newnode;
	}
	else
	{
		tail.next=newnode;
		tail=newnode;
	}
size++;
}
public void addMid(node newnode,int p)
{
	node t,n;
	if(head==null)
	{
		head=newnode;
		tail=newnode;
	}
	else if(p==1)
	{
		newnode.next=head;
		head=newnode;
	}
	else if(p>size)
	{
		tail.next=newnode;
		tail=newnode;
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
public void print()
{
	node n;
	n=head;
	while(n!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
}
public void delete(int p)
{
	node prev,curr;
	if(head==null)
		System.out.println("The list is empty");
	else if(p<1 || p>size)	
		System.out.println("The position is wrong");
	else if(p==1)	
	{
		head=head.next;
		size--;
	}
	else
	{
		prev=head;
		curr=head;
		while(curr!=null && p>1)
		{
			prev=curr;
			curr=curr.next;
			p--;	
		}
		prev.next=curr.next;
		if(prev.next==null)
			tail=prev;
		size--;	
	}
}
}

class Test
{
	public static void main(String []argv) 
	{
		int i;
		Singlylinkedlist s=new Singlylinkedlist();
		for(i=1;i<=3;i++)
		{
			node n=new node(i);
			s.addFirst(n);
		}
		for(i=4;i<=6;i++)
		{
			node n=new node(i);
			s.addLast(n);
		}
		node n=new node(8);
		s.addMid(n,2);
		s.print();
		s.delete(3);
		System.out.println("-------");
		s.print();
	}
}


