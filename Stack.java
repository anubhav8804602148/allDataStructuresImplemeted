package dataStructure;

import java.lang.reflect.Array;

public class Stack<T> {
	
	private T[] stackArr;
	private int top;
	private int maxSize;
		
	@SuppressWarnings("unchecked")
	Stack(Class<T> obj, int size){
		maxSize = size;
		stackArr = (T[]) Array.newInstance(obj, size);
		top = -1;
	}
	@SuppressWarnings("unchecked")
	Stack(Class<T> obj){
		maxSize = 100;
		stackArr = (T[]) Array.newInstance(obj, 100);
		top = -1;
	}
	@SuppressWarnings("unchecked")
	Stack(){
		maxSize = 100;
		stackArr = (T[]) Array.newInstance(Integer.class, 100);
		top = -1;
	}
	public boolean push(T data) {
		if(top<maxSize-1) {
			top++;
			stackArr[top] = data;
			return true;
		}
		return false;
	}
	public T pop() {
		if(top!=-1) {
			T res = stackArr[top];
			top--;
			return res;
		}
		return (T) null;
	}
	public String toString() {
		String res = "<top>\n";
		for(int i=top;i>=0;i--) res += stackArr[i].toString()+"\n";
		res += "<bottom>\n";
		return res;
	}
}
