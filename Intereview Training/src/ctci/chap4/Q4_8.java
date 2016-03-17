package ctci.chap4;

import implementation.non_linear.BinaryNode;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author hkhoi
 */
public class Q4_8 {
    public boolean isSubTree(BinaryNode parent, BinaryNode child) {
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.add(parent);
        while (!queue.isEmpty()) {
            BinaryNode current = queue.poll();
            if (current.getValue() == child.getValue()) {
                if (treeMatch(current, child)) {
                    return true;
                }
            }
            
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
        
        return false;
    }

    private boolean treeMatch(BinaryNode parent, BinaryNode child) {
        if (child == null) {
            return true;
        }
        if (parent == null && child != null) {
            return false;
        }
        
        return parent.getValue() == child.getValue()
                && treeMatch(parent.getLeft(), child.getLeft())
                && treeMatch(parent.getRight(), child.getRight());
    }
}
