package dataStructure;

public class LinkedList {
	private Node root;
	
	public Node add(int data){
		if(root==null) {
			root = new Node();
			root.data = data;
			return root;
		}
		if(root.next==null) {
			root.next = new Node();
			root.next.data = data;
			return root;
		}
		Node temp = root;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = new Node();
		temp.next.data = data;
		return root;
	}
	public Node add(int index, int data) {
		Node temp = root;
		if(index==0) {
			Node toInsert = new Node();
			toInsert.data = data;
			toInsert.next = root;
			root = toInsert;
			return root;
		}
		for(int i=0;i<index-1;i++) {
			try {
				temp = temp.next;
			}
			catch(NullPointerException e) {
				System.err.println("These many records don't exist");
				return root;
			}
		}
		Node toInsert = new Node();
		toInsert.data = data;
		toInsert.next = temp.next;
		temp.next = toInsert;
		return root;
	}
	public Node remove() {
		Node temp = root;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		return root;
		
	}
	public Node remove(int index) {
		Node temp = root;
		for(int i=0;i<index-1;i++) {
			try {
				temp = temp.next;
			}
			catch(NullPointerException e) {
				System.err.println("These many records don't exist");
				return root;
			}
		}
		temp.next = temp.next.next;
		return root;
	}
	public String toString() {
		String res = "<start>";
		if(root!=null) {
			Node temp = root;
			while(temp!=null) {
				res += temp.data + " ";
				temp = temp.next;
			}
		}
		res += "<end>";
		return res;
	}
}
