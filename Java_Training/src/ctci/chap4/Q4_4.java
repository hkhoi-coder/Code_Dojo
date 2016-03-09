package ctci.chap4;

import implementation.non_linear.BinaryNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author hkhoi
 */
public class Q4_4 {
    
    public List<LinkedList<Integer>> getLinkedList(BinaryNode root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        Queue<BinaryNode> queue = new ArrayDeque<>();
        
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> currentLevel = new LinkedList<>();
            Queue<BinaryNode> save = new ArrayDeque<>();
            while (!queue.isEmpty()) {
                BinaryNode curNode = queue.poll();
                save.add(curNode);
                currentLevel.add(curNode.getValue());
            }
            while (!save.isEmpty()) {
                BinaryNode curNode = save.poll();
                if (curNode.getLeft() != null) {
                    queue.add(curNode.getLeft());
                }
                if (curNode.getRight() != null) {
                    queue.add(curNode.getRight());
                }
            }
            result.add(currentLevel);
        }
        
        return result;
    }
}
