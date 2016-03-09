package driver;

import ctci.chap4.Q4_8;
import implementation.non_linear.BinaryNode;

/**
 *
 * @author hkhoi
 */
public class Main {

    static BinaryNode[] nodes = new BinaryNode[14];
    static BinaryNode[] children = new BinaryNode[4];

    static {
        for (int i = 0; i < nodes.length; ++i) {
            nodes[i] = new BinaryNode(i);
        }
        add(nodes, 0, 1, 2);
        add(nodes, 1, 3, 4);
        add(nodes, 2, 5, 6);
        add(nodes, 3, 7, 8);
        add(nodes, 5, 9, 10);
        add(nodes, 9, 11, 12);
        add(nodes, 10, -1, 13);

        children[0] = new BinaryNode(5);
        children[1] = new BinaryNode(9);
        children[2] = new BinaryNode(10);
        children[3] = new BinaryNode(13);
        
        add(children, 0, 1, 2);
        add(children, 2, -1, 3);

    }

    private static void add(BinaryNode[] myNodes, int root, int a, int b) {
        if (a >= 0) {
            myNodes[root].addLeft(myNodes[a]);
        }
        if (b >= 0) {
            myNodes[root].addRight(myNodes[b]);
        }
    }

    public static void main(String[] args) {
        Q4_8 solve = new Q4_8();
        System.out.println(solve.isSubTree(nodes[0], children[0]));
    }
}
