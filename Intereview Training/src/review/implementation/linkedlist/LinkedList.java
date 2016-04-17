package review.implementation.linkedlist;

import java.util.Iterator;

/**
 *
 * @author hkhoi
 */
public class LinkedList implements Iterable<Integer> {

    private Node root;

    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node toAdd = new Node(value);
        Node oldRoot = root;
        root = toAdd;
        root.next = oldRoot;
        if (tail == null) {
            tail = root;
        }
        size += 1;
    }

    public void addLast(int value) {
        Node toAdd = new Node(value);
        if (tail == null) {
            tail = toAdd;
        } else {
            tail.next = toAdd;
            tail = tail.next;
        }
        if (root == null) {
            root = tail;
        }
        size += 1;
    }

    public void add(int value, int pos) {
        Node toAdd = new Node(value);
        if (pos == 0) {
            addFirst(value);
        } else {
            Node iterator = root;
            for (int i = 1; i < pos; ++i) {
                iterator = iterator.next;
            }
            Node nextNext = iterator.next;
            iterator.next = toAdd;
            toAdd.next = nextNext;
        }
        size += 1;
    }

    public void removeFirst() {
        if (root == tail) {
            root = tail = null;
        } else {
            root = root.next;
        }
        size -= 1;
    }

    public void removeLast() {
        if (tail == root) {
            tail = root = null;
        } else {
            Node iterator = root;
            while (iterator.next != tail) {
                tail = iterator;
                tail.next = null;
            }
        }
        size -= 1;
    }

    public void remove(int position) {
        if (position == 0) {
            removeFirst();
        } else {
            Node iterator = root;
            for (int i = 1; i < position; ++i) {
                iterator = iterator.next;
            }
            Node nextNext = iterator.next.next;
            iterator.next = nextNext;
        }
        size -= 1;
    }

    public void reverse() {
        if (root == tail) {
            return;
        }
        
        Node newRoot = root;
        root = root.next;
        newRoot.next = null;
        
        while (root != null) {
            Node cur = root;
            root = root.next;
            cur.next = newRoot;
            newRoot = cur;
        }

        root = newRoot;
    }

    public void removeValue(int value) {
        if (root == null) {
            return;
        }

        if (root.value == value) {
            removeFirst();
        } else {
            Node iterator = root;
            while (iterator.next != null && iterator.next.value != value) {
                iterator = iterator.next;
            }

            if (iterator.next != null) {
                Node nextNext = iterator.next.next;
                iterator.next = nextNext;
            }
        }
        size -= 1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i : this) {
            result
                    .append(i)
                    .append(" ");
        }

        return result.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer> {

        Node current = root;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            int result = current.value;
            current = current.next;
            return result;
        }
    }

    private class Node {

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        private int value;
        private Node next;
    }
}
