package addremove;

public class Linked {
	private Node first,last;
	
	public Linked(){
		this.first=null;
		this.last=null;
		
	}
	public boolean isEmpty(){
		return first==null;
	}
	class Node{
		private int ID;
		private String name;
		Node next;
		public Node(){
			this.ID=0;
			this.name=null;
			this.next=null;
			}
		public Node(int ID,String name,Node next){
			this.ID=ID;
			this.name=name;
			this.next=next;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
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
		void addFirst(int x,String n){
			Node e=new Node();
			e.setID(x);
			e.setName(n);
			e.setNext(first);
			first=e;
			if(last==null){
				last=first;}}
		void addLast(int x,String n){
			Node e1=new Node();
			e1.setID(x);
			e1.setName(n);
			e1.setNext(last);
			last=e1;
			if(last==null){
				last=last.next;
				e1.setNext()=null;}}
		public void print(){
			Node n=first;
			int i=0;
			while(n!=null){
				System.out.print(i+")ID="+n.getID()+", name;"+n.getName());
				n=n.getNext();
				++i;
			}
		}
			
		}
	public static void main(String[] args) {
		Linked a=new Linked();
		a.addFirst(1,Hello);

	}

}
