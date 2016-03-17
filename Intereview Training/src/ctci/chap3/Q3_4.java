package ctci.chap3;

import java.util.Stack;

/**
 *
 * @author hkhoi
 */
public class Q3_4 implements Runnable {

    private final Stack<Integer> stack0;
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public Q3_4(Stack<Integer> stack0, Stack<Integer> stack1, Stack<Integer> stack2) {
        this.stack0 = stack0;
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    @Override
    public void run() {
        solve(stack0.size(), stack0, stack1, stack2);
    }

    private void solve(int num, Stack<Integer> stack0, 
            Stack<Integer> stack1, Stack<Integer> stack2) {
        if (num == 1) {
            move(stack0, stack2);
        } else {
            solve(num - 1, stack0, stack2, stack1);
            move(stack0, stack2);
            solve(num - 1, stack1, stack0, stack2);
        }
    }

    private void move(Stack<Integer> stack0, Stack<Integer> stack1) {
        stack1.push(stack0.pop());
    }
}
