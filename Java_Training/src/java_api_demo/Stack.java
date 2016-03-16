package java_api_demo;

/**
 *
 * @author hkhoi
 */
public class Stack implements Runnable {

    @Override
    public void run() {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.sort(null);
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
