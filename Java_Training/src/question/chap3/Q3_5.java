package question.chap3;

import java.util.Stack;

/**
 *
 * @author hkhoi
 */
public class Q3_5 {

    private final Stack<Integer> add = new Stack<>();
    private final Stack<Integer> poll = new Stack<>();

    public void add(int value) {
        if (add.isEmpty()) {
            while (!poll.isEmpty()) {
                add.push(poll.pop());
            }
        }
        add.push(value);
    }   // O(n)

    public int poll() {
        if (poll.isEmpty()) {
            while (!add.isEmpty()) {
                poll.push(add.pop());
            }
        }
        return poll.pop();
    }   // O(n)

    @Override
    public String toString() {
        return "Q3_5{" + "add=" + add + ", poll=" + poll + '}';
    }
}
