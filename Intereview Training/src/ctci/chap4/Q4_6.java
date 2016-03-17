package ctci.chap4;

import implementation.non_linear.BinaryNode;

/**
 *
 * @author hkhoi
 */
public class Q4_6 {
    public BinaryNode getNextInOrder(BinaryNode node) {
        if (node.getRight() != null) {
            return node.getRight().getLeftMostChild();
        }
        
        if (node.isLeftChild()) {
            return node.getParent();
        } else {
            BinaryNode firstLeft = node.getFirstLeftParent();//.getParent();
            if (firstLeft != null) {
                return firstLeft.getParent();
            } else {
                return null;
            }
        }
    }
}
