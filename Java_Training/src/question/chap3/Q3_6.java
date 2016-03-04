package question.chap3;

import java.util.Stack;

/**
 *
 * @author hkhoi
 */
public class Q3_6 implements Runnable {

    private final Stack<Integer> stack;

    public Q3_6(Stack<Integer> stack) {
        this.stack = stack;
        run();
    }

    @Override
    public void run() {
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }

        Stack<Integer> tempStack = new Stack<>();
        int holder = 0;

        while (!stack.isEmpty()) {
            while (tempStack.isEmpty() || tempStack.peek() >= stack.peek()) {
                tempStack.push(stack.pop());
                if (stack.isEmpty()) {
                    break;
                }
            }
            
            if (stack.isEmpty()) {
                break;
            } else {
                holder = stack.pop();
                boolean isHolding = true;
                while (isHolding || !tempStack.isEmpty()) {
                    if (tempStack.isEmpty()) {
                        stack.push(holder);
                        isHolding = false;
                    } else if (!isHolding) {
                        stack.push(tempStack.pop());
                    } else {
                        if (holder <= tempStack.peek()) {
                            stack.push(holder);
                            isHolding = false;
                        } else {
                            stack.push(tempStack.pop());
                        }
                    }
                }
            }
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}   // O(n^2)
