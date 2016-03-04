package driver;

import implementation.non_linear.BinaryNode;
import question.chap4.Q4_7;

/**
 *
 * @author hkhoi
 */
public class Main {
    public static void main(String[] args) {
        BinaryNode[] nodes = new BinaryNode[13];
        for (int i = 0; i < nodes.length; ++i) {
            nodes[i] = new BinaryNode(i);
        }
        
        nodes[0].addLeft(nodes[1]);
        nodes[0].addRight(nodes[2]);
        nodes[1].addLeft(nodes[3]);
        nodes[1].addRight(nodes[4]);
        nodes[2].addLeft(nodes[5]);
        nodes[2].addRight(nodes[6]);
        nodes[3].addLeft(nodes[7]);
        nodes[4].addLeft(nodes[8]);
        nodes[4].addRight(nodes[9]);
        nodes[5].addLeft(nodes[10]);
        nodes[8].addLeft(nodes[11]);
        nodes[8].addRight(nodes[12]);
        
        Q4_7 solve = new Q4_7();
        BinaryNode result = solve.lowestCommonAncestor(nodes[7], nodes[4]);
        System.out.println(result.getValue());
//        System.out.println(nodes[12]);
    }
}
