package question.chap4;

import implementation.non_linear.BinaryNode;

/**
 *
 * @author hkhoi
 */
public class Q4_7 {
    public BinaryNode lowestCommonAncestor(BinaryNode node0, BinaryNode node1) {
        boolean searchLeft = true;
        boolean searchRight = true;

        while (node0 != null) {
            if (node0.equals(node1)) {
                return node0;
            }
            
            if (searchLeft && node0.getLeft() != null) {
                if (node0.getLeft().contains(node1)) {
                    return node0;
                }
            }
            if (searchRight && node0.getRight() != null) {
                if (node0.getRight().contains(node1)) {
                    return node0;
                }
            }
            
            if (node0.isLeftChild()) {
                searchLeft = false;
                searchRight = true;
            } else {
                searchLeft = true;
                searchRight = false;
            }
            node0 = node0.getParent();
        }
        
        return null;
    }
}
