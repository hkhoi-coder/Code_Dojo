package question.chap4;

import implementation.non_linear.BinaryNode;

/**
 *
 * @author hkhoi
 */
public class Q4_5 {
    
    public boolean isBinarySearchTree(BinaryNode node) {
        return isBinaryImp(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinaryImp(BinaryNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        
        return node.getValue() <= max &&
                node.getValue() > min &&
                isBinaryImp(node.getLeft(), min, node.getValue()) &&
                isBinaryImp(node.getRight(), node.getValue(), max);
    }
}
