package implementation.non_linear;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/**
 *
 * @author hkhoi
 */
public class BinaryNode {

    protected int value;
    protected BinaryNode left, right, parent;

    public BinaryNode(int value) {
        this.value = value;
    }

    public void addLeft(BinaryNode node) {
        left = node;
        node.parent = this;
    }

    public void addRight(BinaryNode node) {
        right = node;
        node.parent = this;
    }

    public void BFS() {
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            BinaryNode cur = queue.poll();
            System.out.print(cur.value + ", ");
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        System.out.println();
    }

    public void DFS_PreOrder() {
        System.out.print(value + ", ");
        if (left != null) {
            left.DFS_PreOrder();
        }
        if (right != null) {
            right.DFS_PreOrder();
        }
    }

    public void DFS_InOrder() {
        if (left != null) {
            left.DFS_InOrder();
        }
        System.out.print(value + ", ");
        if (right != null) {
            right.DFS_InOrder();
        }
    }

    public void DFS_PostOrder() {
        if (left != null) {
            left.DFS_PostOrder();
        }
        if (right != null) {
            right.DFS_PostOrder();
        }
        System.out.print(value + ", ");
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public BinaryNode getParent() {
        return parent;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BinaryNode{" + "value=" + value + ", left=" + left + ", right=" + right + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.value;
        hash = 41 * hash + Objects.hashCode(this.left);
        hash = 41 * hash + Objects.hashCode(this.right);
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
        final BinaryNode other = (BinaryNode) obj;
        if (this.value != other.value) {
            return false;
        }
        if (!Objects.equals(this.left, other.left)) {
            return false;
        }
        if (!Objects.equals(this.right, other.right)) {
            return false;
        }
        return true;
    }

    public BinaryNode getLeftMostChild() {
        BinaryNode iterator = this;
        while (iterator.left != null) {
            iterator = iterator.left;
        }

        return iterator;
    }

    public boolean isLeftChild() {
        if (parent == null) {
            return false;
        }
        return parent.left == this;
    }

    public BinaryNode getFirstLeftParent() {
        BinaryNode iterator = this;
        while (iterator != null && !iterator.isLeftChild()) {
            iterator = iterator.parent;
        }

        return iterator;
    }
    
    public boolean contains(BinaryNode target) {
        Queue<BinaryNode> queue = new ArrayDeque<>();
        
        queue.add(this);
        while (!queue.isEmpty()) {
            BinaryNode cur = queue.poll();
            if (cur.equals(target)) {
                return true;
            }
            
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        
        return false;
    }
}
