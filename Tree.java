package dataStructure;

public class Tree{
	TreeNode root;
	
	public void printTree(String traversalType) {
		switch(traversalType) {
		case "PRE":
			traversalPre(root);
			break;
		case "POST":
			traversalPost(root);
			break;
		case "IN":
			traversalIn(root);
			break;
		case "LEVEL":
			traversalLevel(root);
			break;
		default:
			System.err.println("Invalid Choice!!");
		}
	}
	private void traversalPre(TreeNode curr) {
		if(curr==null) return;
		System.out.print(curr.data + " ");
		traversalPre(curr.left);
		traversalPre(curr.right);
	}
	private void traversalPost(TreeNode curr) {
		if(curr==null) return;
		traversalPost(curr.left);
		traversalPost(curr.right);
		System.out.print(curr.data + " ");
	}
	private void traversalIn(TreeNode curr) {
		if(curr==null) return;
		traversalIn(curr.left);
		System.out.print(curr.data + " ");
		traversalIn(curr.right);
	}
	private void traversalLevel(TreeNode curr) {
		Queue<TreeNode> dataQueue = new Queue<>(TreeNode.class);
		if(curr==null) return;
		System.out.print(curr.data + " ");
		dataQueue.enqueue(curr.left);
		dataQueue.enqueue(curr.right);
		while(dataQueue.getSize()>0) {
			TreeNode temp = dataQueue.dequeue();
			if(temp!=null)System.out.print(temp.data+" ");
			if(temp.left!=null) dataQueue.enqueue(temp.left);
			if(temp.right!=null) dataQueue.enqueue(temp.right);
		}
		
	}
}
