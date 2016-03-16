package ctci.chap2;

import implementation.LinkedList;
import implementation.LinkedList.Node;
import java.util.HashSet;

/**
 *
 * @author hkhoi
 */
public class Q2_6 {
    public LinkedList.Node loopDetector(Node node) {
        HashSet<Integer> existed = new HashSet<>();
        while (node != null) {
            if (existed.contains(node.hashCode())) {
                return node;
            } else {
                existed.add(node.hashCode());
            }
            node = node.getNext();
        }
        return null;
    }
}
