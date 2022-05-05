public class Q2Linked{
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
		Node head=null;
		Node tail=null;
		void addNode(int d){
			Node newNode= new Node(d);
			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
		}
		
		static Node reverse(Node head){
			if(head==null){
				return null;
			}
			if(head.next==null){
				return head;
			}
			Node previous=null;
			Node current=head;
			Node nextnode=null;
			while(current!=null){
				nextnode=current.next;
				current.next=previous;
				previous=current;
				current=nextnode;
			}
			head=previous;
			return head;
		}
		
		static void display(Node head){
			Node n=head;
			if(head==null){
				System.out.println("List is empty");
				return;
			}
			while(n!=null){
				System.out.print(n.data + " ");
				n=n.next;
			}
			System.out.println();
		}
	public static void main(String[] args){
	Q2Linked slist1=new Q2Linked();
	Q2Linked slist2=new Q2Linked();
	slist1.addNode(1);
	slist1.addNode(2);
	slist1.addNode(3);
	slist1.addNode(4);
	slist1.addNode(5);
	Node list1=reverse(slist1.head);
	display(list1);
	slist2.addNode(3);
	slist2.addNode(4);
	slist2.addNode(2);
	slist2.addNode(5);
    Node list2=reverse(slist2.head);
	display(list2);
	}
}