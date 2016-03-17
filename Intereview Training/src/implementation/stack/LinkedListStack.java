package implementation.stack;

import implementation.LinkedList;

/**
 *
 * @author hkhoi
 */
public class LinkedListStack extends LinkedList{
    public void push(int value) {
        addFirst(value);
    }
    
    public int pop() {
        int value = root.getValue();
        removeFirst();
        
        return value;
    }
}
