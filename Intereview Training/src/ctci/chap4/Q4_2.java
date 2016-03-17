package ctci.chap4;

import implementation.non_linear.Node;
import java.util.HashSet;
/**
 *
 * @author hkhoi
 */
public class Q4_2 {
    
    public boolean isThereRoute(Node node0, Node node1) {
        HashSet<Node> visited = new HashSet<>();
        DFS(node0, node1, visited);
        
        return visited.contains(node1);
    }

    private void DFS(Node cur, Node target, HashSet<Node> visited) {
        visited.add(cur);
        
        if (cur.equals(target)) {
            return;
        }
        
        for (Node it : cur.getChildren()) {
            if (!visited.contains(it)) {
                DFS(it, target, visited);
            }
        }
    }
}
