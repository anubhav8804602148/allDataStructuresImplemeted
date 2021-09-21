package dataStructure;

public class Controller {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		for(int i=0;i<10;i++)list.add(i);
		list.add(15,100);
		System.out.println(list.toString());
		list.remove(3);
		list.remove(4);
		System.out.println(list.toString());
	}
}
