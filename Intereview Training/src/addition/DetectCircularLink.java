package addition;

import java.util.HashSet;

/**
 *
 * @author hkhoi
 */
public class DetectCircularLink implements Runnable {

    @Override
    public void run() {
        Node[] nodes = new Node[9];
        for (int i = 0; i < 9; ++i) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < 8; ++i) {
            nodes[i].next = nodes[i + 1];
        }

        nodes[8].next = nodes[6];

        System.out.println(detect(nodes[0]));
        System.out.println(detect2(nodes[0]));
    }

    private Node detect(Node root) {
        HashSet<Node> visited = new HashSet<>();
        Node iterator = root;
        while (iterator != null) {
            if (visited.contains(iterator)) {
                return iterator;
            }

            visited.add(iterator);

            iterator = iterator.next;
        }
        return null;
    }   // O(n)

    private Node detect2(Node root) {
        Node testNode = root;

        do {        // n

            Node fastRunner = testNode;
            Node slowRunner = testNode;

            do {    // n
                fastRunner = fastRunner.next.next;
                slowRunner = slowRunner.next;
            } while (slowRunner != fastRunner);
            
            if (fastRunner == testNode) {
                break;
            }
            
            testNode = testNode.next;
        } while (true); // n
    
        return testNode;
    }   // O(n^3)

    private class Node {

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        private final int value;
        private Node next;

        @Override
        public String toString() {
            return "Node{" + "value=" + value + '}';
        }
    }
}
