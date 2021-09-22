package dataStructure;


public class Controller {
	public static void main(String args[]) {
		Tree tree = new Tree();
		tree.root = new TreeNode();
		tree.root.left = new TreeNode();
		tree.root.right = new TreeNode();
		tree.root.left.left = new TreeNode();
		tree.root.left.right = new TreeNode();
		tree.root.right.left = new TreeNode();
		tree.root.right.right = new TreeNode();
		tree.root.data = 4;
		tree.root.left.data = 1;
		tree.root.right.data = 3;
		tree.root.left.left.data = 5;
		tree.root.left.right.data = 7;
		tree.root.right.left.data = 0;
		tree.root.right.right.data = 2;
		tree.printTree("PRE");
		System.out.println();
		tree.printTree("POST");
		System.out.println();
		tree.printTree("IN");
	}
}

/*			 4
 * 		    /  \
 *         1    3
 *        / \  / \
 *        5 7  0  2
 */