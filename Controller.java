package dataStructure;

public class Controller {
	public static void main(String args[]) {
		Stack<Integer> s1 = new Stack<>(Integer.class);
		for(int i=0;i<20;i++) {
			s1.push(i*i);
		}
		System.out.print(s1.toString());
	}
}
