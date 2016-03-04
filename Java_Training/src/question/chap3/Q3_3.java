package question.chap3;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author hkhoi
 */
public class Q3_3 {

    private final LinkedList<Stack<Integer>> stacks;
    private final int capacity;

    public Q3_3(int capacity) {
        stacks = new LinkedList<>();
        this.capacity = capacity;
    }

    public void push(int value) {
        if (stacks.isEmpty() || stacks.getLast().size() >= capacity) {
            stacks.add(new Stack<>());
        }
        stacks.getLast().add(value);
    }

    public int pop() {
        int result = stacks.getLast().pop();
        if (stacks.getLast().isEmpty()) {
            stacks.removeLast();
        }
        return result;
    }

    public int popAt(int subStack) {
        int result = stacks.get(subStack).pop();
        if (stacks.get(subStack).isEmpty()) {
            stacks.remove(subStack);
        }
        return result;
    }
    
    @Override
    public String toString() {
        return "Q3_3{" + "stacks=" + stacks + ", capacity=" + capacity + '}';
    }
}
