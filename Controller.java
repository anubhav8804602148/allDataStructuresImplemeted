package dataStructure;


public class Controller {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		for(int i=0;i<10;i++) {
			tree.add(i);
		}
		tree.printTree("PRE");
		System.out.println();
		tree.printTree("POST");
		System.out.println();
		tree.printTree("IN");
		System.out.println();
		tree.printTree("LEVEL");
	}
}
