package dataStructure;

public class DLinkedList {
	private DNode root;
	private DNode tail;
	public DNode add(int data) {
		if(root==null) {
			root = new DNode();
			root.data = data;
			tail = root;
			return root;
		}
		if(root.next==null) {
			root.next = new DNode();
			root.next.data = data;
			root.next.prev = root;
			tail = root.next;
			return root;
		}
		DNode temp = root;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = new DNode();
		temp.next.data = data;
		temp.next.prev = temp;
		tail = temp.next;
		return root;
	}
	public DNode add(int data, int index) {
		DNode toInsert = new DNode();
		toInsert.data = data;
		if(index==0) {
			if(root==null) {
				root = toInsert;
				tail = root;
				return root;
			}
			toInsert.next = root;
			root.prev = toInsert;
			root = toInsert;
			return root;
		}
		DNode temp = root;
		for(int i=0;i<index-1;i++) {
			try {
				temp = temp.next;
			}
			catch(NullPointerException e) {
				System.err.println("These many records don't exist");
				return root;
			}
		}
		if(temp.next==null) {
			temp.next = toInsert;
			toInsert.prev = temp;
			tail = toInsert;
			return root;
		}
		toInsert.next = temp.next;
		temp.next = toInsert;
		toInsert.prev = temp;
		toInsert.next.prev = toInsert;
		while(tail.next!=null) tail = tail.next;
		return root;
	}
	public DNode remove(int data) {
		DNode temp = root;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		return root;
	}
	public DNode remove(int data, int index) {
		return root;
	}
	public String toString() {
		String res = "Forward : <start>";
		if(root!=null) {
			DNode temp = root;
			while(temp!=null) {
				res += temp.data + " ";
				temp = temp.next;
			}
		}
		res += "<end>\n";
		res += "Backward : <start>";
		if(root!=null) {
			DNode temp = tail;
			while(temp!=null) {
				res += temp.data + " ";
				temp = temp.prev;
			}
		}
		res += "<end>\n";
		return res;
	}
}