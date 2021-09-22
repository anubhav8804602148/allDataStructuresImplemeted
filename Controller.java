package dataStructure;


public class Controller {
	public static void main(String args[]) {
		DLinkedList dlist = new DLinkedList();
		for(int i=0;i<10;i++) {
			dlist.add(i,i);
			System.out.println(dlist.toString());
		}
		
	}
}
