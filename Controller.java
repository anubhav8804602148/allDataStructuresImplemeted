package dataStructure;

public class Controller {
	public static void main(String args[]) {
		Queue<Integer> s1 = new Queue<>(Integer.class);
		for(int i=0;i<10;i++) {
			s1.enqueue(i*i);
		}
		for(int i=0;i<5;i++)System.out.print(s1.dequeue()+" ");
		for(int i=10;i<20;i++) {
			s1.enqueue(i*i);
		}
		for(int i=0;i<50;i++)System.out.print(s1.dequeue()+" ");
	}
}
