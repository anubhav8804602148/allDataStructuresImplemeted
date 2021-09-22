package dataStructure;

import java.util.HashMap;

public class BinaryTree extends Tree{
	HashMap<TreeNode, Integer> hm;
	public TreeNode balanceTree() {
		hm = new HashMap<TreeNode, Integer>();
		updateDepth(root, 0);
		
		return root;
	}
	public void updateDepth(TreeNode node, int depth) {
		hm.put(node, depth);
		if(node.left!=null) updateDepth(node.left, depth+1);
		if(node.right!=null) updateDepth(node.right, depth+1);
	}
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
			if(curr.data==data) {
				System.err.println("Duplicate value " + data + " at "+curr.toString());
			}
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
