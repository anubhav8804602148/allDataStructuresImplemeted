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
}
