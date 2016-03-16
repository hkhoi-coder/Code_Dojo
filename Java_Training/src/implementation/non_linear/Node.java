package implementation.non_linear;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 *
 * @author hkhoi
 */
public class Node {

    protected final int value;
    protected final List<Node> children;

    public Node(int value) {
        this.value = value;
        children = new ArrayList<>();
    }

    public void addNode(Node node) {
        children.add(node);
    }
    
    public List<Node> getChildren() {
        return children;
    }

    public int getValue() {
        return value;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    public String DFSPreOrder() {
        StringBuilder builder = new StringBuilder();
        HashSet<Node> visited = new HashSet<>();

        DFSPreOrder(builder, visited);

        return builder.toString();
    }

    public String BFS() {
        StringBuilder builder = new StringBuilder();
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            builder.append(cur.getValue()).append(", ");
            visited.add(cur);
            for (Node it : cur.getChildren()) {
                if (!visited.contains(it)) {
                    queue.add(it);
                }
            }
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder childrenBuilder = new StringBuilder();
        for (Node it : children) {
            if (it != null) {
                childrenBuilder.append(it.getValue()).append(", ");
            }
        }
        return "Node{" + "value=" + value + ", children=" + childrenBuilder + '}';
    }

    private void DFSPreOrder(StringBuilder builder, HashSet<Node> visited) {
        builder.append(value).append(", ");
        visited.add(this);

        for (Node it : children) {
            if (!visited.contains(it)) {
                it.DFSPreOrder(builder, visited);
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.value;
        hash = 97 * hash + Objects.hashCode(this.children);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (this.value != other.value) {
            return false;
        }
        if (!Objects.equals(this.children, other.children)) {
            return false;
        }
        return true;
    }
}
