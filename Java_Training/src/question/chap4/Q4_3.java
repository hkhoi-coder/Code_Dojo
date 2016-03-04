package question.chap4;

import implementation.non_linear.BinaryNode;

/**
 *
 * @author hkhoi
 */
public class Q4_3 {
    public BinaryNode optimalBinaryNode(int[] array) {
        return optimalBinaryNode(array, 0, array.length - 1);
    }

    private BinaryNode optimalBinaryNode(int[] array, int left, int right) {
        if (left > right) {
            return null;
        }
        
        int mid = (left + right) / 2;
        BinaryNode node = new BinaryNode(array[mid]);
        node.addLeft(optimalBinaryNode(array, left, mid - 1));
        node.addRight(optimalBinaryNode(array, mid + 1, right));
        
        return node;
    }
}
