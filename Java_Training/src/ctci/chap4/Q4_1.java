package ctci.chap4;

import implementation.non_linear.BinaryNode;

/**
 *
 * @author hkhoi
 */
public class Q4_1 {
    public boolean isBalanced(BinaryNode node) {
        if (node == null) {
            return true;
        }
        
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());
        
        return (Math.abs(leftHeight - rightHeight) <= 1 &&
                isBalanced(node.getLeft()) &&
                isBalanced(node.getRight()));
    }

    public int height(BinaryNode node) {
        if (node == null) {
            return -1;
        }
        
        int left = 1 + height(node.getLeft());
        int right = 1 + height(node.getRight());
        
        return Math.max(left, right);
    }
}
