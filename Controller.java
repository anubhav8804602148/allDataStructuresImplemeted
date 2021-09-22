package dataStructure;

import java.util.HashMap;
import java.util.Random;

public class Controller {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Random ran = new Random();
		for(int i=1;i<=20;i++) {
			tree.add(ran.nextInt(20));
		}
		tree.printTree("PRE");
		System.out.println();
		tree.printTree("POST");
		System.out.println();
		tree.printTree("IN");
		System.out.println();
		tree.printTree("LEVEL");
		tree.balanceTree();
		HashMap<TreeNode, Integer> hm = tree.hm;
		for(TreeNode tn : hm.keySet()) {
			System.out.println(tn.data + " has depth " + hm.get(tn));
		}
	}
}
