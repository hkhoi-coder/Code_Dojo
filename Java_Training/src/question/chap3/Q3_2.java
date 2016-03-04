package question.chap3;

import implementation.stack.ArrayStack;

/**
 *
 * @author hkhoi
 */
public class Q3_2 extends ArrayStack {

    private int[] minStack;
    private int min = Integer.MAX_VALUE;
    public Q3_2(int capacity) {
        super(capacity);
        minStack = new int[capacity];
    }
    
    @Override
    public boolean push(int value) {
        min = Math.min(min, value);
        if (super.push(value)) {
            minStack[pointer] = min;
            return true;
        }
        return false;
    }

    public int min() {
        return minStack[pointer];
    }
}
