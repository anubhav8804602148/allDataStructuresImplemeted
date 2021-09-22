package dataStructure;

import java.lang.reflect.Array;
/*
 * Queue<RequiredClass> que = new Queue<>(RequiredClass.class);
 * que.enqueue(data) -> enqueued_or_not ? true : false // data should be of RequiredClass type
 * que.dequeue() -> data_available_or_not ? front_data : null
 */
public class Queue <T>{
	private T[] queueArr;
	private int front;
	private int back;
	private int maxSize;
	
	@SuppressWarnings("unchecked")
	Queue(Class<T> obj, int size){
		front = -1;
		back = -1;
		maxSize = size;
		queueArr = (T[])Array.newInstance(obj, size);
		
	}
	@SuppressWarnings("unchecked")
	Queue(Class<T> obj){
		front = -1;
		back = -1;
		maxSize = 100;
		queueArr = (T[])Array.newInstance(obj, 100);
	}
	public boolean enqueue(T data){
		if(front==-1 && back==-1) {
			front=0;
			back=0;
			queueArr[back] = data;
			return true;
		}
		if(front==-1 || back==-1 || back>=maxSize-1) {
			return false;
		}
		back++;
		queueArr[back] = data;
		return true;
	}
	public T dequeue() {
		T res = null;
		if(front==-1 && back==-1) {
			return null;
		}
		if(front==back) {
			res = queueArr[front];
			front=-1;
			back=-1;
			return res;
		}
		res = queueArr[front];
		front++;
		return res;
	}
	public String toString() {
		String res = "<front>";
		for(int i=front;i<=back;i++) {
			res += queueArr[i].toString()+" ";
		}
		res += "<back>";
		return res;
	}
	public int getSize() {
		if(front==-1 && back==-1) return 0;
		return back-front+1;
	}
}
