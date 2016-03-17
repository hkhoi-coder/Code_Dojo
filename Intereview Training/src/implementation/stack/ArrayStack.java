package implementation.stack;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class ArrayStack {

    protected int capacity;
    protected int[] data;
    protected int pointer = -1;
    
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }
    
    public boolean push(int value) {
        if (pointer + 1 < capacity) {
            data[++pointer] = value;   
            return true;
        }        
        return false;
    }
    
    public int pop() {
        if (pointer >= 0) {
            return data[pointer--];
        }
        return Integer.MIN_VALUE;
    }
    
    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        return "ArrayStack{" + "capacity=" + capacity + "\ndata=" + Arrays.toString(data) + "\npointer=" + pointer + '}';
    }
}
