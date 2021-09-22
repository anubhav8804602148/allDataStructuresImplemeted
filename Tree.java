package dataStructure;

public class Tree{
	TreeNode root;
	
	public TreeNode add(int data) {
		TreeNode curr = root;
		Queue<TreeNode> queue = new Queue<TreeNode>(TreeNode.class);
		if(root==null) {
			root = new TreeNode();
			root.data = data;
			return root;
		}
		queue.enqueue(curr);
		while(queue.getSize()>0) {
			curr = queue.dequeue();
			if(curr.left==null) {
				 curr.left = new TreeNode();
				 curr.left.data = data;
				 return root;
			}
			if(curr.right==null) {
				curr.right = new TreeNode();
				curr.right.data = data;
				return root;
			}
			queue.enqueue(curr.left);
			queue.enqueue(curr.right);
		}
		
		return root;
	}
	
	public void searchTree(int data, String searchType) {
		switch(searchType) {
		case "BFS":
			breadthFirstSearch(data);
			break;
		case "DFS":
			depthFirstSearch(data);
			break;
		default:
			System.out.println("Invalid type!!");
				
		}
	}
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
			if(temp!=null) {
				System.out.print(temp.data+" ");
				if(temp.left!=null) dataQueue.enqueue(temp.left);
				if(temp.right!=null) dataQueue.enqueue(temp.right);
			}
		}
		
	}
	private TreeNode depthFirstSearch(int data) {
		if(root==null) return root;
		if(root.data==data) return root;
		TreeNode temp = root;
		Stack<TreeNode> stack = new Stack<>(TreeNode.class);
		if(temp.left!=null) stack.push(temp.left);
		if(temp.right!=null) stack.push(temp.right);
		while(stack.getSize()>0) {
			TreeNode curr = stack.pop();
			if(curr.data==data) return curr;
			if(curr.left!=null) stack.push(curr.left);
			if(curr.right!=null) stack.push(curr.right);
		}
		return root;
	}
	private TreeNode breadthFirstSearch(int data) {
		Queue<TreeNode> dataQueue = new Queue<>(TreeNode.class);
		TreeNode curr = root;
		if(curr==null) return curr;
		if(curr.data==data) return curr;
		dataQueue.enqueue(curr.left);
		dataQueue.enqueue(curr.right);
		while(dataQueue.getSize()>0) {
			TreeNode temp = dataQueue.dequeue();
			if(temp!=null) if(curr.data==data) return curr;
			if(temp.left!=null) dataQueue.enqueue(temp.left);
			if(temp.right!=null) dataQueue.enqueue(temp.right);
		}
		return null;
		
	}
}
