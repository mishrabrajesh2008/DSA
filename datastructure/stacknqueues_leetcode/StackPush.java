package stacknqueues_leetcode;

import java.util.ArrayList;
import java.util.List;

public class StackPush<T> {
	
private ArrayList<T> stackList = new ArrayList<>();  
    
    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
    
    public int size() {
        return stackList.size();
    }
    
    public void push(T value) {
    	stackList.add(value);
    }
    
    public static void main(String[] args) {
		StackPush<Integer> spt = new StackPush<Integer>();
		spt.push(10);
		spt.push(11);
		spt.printStack();
		}

}
