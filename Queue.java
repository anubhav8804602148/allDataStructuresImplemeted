package dataStructure;

import java.lang.reflect.Array;

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
		if(front==-1 || back==-1 || front>maxSize-1) {
			return false;
		}
		
		return false;
	}
}
