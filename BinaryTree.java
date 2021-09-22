package dataStructure;

public class BinaryTree extends Tree{

	@Override
	public TreeNode add(int data) {
		Stack<TreeNode> stack = new Stack<>(TreeNode.class);
		if(root==null) {
			root = new TreeNode();
			root.data = data;
		}
		stack.push(root);
		while(stack.getSize()>0) {
			TreeNode curr = stack.pop();
			if(curr.left==null && curr.right==null) {
				if(curr.data>data) {
					curr.left = new TreeNode();
					curr.left.data = data;
					return root;
				}
				else if(curr.data<data) {
					curr.right = new TreeNode();
					curr.right.data = data;
					return root;
				}
				else {
					System.err.println("Duplicate value");
				}
			}
			else if(curr.data>data) {
				if(curr.left==null) {
					curr.left = new TreeNode();
					curr.left.data = data;
					return root;
				}
				else {
					stack.push(curr.left);
				}
			}
			else if(curr.data<data) {
				if(curr.right==null) {
					curr.right = new TreeNode();
					curr.right.data = data;
					return root;
				}
				else {
					stack.push(curr.right);
				}
			}
		}
		return root;
	}
}
